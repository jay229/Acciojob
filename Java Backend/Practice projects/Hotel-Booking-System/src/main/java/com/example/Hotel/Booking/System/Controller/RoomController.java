package com.example.Hotel.Booking.System.Controller;

import com.example.Hotel.Booking.System.DTO.IssueRoomRequest;
import com.example.Hotel.Booking.System.Model.Room;
import com.example.Hotel.Booking.System.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomService roomService;

    @PostMapping("/add")
    public ResponseEntity addRoom(@RequestBody Room room){
        String msg=roomService.addRoom(room);
        return new ResponseEntity<>(msg, HttpStatus.ACCEPTED);
    }
    @GetMapping("/availableRoomsNo")
    public ResponseEntity getAllAvailableRoomsNo(){
        List<Integer> roomNos=roomService.getAllAvailableRoomsNo();
        return new ResponseEntity<>(roomNos,HttpStatus.FOUND);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteRoom(@RequestParam("roomNo") int roomNo){
        String msg=roomService.deleteRoom(roomNo);
        return new ResponseEntity<>(msg,HttpStatus.MOVED_PERMANENTLY);
    }
//    @PostMapping("/bookRoom")
//    public ResponseEntity bookRoom(@RequestBody IssueRoomRequest issueRoomRequest){
//
//    }

}
