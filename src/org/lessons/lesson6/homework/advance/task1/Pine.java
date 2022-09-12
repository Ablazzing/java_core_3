package org.lessons.lesson6.homework.advance.task1;

public class Pine extends Tree implements Smellable {
    private boolean hasCones = true;

    @Override
    public void smell() {
        System.out.println("Сосна умеет пахнуть");
    }
}
