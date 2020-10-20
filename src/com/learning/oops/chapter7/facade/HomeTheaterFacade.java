package com.learning.oops.chapter7.facade;

public class HomeTheaterFacade {
    CollectiveDependency.Amplifier amp;
    CollectiveDependency.Tuner tuner;
    CollectiveDependency.DVD dvd;
    CollectiveDependency.CDPlayer cd;
    CollectiveDependency.Projector projector;
    CollectiveDependency.TheaterLights lights;
    CollectiveDependency.Screen screen;
    CollectiveDependency.PopCornPopper popper;


    public HomeTheaterFacade(CollectiveDependency.Amplifier amplifier,
                             CollectiveDependency.Tuner tuner, CollectiveDependency.DVD dvd,
                             CollectiveDependency.Projector projector, CollectiveDependency.Screen screen,
                             CollectiveDependency.TheaterLights lights, CollectiveDependency.PopCornPopper popper, CollectiveDependency.CDPlayer cdPlayer){
        this.amp=amplifier;
        this.tuner=tuner;
        this.dvd=dvd;
        this.projector=projector;
        this.screen=screen;
        this.lights=lights;
        this.popper=popper;
        this.cd=cdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Watch a movie ");
        popper.on();
        popper.pop();
        lights.lightsDim();
        screen.screenDown();
        projector.projectorOn();
        projector.projectorWideScreen();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurroundingSound();
        amp.setVolume();
        cd.on();
        cd.playMovie(movie);
    }

    public void EndMovie(){
        System.out.println("Ending the movie");
        popper.off();
        lights.lightsOn();
        screen.screenUp();
        projector.projectorOff();
        amp.off();
        cd.stop();
        cd.eject();
        cd.off();
    }
}
