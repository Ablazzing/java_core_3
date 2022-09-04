package org.lessons.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Fish fish = new Fish();
//        boat.swim();
//        boat.crush();
//        fish.swim();

        Boat boat2 = new Boat();
        Fish fish2 = new Fish();
        Swimable[] swimables = {boat2, fish2};
        for (Swimable swimable : swimables) {
            swimable.swim();
            swimable.takeWater();
        }

        Animal tiger = new Tiger();
        Animal cat = new Cat();
        cat.eat();
        //Tiger -> Animal -> Object

        String country = "Zombieland";
        Country country1 = Country.USA;
        country1.getCountPeople();


        EnumCountry country2 = EnumCountry.USA;
        country2.consoleName();
        country2.getCountPeople();


    }
}
