package com.example.Hotel.Booking.System.Controller;

import com.example.Hotel.Booking.System.DTO.IssueRoomRequest;
import com.example.Hotel.Booking.System.Service.BookingService;
import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("booking")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping("bookRoom")
    public ResponseEntity bookRoom(@RequestBody IssueRoomRequest issueRoomRequest){
        String msg=bookingService.bookRoom(issueRoomRequest);
        return new ResponseEntity<>(msg, HttpStatus.ACCEPTED);
    }
    @GetMapping("/checkout")
    public ResponseEntity checkOutRoom(@RequestParam("adharNo") String adharNo){
        String msg=bookingService.checkOutRoom(adharNo);
        return new ResponseEntity<>(msg,HttpStatus.OK);


    }

}
