package com.micro.hotel.HotelService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}
