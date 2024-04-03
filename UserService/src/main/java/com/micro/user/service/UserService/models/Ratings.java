package com.micro.user.service.UserService.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ratings {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
    private Hotel hotel;
}
