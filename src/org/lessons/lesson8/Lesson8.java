package org.lessons.lesson8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson8 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\repos\\java_core_3\\test.txt";
//        FileWriter writer = new FileWriter(path);
//        writer.write("Ура это мой первый файл\n");
//        writer.write("Вторая строка\n");
//        writer.close();

//        FileReader reader = new FileReader(path);
//        while (reader.ready()) {
//            char read = (char) reader.read();
//            System.out.print(read);
//        }
//
//        reader.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//        while (bufferedReader.ready()) {
//            String s = bufferedReader.readLine();
//            System.out.println(s);
//        }

        //bufferedReader.close();
//        String firstLine = "Это первая строка";
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//        String result = "";
//        while (bufferedReader.ready()) {
//            result += (char) bufferedReader.read();
//        }
//        bufferedReader.close();
//
//        String finalResult = firstLine + "\n" + result;
//        FileWriter writer2 = new FileWriter(path);
//        writer2.write(finalResult);
//        writer2.close();

        String textForReplace = "Черный цвет";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int countLine = 0;
        String result = "";
        while (bufferedReader.ready()) {
            if (countLine == 2) {
                result += textForReplace + "\n";
                bufferedReader.readLine();
            } else {
                result += bufferedReader.readLine() + "\n";
            }
            countLine++;
        }
        bufferedReader.close();

        FileWriter writer = new FileWriter(path);
        writer.write(result);
        writer.close();


    }
}
