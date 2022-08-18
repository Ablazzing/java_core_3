package org.lessons.lesson1;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Пишем код -> (компиляция) в код для Java Machine (JVM) -> JVM преобразует в байт код 1010

        //Примитивные типы данных
        //boolean
        boolean answer = true;
        boolean b2 = false;

        //byte (8 бит или 8 значений 1 или 0)
        byte bt = -128;
        byte bt2 = 127;

        //short - короткое число (2 byte)
        short sh = -32_768;
        short sh2 = 32_767;

        //int - целое число (4 byte или 32 bit)
        int integer = -2_100_000_000;
        int integer2 = 2_100_000_000;

        //long - длинное целое число (8 byte или 64 bit)
        long lon = 3_000_000_000_000_000_000l;

        //Числа с плавающей точкой
        //float - 32 bit
        float floa = 3.1234567f;
        //double - 64 bit
        double doub = 3.1234567891234567;

        int x = 4;
        int y = 2;
        int c = x - y;
        int c2 = x + y;
        int c3 = x * y;
        int c4 = x / y;
        int c5 = x % y;
        System.out.println(c);

        //Символы
        char ch = 's';
        char ch2 = 111;

        //1 - A
        //2 - B
        //27 - a
        System.out.println(ch);

        char[] answer2 = new char[6];
        answer2[0] = 'М';
        answer2[1] = 'О';
        answer2[2] = 'Т';
        answer2[3] = 'Ы';
        answer2[4] = 'Г';
        answer2[5] = 'А';

        System.out.println(answer2);

        char[] answer3 = {'a', 'b', 'c', 'd'};
        System.out.println(answer3);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //Текстовый тип данных
        String word1 = "hello";
        String word2 = " World!";
        //Конкатенация (Объединение строк)
        String result = word1 + word2;
        System.out.println(result);

        String stringFromCharArray = String.valueOf(answer3);
        System.out.println(stringFromCharArray + "e");

        //Все заглавные буквы
        System.out.println(word1.toUpperCase());
        //Все маленькие буквы
        System.out.println(word2.toLowerCase());

        //Длина строки
        System.out.println(word1.length());

        //Замена строк
        String newWord1 = word1.replaceAll("llo", "licopter");
        System.out.println(newWord1);

        //Повторение слова n раз
        System.out.println(word1.repeat(10));

        //Обрезка пробелов справа и слева
        String word3 = " s          word            ";
        System.out.println(word3.trim());

        System.out.println("Новые изменения");
        System.out.println("Новые изменения 2");


    }

}
