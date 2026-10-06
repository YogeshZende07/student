package com.edu.student.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDto {
    private String name;
    private String email;
    private String mobilNumber;
    private String password;
}
