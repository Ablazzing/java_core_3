package org.lessons.lesson4.homework.base.task1;

public class Whale {
    private boolean isBig;
    private boolean isMakeSound;

    public Whale(boolean isBig, boolean isMakeSound) {
        this.isBig = isBig;
        this.isMakeSound = isMakeSound;
    }

    public boolean isBig() {
        return isBig;
    }

    public boolean isMakeSound() {
        return isMakeSound;
    }
}
