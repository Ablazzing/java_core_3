package org.lessons.lesson8;

//кола;10;50
public class Good {
    private String name;
    private int amount;
    private double price;

    public Good(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public String getCsvFormat() {
        return name + ";" + amount + ";" + price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
