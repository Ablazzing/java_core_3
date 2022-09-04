package org.lessons.lesson5.task1;

public class Phone extends Electronic implements Soundable{

    public Phone() {
        super(SocketType.USSR);
    }

    public void call() {
        System.out.println("Телефон звонит");
    }

    @Override
    public void sound() {
        System.out.println("Играет рингтон");
    }
}
