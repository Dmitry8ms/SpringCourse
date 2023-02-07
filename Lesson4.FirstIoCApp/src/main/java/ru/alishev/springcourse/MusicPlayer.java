package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    @Autowired
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic() {

        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }
}
