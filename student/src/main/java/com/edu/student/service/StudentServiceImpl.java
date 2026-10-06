package com.edu.student.service;

import com.edu.student.dto.request.RegisterRequestDto;
import com.edu.student.dto.response.RegisterResponseDto;
import com.edu.student.entity.StudentEntity;
import com.edu.student.repository.StudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo){
        this.studentRepo=studentRepo;
    }
    @Override
    public RegisterResponseDto register(RegisterRequestDto request){
        if(studentRepo.existsByEmail(request.getEmail())){
            return new RegisterResponseDto("Student already registerd");
        }
        StudentEntity student = new StudentEntity();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setMobileNumber(request.getMobilNumber());
        student.setPassword(request.getPassword());

        StudentEntity savedStudent =studentRepo.save(student);

        return new RegisterResponseDto("Student registered successfully",
                savedStudent.getId(),
                savedStudent.getName(),
                savedStudent.getEmail(),
                savedStudent.getMobileNumber());
    }

}
