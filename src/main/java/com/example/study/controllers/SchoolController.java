package com.example.study.controllers;

import com.example.study.models.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/school")
public class SchoolController {

    @GetMapping
    public String showSignupPage(@ModelAttribute("school") School school, @ModelAttribute("message") String message,
                                 @ModelAttribute("messageType") String messageType) {
        return "school/school";
    }

    @PostMapping
    public String postLogin(School school, RedirectAttributes redirectAttributes) {

            return "redirect:/";

    }
}
