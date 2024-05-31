package com.spring_boot_project.thoughtworks.impl;

import com.spring_boot_project.thoughtworks.model.UserRest;
import com.spring_boot_project.thoughtworks.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserService userService;
    @Override
    public UserRest createUser(UserRest userRest) {
        return userService.createUser(userRest);
    }
}
