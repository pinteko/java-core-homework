package ru.geekbrains.java.core.classworks.classwork6_oop2;

public class Cat extends Animal {
    //    private int name;

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("%s meaw\n", name);
    }
}
