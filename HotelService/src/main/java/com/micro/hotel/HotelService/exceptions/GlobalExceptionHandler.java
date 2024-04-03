package com.micro.hotel.HotelService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handlerResourceNotFoundException(ResourceNotFoundException exception){
        Map<String,Object> map=new HashMap<>();
        map.put("message",exception.getMessage());
        map.put("success",false);
        return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
    }
}