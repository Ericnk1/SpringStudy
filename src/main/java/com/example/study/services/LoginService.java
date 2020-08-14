package com.example.study.services;

import com.example.study.models.Login;
import com.example.study.models.User;

public interface LoginService {
    /**
     * To check whether the login is valid or not
     *
     * @param login login
     * @return true or false
     */
    boolean isLoginValid(Login login);
}
