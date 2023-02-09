package com.Avengers.sql_rocks;

import com.Avengers.sql_rocks.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody User user){
       String message= userService.addUser(user);
       return  new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }
    @GetMapping("/get")
    public  ResponseEntity getUser(@RequestParam("id") int id){
        User user=userService.getUser(id);
        if(user!=null)
            return new ResponseEntity<>(user,HttpStatus.FOUND);
        return new ResponseEntity<>("Invalid id",HttpStatus.NOT_FOUND);
    }

}
