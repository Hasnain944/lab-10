package com.example.hometheater.controller;

import com.example.hometheater.facade.HomeTheaterFacade;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home-theater")
public class HomeTheaterController {
    private final HomeTheaterFacade homeTheaterFacade;

    public HomeTheaterController(HomeTheaterFacade homeTheaterFacade) {
        this.homeTheaterFacade = homeTheaterFacade;
    }

    @PostMapping("/start")
    public String startMovie(@RequestParam String movieName) {
        homeTheaterFacade.startMovie(movieName);
        return "Movie '" + movieName + "' started successfully!";
    }

    @PostMapping("/stop")
    public String stopMovie() {
        homeTheaterFacade.stopMovie();
        return "Movie stopped successfully!";
    }
}
