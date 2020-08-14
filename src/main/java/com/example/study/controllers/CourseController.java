package com.example.study.controllers;

import com.example.study.models.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/course")
public class CourseController {

    @GetMapping
    public String showSignupPage(@ModelAttribute("course") Course course, @ModelAttribute("message") String message,
                                 @ModelAttribute("messageType") String messageType) {
        return "school/course";
    }

    @PostMapping
    public String postLogin(Course course, RedirectAttributes redirectAttributes) {

        return "redirect:/";

    }
}
