package com.edu.student.controller;

import com.edu.student.dto.request.RegisterRequestDto;
import com.edu.student.dto.response.RegisterResponseDto;
import com.edu.student.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }
    @PostMapping("/register")
    RegisterResponseDto register(@RequestBody RegisterRequestDto request){
        return studentService.register(request);
    }


}
