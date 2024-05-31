package com.spring_boot_project.thoughtworks.userservice;

import com.spring_boot_project.thoughtworks.model.UserRest;

public interface UserService {
    UserRest createUser(UserRest userRest);
}
