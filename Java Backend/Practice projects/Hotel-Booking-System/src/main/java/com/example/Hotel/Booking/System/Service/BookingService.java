package com.example.Hotel.Booking.System.Service;

import com.example.Hotel.Booking.System.DTO.IssueRoomRequest;
import com.example.Hotel.Booking.System.Model.Booking;
import com.example.Hotel.Booking.System.Model.Room;
import com.example.Hotel.Booking.System.Model.User;
import com.example.Hotel.Booking.System.Repository.BookingRepository;
import com.example.Hotel.Booking.System.Repository.RoomRepository;
import com.example.Hotel.Booking.System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    UserRepository userRepository;

    public String bookRoom( IssueRoomRequest issueRoomRequest){
        User user=userRepository.findByAdharNo(issueRoomRequest.getAdharNo());
        Room room=roomRepository.findById(issueRoomRequest.getRoomNo()).get();
        Booking room1=new Booking();
        room1.setRoom(room);
        room1.setUser(user);
        room1.setTotalDaysOfBooking(issueRoomRequest.getForNoOfDays());
        room1.setTotalAmount(room.getRate()*room1.getTotalDaysOfBooking());
        room.setAvailable(false);
        roomRepository.save(room);
        userRepository.save(user);
        bookingRepository.save(room1);
        return "Room is booked successfully...";

    }
    public String checkOutRoom( String adharNo){
        int userId=userRepository.findByAdharNo(adharNo).getId();
        Booking bookedRoom=bookingRepository.findByUserId(userId);
        Room room=bookedRoom.getRoom();
        room.setAvailable(true);
        roomRepository.save(room);
        return "Now Room is available for booking";

    }
}
