package com.example.study.services;

import com.example.study.exceptions.InvalidLoginException;
import com.example.study.models.Login;
import com.example.study.models.User;

public interface LoginService {
    /**
     * To check whether the login is valid or not
     *
     * @param login login
     */
    void validateLogin(Login login) throws InvalidLoginException;
}
