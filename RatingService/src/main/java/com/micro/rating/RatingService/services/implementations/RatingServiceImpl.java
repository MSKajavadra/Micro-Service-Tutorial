package com.micro.rating.RatingService.services.implementations;

import com.micro.rating.RatingService.models.Rating;
import com.micro.rating.RatingService.repository.RatingRepo;
import com.micro.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Rating createRating(Rating rating) {
        rating.setId(UUID.randomUUID().toString());
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getAllByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
