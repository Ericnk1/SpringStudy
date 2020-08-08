package com.example.study.services;

import com.example.study.models.User;

public interface LoginService {
    /**
     * To check whether the login is valid or not
     *
     * @param user User
     * @return true or false
     */
    boolean isLoginValid(User user);
}
