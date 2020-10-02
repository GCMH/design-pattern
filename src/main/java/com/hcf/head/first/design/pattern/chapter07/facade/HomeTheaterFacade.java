package com.hcf.head.first.design.pattern.chapter07.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Project project;
    private TheaterLight theaterLight;
    private Screen screen;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvd,
                             CdPlayer cd, Project project, TheaterLight theaterLight,
                             Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.project = project;
        this.theaterLight = theaterLight;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("Get Ready to Watch a movie");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLight.dim(10);
        screen.down();
        project.on();
        project.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setSurroundSound();
        amplifier.setVolum(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        popcornPopper.off();
        theaterLight.on();
        screen.up();
        project.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
