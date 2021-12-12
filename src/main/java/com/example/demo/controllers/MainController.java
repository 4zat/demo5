package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.service.FilmsService;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private final FilmsService filmsService;
    private final UserService userService;

    public MainController(FilmsService filmsService, UserService userService) {
        this.filmsService = filmsService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("films", filmsService.findAllFilms());
        return "index";
    }
    @GetMapping("/films")
    public String test(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String s = userDetails.getUsername();
        Integer num = userService.getUserByEmail(s);
        model.addAttribute("filmsByRating", filmsService.
                findFilmsByRating(num));
        return "films";
    }
}
