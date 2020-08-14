package com.example.study;

import com.example.study.models.User;
import com.example.study.services.LoginService;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) { SpringApplication.run(StudyApplication.class, args); }
}
