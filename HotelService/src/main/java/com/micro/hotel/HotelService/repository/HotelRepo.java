package com.micro.hotel.HotelService.repository;

import com.micro.hotel.HotelService.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,String > {
}
