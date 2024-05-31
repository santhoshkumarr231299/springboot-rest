package com.spring_boot_project.thoughtworks.model;


public class UserRest {
    String firstName;
    String lastName;
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
