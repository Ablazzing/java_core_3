package org.lessons.lesson5.task1;

public class Microwave extends Electronic implements Soundable{

    public Microwave() {
        super(SocketType.EURO);
    }

    public void cook() {
        System.out.println("разогревает");
    }

    @Override
    public void sound() {
        System.out.println("Пищит");
    }
}
