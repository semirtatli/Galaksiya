package com.Galaksiya.ws.auth;

import java.util.Base64;

import com.Galaksiya.ws.error.ApiError;
import com.Galaksiya.ws.model.Users;
import com.Galaksiya.ws.shared.Views;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.Galaksiya.ws.repository.UserRepository;

@RestController
public class AuthController {

    @Autowired
    UserRepository userRepository;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @PostMapping("/api/1.0/auth")
    @JsonView(Views.Base.class)
    ResponseEntity<?> handleAuthentication(@RequestHeader(name="Authorization", required = false) String authorization) {
        if(authorization == null) {
            // if no Authorization header turn 401
            ApiError error = new ApiError(401, "Unauthorized request", "/api/1.0/auth");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
        }
        // Change basic Authorization header
        String base64encoded = authorization.split("Basic ")[1]; // dXNlcjE6UDRzc3dvcmQ=
        String decoded = new String(Base64.getDecoder().decode(base64encoded)); // user1:P4ssword
        String[] parts = decoded.split(":"); // ["user1", "P4ssword"]
        String username = parts[0];
        String password = parts[1];
        Users inDB = userRepository.findByUsername(username);
        // if no user found turn 401
        if (inDB == null) {
            ApiError error = new ApiError(404, "User not found", "/api/1.0/auth");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
        }
        // compare the input password and database data
        String hashedPassword = inDB.getPassword();
        if(!passwordEncoder.matches(password, hashedPassword)) {
            // if password is uncompatible turn 401
            ApiError error = new ApiError(401, "Unauthorized request", "/api/1.0/auth");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
        }
// if authorization is success turn as a response
        return ResponseEntity.ok(inDB);
    }

}