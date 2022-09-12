package org.lessons.lesson6.homework.advance.task1;

public class Spruce extends Tree implements Smellable {
    private boolean hasCones = true;

    @Override
    public void smell() {
        System.out.println("Ель умеет пахнуть");
    }
}
