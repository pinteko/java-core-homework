package ru.geekbrains.java.core.homeworks.homework7;



public class Cat {
    private String name;
    private int appetite;
    private boolean done;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.done = false;
    }


    public boolean full(Bowl bowl) {
        return appetite <= bowl.getFoodAmount();
    }

    public void eat(Bowl bowl) {
        if (full(bowl)) {
            bowl.decreaseFood(appetite);
            System.out.printf("Cat %s has ate for %d food from %s bowl\n", name, appetite, bowl.getColor());
            done = true;
        }
        else {
            int balance = bowl.getFoodAmount();
            int hungry = appetite - balance;
            bowl.decreaseFood(balance);
            appetite = hungry;
            System.out.printf("Cat %s has ate for %d food from %s bowl. Cat still hungry. Appetite is %d\n", name, balance, bowl.getColor(), hungry);
        }

    }

    public void eatTwo(Bowl bowl) {
        bowl.decreaseFood(appetite);
        System.out.printf("Cat %s has ate for %d food from %s bowl\n", name, appetite, bowl.getColor());
        done = true;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isDone() {
        return done;
    }
}
