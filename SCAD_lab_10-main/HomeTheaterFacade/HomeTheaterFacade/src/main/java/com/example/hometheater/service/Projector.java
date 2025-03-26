package com.example.hometheater.service;

import org.springframework.stereotype.Service;

@Service
public class Projector {
    public void turnOn() {
        System.out.println("Projector is turned ON.");
    }

    public void setInput(String inputSource) {
        System.out.println("Projector input set to: " + inputSource);
    }

    public void turnOff() {
        System.out.println("Projector is turned OFF.");
    }
}
