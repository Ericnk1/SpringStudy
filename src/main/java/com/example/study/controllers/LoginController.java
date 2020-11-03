package com.example.study.controllers;

import com.example.study.exceptions.InvalidLoginException;
import com.example.study.models.Login;
import com.example.study.models.User;
import com.example.study.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;


    @PostMapping
    public ResponseEntity<?> postLogin(@RequestBody Login login) throws InvalidLoginException {

        loginService.validateLogin(login);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
