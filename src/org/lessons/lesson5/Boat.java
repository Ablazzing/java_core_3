package org.lessons.lesson5;

public class Boat implements Swimable, Moveable {

    @Override
    public void swim() {
        System.out.println("Лодка плывет");
    }

    public void crush() {
        System.out.println("Лодка тонет");
    }

    @Override
    public void move() {
        System.out.println("Лодка движется");
    }

    @Override
    public void takeWater() {
        System.out.println("Лодка взяла столько то воды");
    }
}
