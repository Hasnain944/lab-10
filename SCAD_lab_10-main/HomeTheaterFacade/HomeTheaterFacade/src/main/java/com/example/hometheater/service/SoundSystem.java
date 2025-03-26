package com.example.hometheater.service;

import org.springframework.stereotype.Service;

@Service
public class SoundSystem {
    public void turnOn() {
        System.out.println("Sound System is turned ON.");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to: " + level);
    }

    public void turnOff() {
        System.out.println("Sound System is turned OFF.");
    }
}
