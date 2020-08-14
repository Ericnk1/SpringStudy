package com.example.study.services.implimentations;


import com.example.study.components.DataInit;
import com.example.study.models.Login;
import com.example.study.models.School;
import com.example.study.models.User;
import com.example.study.repositories.SchoolRepository;
import com.example.study.repositories.UserRepository;
import com.example.study.services.LoginService;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public boolean isLoginValid(Login login) {
        /*return userRepository.findAll().stream()
                .anyMatch(user1 -> user1.getUsername().equals(login.getUsername()) && user1.getPassword().equals(login.getPassword()));*/
        return userService.findByUsernameAndPassword(login.getUsername(), login.getPassword()).isPresent();
    }

}
