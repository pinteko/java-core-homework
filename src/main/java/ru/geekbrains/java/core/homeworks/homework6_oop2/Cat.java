package ru.geekbrains.java.core.homeworks.homework6_oop2;

public class Cat extends Animal {

    public static int catCount = 0;

    public Cat(String name, String color) {
        super(name, color);
        catCount++;
    }

    @Override
    public void run(int metres) {
        if (metres > 0 && metres <= 500) {
            System.out.printf("%s run %d metres\n", name, metres);
        }
        else {
            System.out.printf("%s: it's ridiculous!\n", name);
        }
    }

    @Override
    public void eat(String typeOfEat) {
        if (typeOfEat.equalsIgnoreCase("bird") || typeOfEat.equalsIgnoreCase("mouse")) {
            System.out.printf("%s ate a %s\n", name, typeOfEat);
        }
        else {
            System.out.println(name + ": I don't eat it!");
        }

    }

    public void swim(int metres) {
        System.out.println(name + ": I don't swim!");

    }
}
