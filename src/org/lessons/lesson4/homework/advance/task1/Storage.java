package org.lessons.lesson4.homework.advance.task1;

public class Storage {
    private int vodkaCount;

    public Storage(int vodkaCount) {
        this.vodkaCount = vodkaCount;
    }

    public int getVodkaCount() {
        return vodkaCount;
    }

    public void setVodkaCount(int vodkaCount) {
        this.vodkaCount = vodkaCount;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "vodkaCount=" + vodkaCount +
                '}';
    }
}
