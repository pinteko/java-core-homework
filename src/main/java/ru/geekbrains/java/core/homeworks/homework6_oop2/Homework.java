package ru.geekbrains.java.core.homeworks.homework6_oop2;

public class Homework {
    public static void main(String[] args) {
        Animal dogBillie = new Dog("Billie", "yellow" );
        dogBillie.run(1100);
        dogBillie.swim(100);
        dogBillie.eat("lion");
        Animal catLucky = new Cat("Lucky", "grey");
        catLucky.run(490);
        catLucky.eat("mouse");
        catLucky.swim(50);
        Animal dogSkif = new Dog("Skif", "black");
        dogSkif.eat("rabbit");
        dogSkif.swim(50);
        dogSkif.run(400);
        Animal catTom = new Cat("Tom", "white");
        catTom.swim(90);
        catTom.eat("dog");
        catTom.run(1000);
        System.out.println(Dog.dogCount + "dog(s) in our house");
        System.out.println(Cat.catCount + "cat(s) in our house");
        System.out.println(Animal.animalCount + "animal(s) in our house");
        }

    }

