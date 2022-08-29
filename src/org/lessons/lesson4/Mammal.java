package org.lessons.lesson4;

public abstract class Mammal extends Animal {
    private int countMilk;

    public Mammal(int teethCount, int countMilk) {
        super(teethCount);
        this.countMilk = countMilk;
    }

    public void drinkMilk() {
        System.out.println("Пьет молоко");
    }
}
