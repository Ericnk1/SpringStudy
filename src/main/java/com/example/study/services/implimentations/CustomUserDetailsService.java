package com.example.study.services.implimentations;

import com.example.study.models.User;
import com.example.study.services.CustomUserDetails;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

/**
 *
 */
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userService.findUserByUsername(username);
        if(!optionalUser.isPresent()){
            throw new UsernameNotFoundException("User not exists with username: " + username);
        };
        return new CustomUserDetails(optionalUser.get());
    }
}
