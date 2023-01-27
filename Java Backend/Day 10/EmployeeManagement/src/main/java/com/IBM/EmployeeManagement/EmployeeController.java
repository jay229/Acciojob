package com.IBM.EmployeeManagement;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
//    Annotation to create REST API
@RestController

public class EmployeeController {
    HashMap<Integer,Employee>db=new HashMap<>();



    @PostMapping("/add_emp")
    public String addEmp( @RequestBody Employee emp){
        if(emp==null)
            return "wrong data";
        int empNo=emp.getEmpNo();
        db.put(empNo,emp);
        return "Record added successfully...";
    }
    @GetMapping("/get_emp")
    public Employee getEmp( @RequestParam("query") int empNo){
        if(db.containsKey(empNo)){
            return db.get(empNo);
        }
        return null;
    }
    @DeleteMapping("/delete/{empNo}")
    public String deleteEmp( @PathVariable("empNo") int empNo){
        if (db.containsKey(empNo)){
            db.remove(empNo);
            return "Record deleted successfully...";
        }
        return "Invalid employee number entered...";

    }
    @PutMapping("/updateage")
    public String updateAge(@RequestParam("empNo") int empNo, @RequestParam("age") int age){
        if (db.containsKey(empNo)){
            Employee emp= db.get(empNo);
            int pastAge=emp.getAge();
            emp.setAge(age);
            //db.put(empNo,emp);
            return "Age of "+ emp.getName()+" is updated from "+ pastAge +" to "+ emp.getAge();
        }
        return "Age is not updated...";
    }



}
