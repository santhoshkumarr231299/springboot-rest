package com.spring_boot_project.thoughtworks.controller;

import com.spring_boot_project.thoughtworks.exceptions.UserServiceException;
import com.spring_boot_project.thoughtworks.model.UserRest;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/get-users/{userId}")
    public String getUser(@PathVariable String userId, @RequestParam(required = false, defaultValue = 1) int page) {
        return "get user called : " + userId;
    }
    @PostMapping(value = "/create-user", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public UserRest createUser() {

    }
    @PutMapping("/update-user")
    public String updateUser() {
        if(true) throw new UserServiceException("Message");
        return "upadte user called";
    }
    @DeleteMapping("/delete-user")
    public String deleteUser() {
        return "delete user called";
    }
}
