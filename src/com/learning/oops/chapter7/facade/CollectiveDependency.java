package com.learning.oops.chapter7.facade;

public class CollectiveDependency {

    public static class Amplifier{
        void on(){
            System.out.println("Amp is on !");
        }
        void off(){
            System.out.println("App is off");
        }
        void setDVD(DVD dvd){
            System.out.println("Setting the dvd");
        }
        void setSurroundingSound(){
            System.out.println("Setting surrounding sound");
        }
        void setVolume(){
            System.out.println("Setting the volume ");
        }
    }

    public static class DVD{

    }

    public static class Tuner{}

    public static class CDPlayer{
        void on(){
            System.out.println("Making cd player on...");
        }
        void off(){
            System.out.println("Making cd player off ...");
        }
        void playMovie(String movie){
            System.out.println("Playing movie "+movie+" in cd player");
        }
        void stop(){
            System.out.println("DVD stopped");
        }
        void eject(){
            System.out.println("DVD is ejected ");
        }
    }

    public static class Projector{
        void projectorOn(){
            System.out.println("Making projector on");
        }
        void projectorWideScreen(){
            System.out.println("Making projector wide screen");
        }
        void projectorOff(){
            System.out.println("Making projector off");
        }
    }

    public static class TheaterLights{
        void lightsDim(){
            System.out.println("Dimming the lights");
        }
        void lightsOn(){
            System.out.println("Making lights on");
        }
    }

    public static class Screen{
        void screenUp(){
            System.out.println("Making screen up");
        }
        void screenDown(){
            System.out.println("Making screen down");
        }
    }

    public static class PopCornPopper{
        void on(){
            System.out.println("Popper is on !");
        }
        void pop(){
            System.out.println("Popper is popping popcorns !");
        }
        void off(){
            System.out.println("Making popper off");
        }
    }
}
