package org.lessons.lesson4.homework;

import org.lessons.lesson4.homework.advance.task1.Storage;
import org.lessons.lesson4.homework.advance.task1.Worker;
import org.lessons.lesson4.homework.advance.task2.CarFactory;
import org.lessons.lesson4.homework.advance.task2.Lada;
import org.lessons.lesson4.homework.advance.task2.Toyota;
import org.lessons.lesson4.homework.base.task1.Shark;
import org.lessons.lesson4.homework.base.task1.Whale;
import org.lessons.lesson4.homework.base.task3.BigCircle;
import org.lessons.lesson4.homework.base.task3.Circle;
import org.lessons.lesson4.homework.expert.task1.Human;
import org.lessons.lesson4.homework.expert.task2.Car;
import org.lessons.lesson4.homework.expert.task2.CarShop;

public class Homework2 {
    public static void main(String[] args) {
        // Задание №1
        // Создать два класса, которые описывают какое либо животное (каждый имеет минимум два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        Whale whale = new Whale(true, true);
        Shark shark = new Shark("gray", 200);

        // Задание №2
        // Создать следующие классы
        // 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
        // подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
        // 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")
        // 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
        // Метод work у компьютера выводит в консоль - выполняет вычисления.
        //Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override


        //Задание №3
        //Создать класс Circle с атрибутом - radius
        //Создать класс BigCircle - который не принимает атрибутов, но создает круг с размером 10.
        BigCircle circle = new BigCircle();

        //Продвинутая домашка
        // Задание №1:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
        Storage storage = new Storage(10);
        Worker worker = new Worker("Petr");
        Worker worker2 = new Worker("Yuri");
        Worker worker3 = new Worker("Ivan");
        worker.brokeVodka(storage);
        worker.brokeVodka(storage);
        worker2.brokeVodka(storage);
        worker3.brokeVodka(storage);
        System.out.println(worker);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(storage);

        //Задача №2 (Прочитать про полиморфизм и instanceof)
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1. Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2. Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
        // 4. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 5. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.
//        Car[] cars = new Car[40];
//        for (int i = 0; i < 20; i++) {
//            cars[i] = CarFactory.createLada();
//            cars[i + 20] = CarFactory.createToyota();
//        }
//
//        for (Car car : cars) {
//            if (car instanceof Lada) {
//                Lada lada = (Lada) car;
//                lada.broke();
//            } else if (car instanceof Toyota) {
//                Toyota toyota = (Toyota) car;
//                toyota.turnMusic();
//            }
//        }

        //Экспертный уровень:
        //Задача №1
        // Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
        // Для этого шаблона характерно:
        // 1. приватный конструктор,
        // 2. вложенный статический класс (HumanBuilder)
        // 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
        // Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
        // 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
        // которые вызывают сеттеры у экземпляра класса Human.
        // 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
        // Ожидаемый результат
        // Human human = Human.builder().name("Петр").age(20).weight(80).build();
        // human.info()
        // Петр - возраст 20, вес 80
        Human.HumanBuilder builder = Human.builder();
        Human petr = builder.age(20).name("petr").weight(80).build();
        petr.info();


        //Задача №2
        // Реализовать паттерн Decorator для класса Car (атрибут - стоимость, метод - вывести на экран стоимость).
        // Метод вывести на экран стоимость - выкидывает ошибку, если стоимость меньше 0
        // Для этого шаблона характерно:
        // 1. Класс основа (Car), и класс декоратор (CarShop), который принимает в себя класс основу
        // 2. Вызов всех методов происходит у декоратора
        // Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимость 5000
        // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        // 5000 - (вызванно из объекта Car)
        // Хочешь купить авто? (Вызвано из объекта CarShop)

        // Если стоимость машины меньше нуля:
        // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        // Неизвестна мне - (вызванно из объекта Car)
        // Давайте посмотрим другое авто? (Вызвано из объекта CarShop)
        Car car = new Car(-1);
        CarShop carShop = new CarShop(car);
        carShop.sellCar();
    }
}
