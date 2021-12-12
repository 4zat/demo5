package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAllUser() {
        return userRepo.findAllUser();
    }
    @Override
    public Integer getUserByEmail(String email) {
        return userRepo.getUserByEmail(email);
    }
}
