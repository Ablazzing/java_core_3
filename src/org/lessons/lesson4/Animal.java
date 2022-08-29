package org.lessons.lesson4;

public abstract class Animal {
    private int teethCount;

    public Animal(int teethCount) {
        this.teethCount = teethCount;
    }

    public final void makeSound() {
        System.out.println("Животное издает звук");
    };

    public int getTeethCount() {
        return teethCount;
    }
}
