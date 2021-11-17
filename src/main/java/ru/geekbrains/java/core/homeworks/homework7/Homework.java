package ru.geekbrains.java.core.homeworks.homework7;

public class Homework {
    public static void main(String[] args) {


        Cat[] cats = {
                new Cat("Lucky", 20),
                new Cat("Bonny", 29),
                new Cat("Max", 11),
                new Cat("Fill", 25),
                new Cat("Pancho", 17)
        };

        Bowl blue = new Bowl("Blue", 0, 80);
        Bowl yellow = new Bowl("Yellow", 0, 150);
        blue.putFood(90);
        yellow.putFood(160);

        for (Cat catty: cats) {
            if (blue.getFoodAmount() > 0) {

                if (catty.full(blue)) {
                    catty.eat(blue);
                }
                else {
                    catty.eat(blue);
                    catty.eatTwo(yellow);
                }
            }
            else {
                catty.eat(yellow);
            }
        }

        System.out.println("Now in Blue bowl " + blue.getFoodAmount() + " amount of food.");
        System.out.println("Now in Yellow bowl " + yellow.getFoodAmount() + " amount of food.");

        for (Cat cat: cats) {
            System.out.printf("Cat %s is full? %s\n", cat.getName(), cat.isDone());

        }

    }

}
