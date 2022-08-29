package org.lessons.lesson4;

public class Birch extends LeafTree {

    public Birch(int height, boolean hasLeafs) {
        super(height, hasLeafs);
    }

    public void makeSound() {
        System.out.println("Березка шумит");
    }
}
