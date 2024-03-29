package com.Galaksiya.ws.unique_username;

import com.Galaksiya.ws.model.Users;
import com.Galaksiya.ws.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
// dependency injection
    @Autowired
UserRepository userRepository;
//if userName is used turn isValid
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if(userRepository!=null){
            Users user = userRepository.findByUsername(username);
            if(user != null){
                return false;
            }
        }
        return true;
    }

}
