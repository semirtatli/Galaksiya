package com.Galaksiya.ws.service;

import com.Galaksiya.ws.model.Users;
import com.Galaksiya.ws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;


//Encapsulation for userRepository
@Service
public class UserService {
    //dependency injection to reach methods at UserRepository from UserService
    @Autowired
    UserRepository userRepository;


    PasswordEncoder passwordEncoder;

//password Encoder encodes password to hold in database


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public void save(Users user) {
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);

    }

    public List<Users> findAll(){
        return userRepository.findAll();
    }

    public Optional<Users> findById(Long id) {
        return userRepository.findById(id);
    }

    public void delete(Users user) {
        userRepository.delete(user);
    }
}
