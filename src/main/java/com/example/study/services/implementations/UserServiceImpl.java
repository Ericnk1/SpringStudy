package com.example.study.services.implementations;

import com.example.study.models.Course;
import com.example.study.models.User;
import com.example.study.repositories.UserRepository;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void createUser(User user) {
        List<Course> courseList = new ArrayList<>();
        user.setCourse(courseList);
        user.setActive(true);
        userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getActiveUsers() {
        return getAllUsers().stream()
                .filter(User::isActive)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUserById(Long id) {
        findUserById(id).ifPresent(user -> {
            user.setActive(false);
            updateUser(user);
        });
    }

    @Override
    public void fullDeleteUserById(Long id) {
        findUserById(id).ifPresent(user -> {
            userRepository.delete(user);
        });
    }

    @Override
    public void restoreUserById(Long id) {
        findUserById(id).ifPresent(user -> {
            user.setActive(true);
            updateUser(user);
        });
    }
}
