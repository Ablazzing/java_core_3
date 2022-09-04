package org.lessons.lesson5;

public class Fish implements Swimable, Moveable {

    public void swim() {
        System.out.println("Рыба плывет");
    }

    @Override
    public void move() {
        System.out.println("Рыба движется");
    }
}
