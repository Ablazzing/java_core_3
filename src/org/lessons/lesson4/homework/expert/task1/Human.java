package org.lessons.lesson4.homework.expert.task1;

public class Human {
    private int age;
    private double weight;
    private String name;

    private Human() {}

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private Human human = new Human();

        public HumanBuilder age(int age) {
            human.setAge(age);
            return this;
        }

        public HumanBuilder name(String name) {
            human.setName(name);
            return this;
        }

        public HumanBuilder weight(double weight) {
            human.setWeight(weight);
            return this;
        }

        public Human build() {
            return human;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        String result = this.name + " " + this.age + " " + this.weight;
        System.out.println(result);
    }
}
