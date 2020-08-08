package com.example.study.services;

import com.example.study.models.User;

public interface UserService {

    /**
     * To create a new user
     *
     * @param user
     */
    void createUser(User user);

    /**
     * To find user by username
     *
     * @param username User's username
     * @return true or false
     */
    boolean findUserByUsername(String username);
}

