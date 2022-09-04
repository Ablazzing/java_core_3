package org.lessons.lesson5;

public enum Country {
    RUSSIA(146), USA(330), JAPAN(180);
    public static int age = 100;
    private final int countPeople;

    private Country(int countPeople) {
        this.countPeople = countPeople;
    }

    public void consoleName() {
        System.out.println(this.name());
    }

    public int getCountPeople() {
        return countPeople;
    }
}
