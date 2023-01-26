package com.avengers.studentManagement;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;

@RestController

public class StudentController {
    HashMap<Integer,Student>db=new HashMap<>();
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        int admNo=student.getAdmNo();
        db.put(admNo,student);
        return "Student added successfully...";
    }

//    Path params
   @GetMapping("get_student/{admNo}")
    public Student getStudent(@PathVariable("admNo") int admNo){
        return db.get(admNo);
    }

//    Request params
//    @GetMapping("/get_student")
//    public Student getStudent(@RequestParam("q") int admNo){
//       return db.get(admNo);
//   }
}
