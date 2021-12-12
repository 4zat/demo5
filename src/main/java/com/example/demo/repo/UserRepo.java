package com.example.demo.repo;

import com.example.demo.entity.Films;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query("select u from User u")
    List<User> findAllUser();

    @Query("select u.childFilter from User u where u.email = :email")
    Integer getUserByEmail(@Param("email") String email);
}
