package com.example.study.services;

import com.example.study.models.School;
import com.example.study.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    /**
     * To create a new user
     *
     * @param user User
     */
    void createUser(User user);

    /**
     * To find user by username
     *
     * @param username User's username
     * @return Optional of User
     */
    Optional<User> findUserByUsername(String username);
    /**
     * To find user by username and password
     *
     * @param username User's username
     * @param password User's username
     * @return Optional of user
     */
    Optional<User> findByUsernameAndPassword(String username, String password);


    /**
     * To get all users
     *
     * @return list of users
     */
    List<User> getAllUsers();

    /**
     * To get list of active users
     *
     * @return list of users
     */
    List<User> getActiveUsers();

    /**
     * To find user by id
     *
     * @param id User id
     * @return optional of user
     */
    Optional<User> findUserById(Long id);

    /**
     * To update an existing user
     *
     * @param user User
     */
    void updateUser(User user);

    /**
     * To delete user by id
     *
     * @param id User id
     */
    void deleteUserById(Long id);

    /**
     * To delete user from database completely by id
     *
     * @param id User id
     */
    void fullDeleteUserById(Long id);

    /**
     * To restore user by id
     *
     * @param id User id
     */
    void restoreUserById(Long id);
}

