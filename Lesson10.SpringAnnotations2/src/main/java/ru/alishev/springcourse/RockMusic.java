package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    private List<String> rockMusicList = new ArrayList<>();
    private RockMusic() {
        rockMusicList.add("Wind cries Mary");
        rockMusicList.add("Wind of Change");
        rockMusicList.add("Yellow Submarine");
    }
    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
