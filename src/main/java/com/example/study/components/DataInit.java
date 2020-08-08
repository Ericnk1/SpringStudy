package com.example.study.components;

import com.example.study.models.User;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataInit {
    @Autowired
    private UserService userService;
    @PostConstruct
    public void initData(){
        initUserData();
    }

    private void initUserData(){
        User user = new User();
        user.setUsername("eric");
        user.setPassword("123");
        userService.createUser(user);
    }
}
