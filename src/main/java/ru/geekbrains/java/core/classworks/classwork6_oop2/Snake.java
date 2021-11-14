package ru.geekbrains.java.core.classworks.classwork6_oop2;

public final class Snake extends Animal {
    public Snake(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("%s: Sssshh \n", name);
    }

    @Override
    public void walk() {
        System.out.printf("%s: crawling \n", name);
    }

    public void walkAsParent() {
        super.walk();
    }
}
