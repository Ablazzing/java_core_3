package org.lessons.lesson4.homework.base.task2;

public abstract class Electronic {
    // 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
    // подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    abstract void work();
}
