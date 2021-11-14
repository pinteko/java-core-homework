package ru.geekbrains.java.core.classworks.classwork6_oop2;

public class Parrot extends Bird{
    public Parrot(String name, String color) {
        super(name, color);
    }

    public void speak() {
        System.out.printf("%s: 'ndnfndfn'\n", name);
    }
}
