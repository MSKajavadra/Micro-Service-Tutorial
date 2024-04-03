package com.micro.hotel.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mesasge) {
        super(mesasge);
    }
    public ResourceNotFoundException(){
        super("Resource Not Found Exception");
    }
}
