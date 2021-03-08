package com.example.study.services.implementations;


import com.example.study.exceptions.InvalidLoginException;
import com.example.study.models.Login;
import com.example.study.models.User;
import com.example.study.services.LoginService;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation of LoginService
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
   /* @Autowired
    private UserRepository userRepository;*/

    @Autowired
    private UserService userService;


    @Override
    public void validateLogin(Login login) throws InvalidLoginException {
        /*return userRepository.findAll().stream()
                .anyMatch(user1 -> user1.getUsername().equals(login.getUsername()) && user1.getPassword().equals(login.getPassword()));*/
        Optional<User> userOptional = userService.findByUsernameAndPassword(login.getUsername(), login.getPassword());

        if (!userOptional.isPresent()){
            throw new InvalidLoginException(login.getUsername());
        }
    }

}
