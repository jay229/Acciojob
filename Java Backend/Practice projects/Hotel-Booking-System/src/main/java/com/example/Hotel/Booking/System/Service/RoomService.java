package com.example.Hotel.Booking.System.Service;

import com.example.Hotel.Booking.System.DTO.IssueRoomRequest;
import com.example.Hotel.Booking.System.Model.Room;
import com.example.Hotel.Booking.System.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;


    public String addRoom( Room room){
        room.setAvailable(true);
        roomRepository.save(room);
        return "Room added successfully...";
    }
    public List<Integer> getAllAvailableRoomsNo(){
        List<Room> rooms=roomRepository.findByAvailableTrue();
        List<Integer> roomNos=new ArrayList<>();
        for (Room room:rooms){
            roomNos.add(room.getRoomNo());
        }
        return roomNos;
    }
    public String deleteRoom( int roomNo){
        Room room=roomRepository.findById(roomNo).get();
        if(room==null || !room.isAvailable()) {
            return "Sorry! room is not available";
        }
            roomRepository.deleteById(roomNo);
            return "Room is deleted";
    }
}
