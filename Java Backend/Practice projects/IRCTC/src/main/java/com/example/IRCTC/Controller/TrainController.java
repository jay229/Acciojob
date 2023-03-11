package com.example.IRCTC.Controller;

import com.example.IRCTC.Model.Train;
import com.example.IRCTC.Service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainRepository {
    @Autowired
    TrainService trainService;
    @PutMapping("/add")
    public ResponseEntity addTrain(@RequestBody Train train){
        String msg= trainService.addTrain(train);
        return new ResponseEntity<>(msg, HttpStatus.ACCEPTED);
    }

}
