package com.example.hometheater.service;

import org.springframework.stereotype.Service;

@Service
public class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD Player is turned ON.");
    }

    public void playMovie(String movieName) {
        System.out.println("Playing movie: " + movieName);
    }

    public void turnOff() {
        System.out.println("DVD Player is turned OFF.");
    }
}
