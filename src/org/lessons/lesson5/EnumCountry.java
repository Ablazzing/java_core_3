package org.lessons.lesson5;

public class EnumCountry {
    public static int age = 10;
    public static final EnumCountry RUSSIA = new EnumCountry("Russia", 145);
    public static final EnumCountry JAPAN = new EnumCountry("JAPAN", 180);
    public static final EnumCountry USA = new EnumCountry("USA", 330);
    private String name;
    private final int countPeople;

    private EnumCountry(String name, int countPeople) {
        this.name = name;
        this.countPeople = countPeople;
    }

    public void consoleName() {
        System.out.println(this.name);
    }

    public int getCountPeople() {
        return countPeople;
    }
}
