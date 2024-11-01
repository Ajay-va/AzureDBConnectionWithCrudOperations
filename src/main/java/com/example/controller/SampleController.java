package com.example.controller;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SampleController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/welcome")
    public String welcome(){
        return  "Welcome to Azure Deployment....!!!";
    }

    @PostMapping("/save")
    public Student saveEmployee(@RequestBody Student student){
        return  studentRepository.save(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> employeeList(){
        return  studentRepository.findAll();
    }


}
