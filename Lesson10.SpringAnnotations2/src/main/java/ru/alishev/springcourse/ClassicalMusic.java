package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicList = new ArrayList<>();
    private ClassicalMusic() {
        classicalMusicList.add("Hungarian Rhapsody");
        classicalMusicList.add("Peter and Wolf");
        classicalMusicList.add("Fly of Valkyrie");
    }
    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }
}
