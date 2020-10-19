package com.learning.oops.chapter5;

public class ChocolateBoiler {
    private volatile static ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty=true;
        boiled=false;
    }

    //u can use syncronized keyword here but its slow, read readme
    public static ChocolateBoiler getInstance(){
        if(instance==null){
            synchronized (ChocolateBoiler.class) {
                instance=new ChocolateBoiler();
            }
            return instance;
        }else
            return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
            //fill the boiler
            System.out.println("Filled the boiler");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            //drain the vessel
            empty=true;
            System.out.println("Drain the boiler");
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled=true;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
