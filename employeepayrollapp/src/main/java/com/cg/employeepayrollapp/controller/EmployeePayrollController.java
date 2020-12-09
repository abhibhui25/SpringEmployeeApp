package com.cg.employeepayrollapp.controller;

import com.cg.employeepayrollapp.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {
    @GetMapping("/employee")
    public ResponseEntity<String> getEmployeeData(){
        return new ResponseEntity<String>("Get response from server", HttpStatus.OK);
    }

    @GetMapping("/getid/{empId}")
    public ResponseEntity<String> getEmployeeData(@PathVariable (value="empId") int empId){
        return new ResponseEntity<String>("Get response from server"+empId, HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<String> getEmployeeData(@PathVariable EmployeeDTO employeeDTO){
        return new ResponseEntity<String>("Get response from post request"+employeeDTO.toString(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>("Get the Response from put request "+employeeDTO.toString(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable (value = "empId") int empId){
        return new ResponseEntity<>("Get the Response from delete request "+empId,HttpStatus.OK);
    }
}
