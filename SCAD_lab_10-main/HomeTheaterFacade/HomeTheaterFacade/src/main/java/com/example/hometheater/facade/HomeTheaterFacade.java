package com.example.hometheater.facade;
import com.example.hometheater.service.DVDPlayer;
import com.example.hometheater.service.Projector;
import com.example.hometheater.service.SoundSystem;
import org.springframework.stereotype.Service;
@Service
public class HomeTheaterFacade {
    private final DVDPlayer dvdPlayer;
    private final Projector projector;
    private final SoundSystem soundSystem;
    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }
    public void startMovie(String movieName) {
        System.out.println("Starting home theater...");
        dvdPlayer.turnOn();
        projector.turnOn();
        projector.setInput("DVD");
        soundSystem.turnOn();
        soundSystem.setVolume(10);
        dvdPlayer.playMovie(movieName);
        System.out.println("Movie has started!");
    }
    public void stopMovie() {
        System.out.println("Stopping home theater...");
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
        System.out.println("Movie has stopped!");
    }
}
