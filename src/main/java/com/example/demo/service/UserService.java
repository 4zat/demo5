package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {

    List<User> findAllUser();
    Integer getUserByEmail(String email);
}
