package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private int childFilter;
    private Role role;
}
