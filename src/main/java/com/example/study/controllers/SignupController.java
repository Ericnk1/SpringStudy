package com.example.study.controllers;

import com.example.study.models.User;
import com.example.study.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
public class SignupController {

    @Autowired
    private UserService userService;

/*    @Autowired
    private SchoolService schoolService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private AuthorityService authorityService;*/

    /*@GetMapping
    public String showSignupPage(@ModelAttribute("user") User user, @ModelAttribute("message") String message,
                                 @ModelAttribute("messageType") String messageType, Model model) {

        model.addAttribute("schools", schoolService.getAllSchools());
        model.addAttribute("courses", courseService.getAllCourses());
        model.addAttribute("authorities", authorityService.findAuthorities());
        return "auth/signup";
    }

    @PostMapping
    public String postLogin(User user, RedirectAttributes redirectAttributes) {
        boolean isUserExists = userService.findUserByUsername(user.getUsername()).isPresent();

        if (!isUserExists) {
            userService.createUser(user);
            redirectAttributes.addFlashAttribute("message", "Signup successful!");
            redirectAttributes.addFlashAttribute("messageType", "success");
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("message", "User already exists!");
            redirectAttributes.addFlashAttribute("messageType", "error");
            return "redirect:/signup";
        }
    }*/

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
