package com.edu.student.dto.response;

import com.edu.student.dto.request.RegisterRequestDto;
import lombok.*;
@Getter
@Setter

@AllArgsConstructor
@RequiredArgsConstructor


public class RegisterResponseDto {
    private String message;
    private Long id;
    private String name;
    private String email;
    private String mobileNumber;

    public RegisterResponseDto(String message){
        this.message= message;
    }

}
