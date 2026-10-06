package com.edu.student.service;

import com.edu.student.dto.request.RegisterRequestDto;
import com.edu.student.dto.response.RegisterResponseDto;

public interface StudentService {
    RegisterResponseDto register(RegisterRequestDto request);
}
