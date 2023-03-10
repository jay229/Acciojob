package com.example.Hotel.Booking.System.Service;

import com.example.Hotel.Booking.System.Model.User;
import com.example.Hotel.Booking.System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User added successfully";
    }
    public User getUser(@RequestParam String adharNo){
        User user=userRepository.findByAdharNo(adharNo);
        return user;
    }
    public String deleteUser( String adharNo){
        User user=userRepository.findByAdharNo(adharNo);
        userRepository.deleteById(user.getId());
        return "User is deleted";
    }
}
