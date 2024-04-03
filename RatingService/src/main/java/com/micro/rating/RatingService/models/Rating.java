package com.micro.rating.RatingService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {
    @Id
    private String id;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
