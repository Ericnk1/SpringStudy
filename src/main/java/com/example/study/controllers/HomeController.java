package com.example.study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String showHomePage(Model model, @ModelAttribute("message") String message,
                               @ModelAttribute("messageType") String messageType){
        boolean isLoggedIn = false;

        if (messageType.equals("success")){
            isLoggedIn = true;
        }

        model.addAttribute("isLoggedIn", isLoggedIn);
        return "home";
    }


}
