package ru.geekbrains.java.core.homeworks.homework6_oop2;

public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog(String name, String color) {
        super(name, color);
        dogCount++;
    }

    @Override
    public void run(int metres) {
        if (metres > 0 && metres <= 1000) {
            System.out.printf("%s run %d metres\n", name, metres);
        }
        else {
            System.out.printf("%s: it's ridiculous!\n", name);
        }
    }

    @Override
    public void eat(String typeOfEat) {
        if (typeOfEat.equalsIgnoreCase("cat") || typeOfEat.equalsIgnoreCase("rabbit")) {
            System.out.printf("%s ate a %s\n", name, typeOfEat);
        }
        else {
            System.out.println(name + ": I don't eat it!");
        }
    }

    public void swim(int metres) {
        if (metres > 0 && metres <= 100) {
            System.out.printf("%s sailed %d metres\n", name, metres);
        }
        else {
            System.out.println(name + ": Are you crazy?");
        }

    }
}
