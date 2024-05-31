package com.spring_boot_project.thoughtworks.response;

import java.util.Date;

public class ErrorMessage {
    private Date timestamp;
    private String message;
    private ErrorMessage() {

    }

    public ErrorMessage(Date timestamp, String message) {
        this.timestamp =timestamp;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
