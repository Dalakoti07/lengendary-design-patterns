package com.learning.oops.chapter7.facade;

public class HomeTheaterTestDrive {

    public static void main(String[] args) throws InterruptedException {
        HomeTheaterFacade homeTheater= new HomeTheaterFacade(new CollectiveDependency.Amplifier(),new CollectiveDependency.Tuner(),
                new CollectiveDependency.DVD(),new CollectiveDependency.Projector(),new CollectiveDependency.Screen(),
                new CollectiveDependency.TheaterLights(),new CollectiveDependency.PopCornPopper(),new CollectiveDependency.CDPlayer());
        homeTheater.watchMovie("Twilight");
        System.out.println("Watching twilight....");
        Thread.sleep(2000);
        homeTheater.EndMovie();
    }
}
