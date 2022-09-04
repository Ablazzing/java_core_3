package org.lessons.lesson4.homework.base.task1;

public class Shark {
    private String color;
    private int countTeeth;

    public Shark(String color, int countTeeth) {
        this.color = color;
        this.countTeeth = countTeeth;
    }

    public String getColor() {
        return color;
    }

    public int getCountTeeth() {
        return countTeeth;
    }

    public void setCountTeeth(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
