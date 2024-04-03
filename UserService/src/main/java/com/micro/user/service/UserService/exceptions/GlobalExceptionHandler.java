package com.micro.user.service.UserService.exceptions;

import com.micro.user.service.UserService.payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException exception){
        return new ResponseEntity<>(new ApiResponse(exception.getMessage(),false),HttpStatus.NOT_FOUND);
    }
}
