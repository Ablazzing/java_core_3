package org.lessons.lesson4.homework.base.task2;

public class Computer extends Electronic{
    @Override
    public void work() {
        System.out.println("выполняет вычисления");
    }

    public void loadSystem() {
        System.out.println("Загрузка компьютера");
    }
}
