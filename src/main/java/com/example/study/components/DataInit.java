package com.example.study.components;

import com.example.study.models.School;
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
        initSchoolData();
        initUserData();
    }

    private void initUserData(){
        User user = new User();
        user.setUsername("ericnk1@live.com");
        user.setPassword("09876");

        if (!userService.findUserByUsername(user.getUsername()).isPresent()) {
            userService.createUser(user);
        }
    }

    private void initSchoolData() {
        School school = new School();
        school.setName("Tallinn International school");
        school.setCity("Tallinn");
        school.setPhone("94856735");
    }
}
