package org.lessons.lesson6.homework.advance.task1;

public class Rose extends Plant implements Smellable, Bloomable{
    @Override
    public void bloom() {
        System.out.println("Роза умеет цвести");
    }

    @Override
    public void smell() {
        System.out.println("Роза умеет пахнуть");
    }
}
