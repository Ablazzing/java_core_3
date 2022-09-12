package org.lessons.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Object human2 = new Human("Yuri", 19, 80);


        //toString - получение текстового представление объекта
        System.out.println(human2.toString());

        //getClass - получение класса объекта
        System.out.println(human2.getClass());

        //hashCode - получение хэша объекта
        System.out.println(human2.hashCode());

        Human petr = new Human("Petr", 19, 80);
        Human ivan = new Human("Ivan", 19, 80);

        System.out.println(petr.hashCode());
        System.out.println(ivan.hashCode());
//        if (petr.getName().equals(ivan.getName())
//                && petr.getAge() == ivan.getAge()
//                && petr.getWeight() == ivan.getWeight()) {
//
//        }
//
//        if (petr.hashCode() == ivan.hashCode() && petr.equals(ivan) ) {
//
//        }
        System.out.println(petr.equals(human2));

//        for (int i = 0; i < 1000; i++) {
//            Human yuri = new Human("Yuri", 20, 100);
//            Runtime.getRuntime().gc();
//        }


        Human petrClone = new Human(petr.getName(), petr.getAge(), petr.getWeight());


        Human petrClone2 = (Human) petr.clone();
        petr.setAge(30);
        System.out.println(petrClone2);
        System.out.println(petr);


        Human[] humans = new Human[10];
        for (int i = 0; i < 9; i++) {
            humans[i] = new Human("Yuri", 20, 100);
        }
        humans[9] = new Human("Yuri", 20, 100);
        boolean result = true;

        for (int i = 0; i < humans.length; i++) {
           if (!humans[i].equals(humans[0])) {
               result = false;
               break;
           }
        }



        System.out.println(result);

    }
}
