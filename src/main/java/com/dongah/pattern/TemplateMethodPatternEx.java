package com.dongah.pattern;

public class TemplateMethodPatternEx {
    public static void main(String[] args) {
        HomeMake home = new makeRoom1();
        home.makeRoom();
        home.makeKitchen();
        home.makeGlass();

        System.out.println("================================");

        HomeMake home2 = new makeRoom2();
        home2.makeRoom();
        home2.makeKitchen();
        home2.makeGlass();
    }
}

abstract class HomeMake {
    public abstract void makeRoom();

    public abstract void makeKitchen();

    public void makeGlass(){
        System.out.println("makeGlass");
    }
}

class makeRoom1 extends HomeMake {

    @Override
    public void makeRoom() {
        System.out.println("makeRoom1");
    }

    @Override
    public void makeKitchen() {
        System.out.println("makeKitchen2");
    }
}

class makeRoom2 extends HomeMake {

    @Override
    public void makeRoom() {
        System.out.println("makeRoom2");
    }

    @Override
    public void makeKitchen() {
        System.out.println("makeKitchen2");
    }
}