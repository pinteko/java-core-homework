package ru.geekbrains.java.core.classworks.classwork6_oop2;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.printf("%s bark\n", name);
    }

    //    @Override
    public static void doSomethingStatic() {
        System.out.println("DOGGGG");
    }
}
