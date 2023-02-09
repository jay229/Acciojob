package com.Avengers.sql_rocks;

import com.Avengers.sql_rocks.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserService{
    @Autowired
    UserRepository repository;
    public  String addUser( User user){
        repository.save(user);
        return "User added successfully...";
    }
    public User getUser( int id){
        return repository.findById(id).get();
    }
}
