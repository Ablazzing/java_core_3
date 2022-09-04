package org.lessons.lesson6;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        try {
            Color colorEnum = Color.valueOf(color.toUpperCase());
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
