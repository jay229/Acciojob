package com.example.Hotel.Booking.System.Repository;

import com.example.Hotel.Booking.System.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByAdharNo(String adharNo);
}
