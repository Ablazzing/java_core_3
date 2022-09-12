package org.lessons.lesson6;

import org.lessons.lesson6.homework.advance.task1.*;
import org.lessons.lesson6.homework.advance.task2.*;
import org.lessons.lesson6.homework.base.Airplane;
import org.lessons.lesson6.homework.base.Duck;
import org.lessons.lesson6.homework.base.FlyException;
import org.lessons.lesson6.homework.base.Flyable;

public class Homework3 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Вызвать у них метод летать
        // Перехватить исключения: вывести на экран message ошибки
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0
        Duck duckInjured = new Duck(true);
        Duck duck = new Duck(false);
        Airplane plane = new Airplane(10);
        Airplane airplaneWithNoPassengers = new Airplane(-1);
        Flyable[] flyables = {duck, duckInjured, plane, airplaneWithNoPassengers};

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }

        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести
        Pine pine = new Pine();
        Spruce spruce = new Spruce();
        Rose rose = new Rose();
        Fern fern = new Fern();
        Smellable[] smellables = {pine, spruce, rose};
        Bloomable[] bloomables = {rose, fern};

        for (Smellable smellable : smellables) {
            smellable.smell();
        }

        for (Bloomable bloomable : bloomables) {
            bloomable.bloom();
        }


        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами)
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.
        Watch watchBroken = new Watch(true);
        Watch watch = new Watch(false);
        Worker worker1 = new Worker(watch);
        Worker worker2 = new Worker(watchBroken);
        Worker[] workers1 = {worker1};
        Worker[] workers2 = {worker2};
        Shop shop1 = new Shop(workers1);
        Shop shop2 = new Shop(workers2);
        Shop[] shops = {shop1, shop2};
        Brand brand = new Brand(shops);

        for (Shop shop : brand.getShops()) {
            for (Worker worker : shop.getWorkers()) {
                try {
                    worker.getWatch().tick();
                } catch (WatchBrokenError e) {
                    System.out.println("Ошибка: Часы сломались.");
                }
            }
        }


        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
        // Не повторяющиеся
        //Для генерации данных воспользоваться классом GeneratorExpertHomework

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
    }
}
