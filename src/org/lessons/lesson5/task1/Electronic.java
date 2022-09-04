package org.lessons.lesson5.task1;

public abstract class Electronic {
    private SocketType socketType;

    public Electronic(SocketType socketType) {
        this.socketType = socketType;
    }

    public SocketType getSocketType() {
        return socketType;
    }
}
