package ru.geekbrains.java.core.classworks.classwork6_oop2;

public class Classwork {
    public static void main(String[] args) {
//        simpleExample();
//        simplePolyExample();
//        polyArrayExample();
        Cat cat = new Cat("Barsik", "white");
        Animal dog = new Dog("Bobik", "brown");
        Animal bird = new Bird("Chizhik", "yellow");
        dog.doSomethingStatic();
        System.out.println(bird.TYPE);

        Animal.doSomethingStatic();
        System.out.println(Animal.TYPE);

        Dog.doSomethingStatic();
        System.out.println(Bird.TYPE);
    }

    private static void polyArrayExample() {
        Animal[] animals = {
                new Cat("Barsik", "white"),
                new Dog("Bobik", "brown"),
                new Snake("Kaa", "green"),
                new Bird("Chizhik", "yellow"),
                new Parrot("Kesha", "blue"),
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].walk();
            animals[i].voice();

            if (animals[i] instanceof Bird) {
                ((Bird) animals[i]).fly();
            }
            if (animals[i] instanceof Parrot p) {
                p.speak();
            }
//            if (i == 2) {
//                Bird b = (Bird) animals[i];
//                b.fly();
//            }
        }

//        Snake s = new Snake("dfdf", "dff");
//        s.walkAsParent();
    }

    private static void simplePolyExample() {
//        Animal animal1 = new Animal();
//        Cat cat = new Animal();
        Animal animal2 = new Cat("Murzik", "black");
        Object animal3 = new Dog("Tuzik", "black");
    }

    private static void simpleExample() {
        Cat cat = new Cat("Barsik", "white");
        Dog dog = new Dog("Bobik", "brown");
        Bird bird = new Bird("Chizhik", "yellow");

        cat.voice();
        cat.walk();
        dog.voice();
        dog.walk();
        bird.voice();
        bird.walk();
    }
}
