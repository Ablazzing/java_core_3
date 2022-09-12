package org.lessons.lesson6.homework.advance.task1;

public class Fern extends Plant implements Bloomable {
    @Override
    public void bloom() {
        System.out.println("Папоротник умеет цвести");
    }
}
