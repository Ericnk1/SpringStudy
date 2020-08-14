package com.example.study.controllers;

import com.example.study.models.User;
import com.example.study.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String showAllUserPage(@ModelAttribute("user") User user, @ModelAttribute("message") String message,
                                  @ModelAttribute("messageType") String messageType) {
        return "user/user-list";
    }

    @PostMapping
    public String postLogin(User user, RedirectAttributes redirectAttributes) {
        return null;



    }
}
