package ru.geekbrains.java.core.homeworks.homework6_oop2;

public abstract class Animal {
    protected String name;
    protected String color;
    public static int animalCount = 0;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        animalCount++;
    }

    public abstract void run(int metres);

    public abstract void swim(int metres);

    public abstract void eat(String typeOfEat);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



