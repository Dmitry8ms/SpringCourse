package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component("classicalMusicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
