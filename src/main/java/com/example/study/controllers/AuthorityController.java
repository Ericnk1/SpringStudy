package com.example.study.controllers;

import com.example.study.models.Authority;
import com.example.study.services.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authority")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @PostMapping
    public ResponseEntity<?> createAuthority(@RequestBody Authority authority) {
        authorityService.createAuthority(authority);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping
    public List<Authority> showAuthorityList(Model model) {
        return authorityService.findAllAuthorities();
    }
}
