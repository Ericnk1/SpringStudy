package com.example.study.services.implimentations;


import com.example.study.components.DataInit;
import com.example.study.models.School;
import com.example.study.models.User;
import com.example.study.repositories.SchoolRepository;
import com.example.study.repositories.UserRepository;
import com.example.study.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of LoginService
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public boolean isLoginValid(User user) {
        return userRepository.findAll().stream()
                .anyMatch(user1 -> user1.getUsername().equals(user.getUsername()) && user1.getPassword().equals(user.getPassword()));
    }

}
