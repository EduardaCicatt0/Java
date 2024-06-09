package com.ifruitcommerce.ifruit.services;

import com.ifruitcommerce.ifruit.entities.User;
import com.ifruitcommerce.ifruit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }
}
