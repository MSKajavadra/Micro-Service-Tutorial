package com.micro.rating.RatingService.controllers;

import com.micro.rating.RatingService.models.Rating;
import com.micro.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingControllers {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return new ResponseEntity<>(ratingService.createRating(rating), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return new ResponseEntity<>(ratingService.getAllRating(),HttpStatus.OK);
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable String userId){
        return new ResponseEntity<>(ratingService.getAllByUserId(userId),HttpStatus.OK);
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllByHotelId(@PathVariable String hotelId){
        return new ResponseEntity<>(ratingService.getAllByHotelId(hotelId),HttpStatus.OK);
    }
}
