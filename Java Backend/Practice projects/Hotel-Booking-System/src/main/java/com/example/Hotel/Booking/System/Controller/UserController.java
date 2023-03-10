package com.example.Hotel.Booking.System.Controller;

import com.example.Hotel.Booking.System.DTO.UserResponseDto;
import com.example.Hotel.Booking.System.Model.User;
import com.example.Hotel.Booking.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody User user){

        String msg= userService.addUser(user);
        return new ResponseEntity<>(msg, HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public ResponseEntity getUser(@RequestParam("adharNo") String adharNo){
        User user=userService.getUser(adharNo);
        if(user==null)
            return new ResponseEntity<>("User not found",HttpStatus.FOUND);
        UserResponseDto existingUser=new UserResponseDto();
        existingUser.setName(user.getName());
        existingUser.setMobile(user.getMobileNo());
        existingUser.setEmail(user.getEmail());
        existingUser.setCity(user.getCity());
        existingUser.setState(user.getState());
        return new ResponseEntity<>(existingUser,HttpStatus.FOUND);
    }
    @DeleteMapping("/delete")
    public ResponseEntity deleteUser(@RequestParam("adharNo") String adharNo){
        String msg= userService.deleteUser(adharNo);
        return new ResponseEntity<>(msg,HttpStatus.MOVED_PERMANENTLY);

    }
}
