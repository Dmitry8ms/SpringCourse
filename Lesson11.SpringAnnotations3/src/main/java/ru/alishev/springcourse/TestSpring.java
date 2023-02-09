package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
        Music music1 = context.getBean("classicalMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);
        System.out.println(music1 == music2);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//
//        classicalMusicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
