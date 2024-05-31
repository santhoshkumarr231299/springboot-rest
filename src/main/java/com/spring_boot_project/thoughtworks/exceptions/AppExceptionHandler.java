package com.spring_boot_project.thoughtworks.exceptions;

import com.spring_boot_project.thoughtworks.response.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.handler.ResponseStatusExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class AppExceptionHandler extends ResponseStatusExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest webRequest) {
        String errorMessageDesc = ex.getLocalizedMessage();

        if(errorMessageDesc == null) errorMessageDesc = ex.toString();
        ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDesc);

        return new ResponseEntity<>(
                ex,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(value = {NullPointerException.class, UserServiceException.class})
    public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest webRequest) {
        String errorMessageDesc = ex.getLocalizedMessage();

        if(errorMessageDesc == null) errorMessageDesc = ex.toString();
        ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDesc);

        return new ResponseEntity<>(
                ex,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(value = {UserServiceException.class})
    public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest webRequest) {
        String errorMessageDesc = ex.getLocalizedMessage();

        if(errorMessageDesc == null) errorMessageDesc = ex.toString();
        ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDesc);

        return new ResponseEntity<>(
                ex,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
