package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {


    private Music music1;
    private Music music2;

    @Autowired
    private MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicType type) {
        String result;
        switch (type) {
            case CLASSICAL:
                result = "Playing: " + music1.getSong().get((int) (Math.random() * 3));
                break;
            case ROCK:
                result = "Playing: " + music2.getSong().get(new Random().nextInt(3));
                break;
            default:
                result = "No song was provided";
        }
        return result;
    }
}
