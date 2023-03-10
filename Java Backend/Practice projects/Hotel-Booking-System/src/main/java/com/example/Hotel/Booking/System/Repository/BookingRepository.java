package com.example.Hotel.Booking.System.Repository;

import com.example.Hotel.Booking.System.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
    public Booking findByUserId(int userId);
}
