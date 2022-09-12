package org.lessons.lesson7;

import java.util.Objects;

public class Human implements Cloneable{
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != Human.class) {
            return false;
        } else {
            Human anotherHuman = (Human) obj;
            return anotherHuman.name.equals(this.name)
                    && anotherHuman.age == this.age
                    && anotherHuman.weight == this.weight;
        }
    }

    @Override
    public int hashCode() {
        return name.length() + age + weight;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human уничтожен");
    }

    @Override
    public Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
