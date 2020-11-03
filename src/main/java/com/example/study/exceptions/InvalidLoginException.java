package com.example.study.exceptions;

public class InvalidLoginException extends Exception{
    public InvalidLoginException(String username) {
        super("invalid login credential for username: " + username);
    }
}
