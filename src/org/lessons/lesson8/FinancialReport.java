package org.lessons.lesson8;

import java.io.*;
import java.util.Arrays;

public class FinancialReport {
    public static void main(String[] args) throws IOException {
        String path = "E:\\repos\\java_core_3\\report.csv";
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//        int countLine = 0;
//        int finalPrice = 0;
//        while (bufferedReader.ready()) {
//            if (countLine == 0) {
//                bufferedReader.readLine();
//                countLine++;
//                continue;
//            }
//
//            String line = bufferedReader.readLine();
//            String[] fields = line.split(";");
//            int goodAllPrice = Integer.parseInt(fields[1]) * Integer.parseInt(fields[2]);
//            finalPrice += goodAllPrice;
//            countLine++;
//        }
//
//        System.out.println(finalPrice);
//        bufferedReader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int countLine = 0;
        Good[] goods = new Good[5];
        while (bufferedReader.ready()) {
            if (countLine == 0) {
                bufferedReader.readLine();
                countLine++;
                continue;
            }

            String[] fields = bufferedReader.readLine().split(";");
            String name = fields[0];
            int amount = Integer.parseInt(fields[1]);
            double price = Double.parseDouble(fields[2]);
            Good good = new Good(name, amount, price);
            goods[countLine - 1] = good;
            countLine++;
        }
        bufferedReader.close();

        System.out.println(Arrays.toString(goods));

        double allPrice = 0;
        for (Good good : goods) {
            allPrice += good.getPrice() * good.getAmount();
        }
        System.out.println(allPrice);

        String newPath = "E:\\repos\\java_core_3\\report2.csv";
        FileWriter writer = new FileWriter(newPath);
        writer.write("наименование товара;количество;цена\n");
        for (Good good : goods) {
            writer.write(good.getCsvFormat() + "\n");
        }



        writer.close();
    }
}
