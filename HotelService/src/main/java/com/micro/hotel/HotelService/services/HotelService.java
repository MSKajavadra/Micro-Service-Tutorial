package com.micro.hotel.HotelService.services;

import com.micro.hotel.HotelService.models.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel getById(String hotelId);
}
