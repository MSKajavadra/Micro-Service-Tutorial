package com.micro.user.service.UserService.services.implementations;

import com.micro.user.service.UserService.exceptions.ResourceNotFoundException;
import com.micro.user.service.UserService.external.services.HotelService;
import com.micro.user.service.UserService.external.services.RatingService;
import com.micro.user.service.UserService.models.Hotel;
import com.micro.user.service.UserService.models.Ratings;
import com.micro.user.service.UserService.models.User;
import com.micro.user.service.UserService.repository.UserRepo;
import com.micro.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;
    @Autowired
    private RatingService ratingService;

    @Override
    public User saveUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(String userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found with id: "+userId));
//        Ratings[] ratings = restTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+userId, Ratings[].class);
        List<Ratings> ratings=ratingService.getRatingsByUserId(userId);

        List<Ratings> ratingsList=ratings.stream().map(rating -> {
//            ResponseEntity<Hotel> hotel = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
//            rating.setHotel(hotel.getBody());

            Hotel hotel = hotelService.getHotel(rating.getHotelId());
            rating.setHotel(hotel);
            return rating;
        }).toList();

        user.setRatings(ratingsList);
        return user;
    }
}
