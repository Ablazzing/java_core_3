package org.lessons.lesson5;

public class Tiger extends Animal implements Eatable {
    @Override
    public void eat() {
        System.out.println("Тигр ест");
    }
}
