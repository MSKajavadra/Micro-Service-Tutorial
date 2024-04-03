package com.micro.user.service.UserService.external.services;

import com.micro.user.service.UserService.models.Ratings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
    @PostMapping("/ratings")
    Ratings createRating(Ratings ratings);
    @GetMapping("/ratings/hotels/{hotelId}")
    List<Ratings> getRatingsByHotelId(@PathVariable String hotelId);
    @GetMapping("/ratings/users/{userId}")
    List<Ratings> getRatingsByUserId(@PathVariable String userId);
}
