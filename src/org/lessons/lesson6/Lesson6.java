package org.lessons.lesson6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
//        int x = 2;
//        int y = 1;
//        int z = 1;
//
//        try {
//            throw new Exception("Опа, какая то ошибка");
//        } catch (ArithmeticException exception) {
//            System.out.println("Ой у меня ошибка - деление на ноль");
//        } catch (Exception e) {
//            System.out.println("Иные ошибки");
//        } finally {
//            System.out.println("Ура это финальное действие");
//        }
//
//        System.out.println("Какие-то действия");


//        try {
//            checkNumber(-20);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        Animal[] animals = new Animal[3];

        try {
            animals[0] = new Animal("Tiger", 20, "BLACK");
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        System.out.println(Arrays.toString(animals));
    }

    public static void checkNumber(int number) throws NegativeNumberException {
        if (number >= 0) {
            System.out.println("Число положительное или 0");
        } else {
            throw new NegativeNumberException("Число меньше нуля");
        }
    }

    public static void printNumbers(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers(int startNumber, int finishNumber) {
        for (int i = startNumber; i < finishNumber; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers(String number) {
        int maxNumber = Integer.parseInt(number);
        for (int i = 0; i < maxNumber; i++) {
            System.out.println(i);
        }
    }

    public static int printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return 10;
    }


}
