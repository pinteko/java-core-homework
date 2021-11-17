package ru.geekbrains.java.core.classworks.classwork7;

public class Bowl {
    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
        System.out.printf("Food decreased by %d pts, there is now %d\n", amount, foodAmount);
    }


    public int getFoodAmount() {
        return foodAmount;
    }
}
