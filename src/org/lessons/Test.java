package org.lessons;

public class Test {
    public static void main(String[] args) {
        String name = "Yuri";
        int age = 21;
        //String data = name + " " + age;
        String data = String.format("%s %d", name, age);
        System.out.println(data);
    }
}
