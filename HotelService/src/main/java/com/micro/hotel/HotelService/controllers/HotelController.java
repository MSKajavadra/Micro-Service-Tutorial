package com.micro.hotel.HotelService.controllers;

import com.micro.hotel.HotelService.models.Hotel;
import com.micro.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelService.createHotel(hotel), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return new ResponseEntity<>(hotelService.getAllHotel(), HttpStatus.OK);
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getById(@PathVariable String hotelId){
        return new ResponseEntity<>(hotelService.getById(hotelId), HttpStatus.OK);
    }
}
