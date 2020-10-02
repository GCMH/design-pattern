package com.hcf.head.first.design.pattern.chapter07.facade;

public class Main {
    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Project project = new Project();
        TheaterLight theaterLight = new TheaterLight();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvd,
                cd, project, theaterLight,
                screen, popcornPopper);

        homeTheaterFacade.watchMovie("123");
        homeTheaterFacade.endMovie();
    }
}
