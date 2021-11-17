package ru.geekbrains.java.core.classworks.classwork7;

public class Car {
    private String name;
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Door door1;
    private Door door2;

    public Car(String name, int power) {
        this.name = name;
        this.engine = new Engine(power);
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.wheel4 = new Wheel();
        this.door1 = new Door();
        this.door2 = new Door();
    }

    public void doSomething() {
        System.out.println(engine.power);
    }

    //inner class
    public class Door {

    }

    public class Wheel {
        public void doSomething() {
            System.out.println(name);
        }
    }

    public class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public Wheel getWheel3() {
        return wheel3;
    }

    public Wheel getWheel4() {
        return wheel4;
    }

    public Door getDoor1() {
        return door1;
    }

    public Door getDoor2() {
        return door2;
    }

    //Nested
    public static class NestedClassExample {

    }
}
