package com.micro.rating.RatingService.services;

import com.micro.rating.RatingService.models.Rating;

import java.util.List;

public interface RatingService {
    Rating createRating(Rating rating);
    List<Rating> getAllRating();
    List<Rating> getAllByUserId(String userId);
    List<Rating> getAllByHotelId(String hotelId);
}
