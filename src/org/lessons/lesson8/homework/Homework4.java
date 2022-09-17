package org.lessons.lesson8.homework;

import org.lessons.lesson8.expert.DataGenerator;
import org.lessons.lesson8.homework.base.FinancialRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //Задача №1
        //Необходимо:
        // 1. Создать папку resource, пометить ее как папку Resourсe root.
        // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        BufferedReader reader = new BufferedReader(
                new FileReader("E:\\repos\\java_core_3\\resourse\\my_first_file.txt"));
        String result = "";
        while (reader.ready()) {
            String line = reader.readLine();
            result += line + " ";
        }
        System.out.println(result.trim());
        reader.close();

        //Задача №2
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        FileWriter writer = new FileWriter("E:\\repos\\java_core_3\\report.txt");
        writer.write("доходы = " + financialRecord.getIncome() + ", расходы = " + financialRecord.getOutcome());

        writer.close();

        //Продвинутый уровень
        //Задача №1
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
        // 4. Записать в файл "report_2.txt" все данные из отчетов.
        // 5. Прочитать файл report_2.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        Random random = new Random(1);
        FinancialRecord[] financialRecords = new FinancialRecord[10];
        for (int i = 0; i < 10; i++) {
            financialRecords[i] = new FinancialRecord(random.nextInt(10_000), random.nextInt(10_000));
        }

        String pathTask2 = "E:\\repos\\java_core_3\\report_2.txt";
        FileWriter writer2 = new FileWriter(pathTask2);
        writer2.write("Доходы;Расходы\n");
        String result2 = "";
        for (FinancialRecord record : financialRecords) {
            result2 += record.getInfo() + "\n";
        }
        writer2.write(result2.trim());
        writer2.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(pathTask2));
        int countLines = 0;
        int allIncomes = 0;
        int allOutcomes = 0;
        while (reader2.ready()) {
            if (countLines == 0) {
                countLines++;
                reader2.readLine();
                continue;
            }
            //8985;4588
            String line = reader2.readLine();
            String[] fields = line.split(";");
            Integer income = Integer.parseInt(fields[0]);
            Integer outcome = Integer.parseInt(fields[1]);
            allIncomes += income;
            allOutcomes += outcome;
        }
        System.out.println("Общие доходы - " + allIncomes + ", общие расходы - " + allOutcomes);
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)
        reader2.close();

        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц, 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Сгенерировать отчеты нужно через DataGenerator
        //В path указать путь до папки, где сгенерятся отчеты
        //String path = "";
        //DataGenerator.createReports(path);

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд


        // Задача №2
        // Необходим составить отчет о расходах всех магазинов за весь период по магазинам (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результат:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд
    }
}
