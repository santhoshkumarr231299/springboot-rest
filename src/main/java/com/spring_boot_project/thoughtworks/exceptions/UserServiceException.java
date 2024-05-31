package com.spring_boot_project.thoughtworks.exceptions;

public class UserServiceException extends RuntimeException{
    public UserServiceException(String message) {
        super(message);
    }
}
