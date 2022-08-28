package org.lessons.lesson2;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние слова,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        String resultTask1 = hi.trim() + world.toLowerCase() + newLine;
        resultTask1 = resultTask1.repeat(3);
        System.out.println(resultTask1);


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0
        double height = 2.03;
        double weight = 95;
        double index = weight / (height * height);
        System.out.println(index + '\n');

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран, поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String text1 = String.valueOf(chars);
        System.out.println(text1);
        chars[3] = 'h';
        String text2 = String.valueOf(chars);
        System.out.println(text2 + '\n');

        // Домашка
        // Задание №4 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();

        // Задание №5
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren < 6) {
            System.out.println("Ребенок идет в сад");
        } else if (ageChildren < 11) {
            System.out.println("Ребенок идет в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Ребенок идет в среднюю школу");
        } else {
            System.out.println("Ребенок идет в университет");
        }
        System.out.println();

        //Продвинутый уровень (Для тех, кто имеет опыт или базовая очень простая)
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String numberText = "234";
        String someText = "some_text";
        int resultTask1A = Integer.parseInt(numberText) + someText.length();
        System.out.println(resultTask1A);
        System.out.println();

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int resultTask2A = (a + b) * (a + b);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] numbers1 = {1,2,5,7,10};
        int[] numbers2 = {2,3,2,17,15};
        int[] numbers3 = new int[numbers1.length * 3];
        for (int i = 0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
            numbers3[i + 5] = numbers2[i];
            numbers3[i + 10] = numbers1[i] * numbers2[i];
        }
        System.out.println(Arrays.toString(numbers3));
        System.out.println();

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String hello = "Hello world!";
        String resultTask4A = hello.replaceAll("l", "r").toUpperCase().substring(0, 8);
        System.out.println(resultTask4A);

        // Задание №5: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int count = 0;
        while (result < 1_000_000) {
            result += increment;
            count++;
        }
        System.out.println(count);
        System.out.println();

        // Задание №6
        // Дано:
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken && vegetables && sour && toast) {
            System.out.println("Повар делает Цезарь");
        } else if (vegetables && (chicken || sausage) && eggs) {
            System.out.println("Повар делает Оливье");
        } else if (vegetables) {
            System.out.println("Повар делает овощной салат");
        } else {
            System.out.println("У меня ничего нет");
        }

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}
