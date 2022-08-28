package org.lessons.lesson3;

public class Human {

    static int count = 0;

    private int age;
    private int weight;
    private String name;

    public Human(int humanAge, int humanWeight, String humanName) {
        this.name = humanName;
        this.age = humanAge;
        this.weight = humanWeight;
        count += 1;
    }

    public int getAge() {
        return age;
    }

    public static void printCount() {
        System.out.println(count);
    }

    public void setAge(int newHumanAge) {
        if (newHumanAge > 21) {
            System.out.println("Невозможно присвоить возраст больше 21");
        } else {
            this.age = newHumanAge;
        }
    }

    public void getInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.weight);
    }

    public int getWeightInPounds() {
        return this.weight * 2;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
