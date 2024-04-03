package com.micro.hotel.HotelService.services.implementations;

import com.micro.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.micro.hotel.HotelService.models.Hotel;
import com.micro.hotel.HotelService.repository.HotelRepo;
import com.micro.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepo hotelRepo;


    @Override
    public Hotel createHotel(Hotel hotel) {
        hotel.setId(UUID.randomUUID().toString());
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getById(String hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel not Found with Id: "+hotelId));
    }
}
