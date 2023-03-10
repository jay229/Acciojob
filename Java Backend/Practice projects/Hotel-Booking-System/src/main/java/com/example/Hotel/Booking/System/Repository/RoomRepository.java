package com.example.Hotel.Booking.System.Repository;

import com.example.Hotel.Booking.System.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {
    public List<Room> findByAvailableTrue();

}
