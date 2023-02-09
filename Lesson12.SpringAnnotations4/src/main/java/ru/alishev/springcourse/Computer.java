package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
