package ru.geekbrains.java.core.homeworks.homework7;

public class Bowl {
    private String color;
    private int foodAmount;
    private int foodMaxAmount;

    public Bowl(String color, int foodAmount, int foodMaxAmount) {
        this.color = color;
        this.foodAmount = foodAmount;
        this.foodMaxAmount = foodMaxAmount;
    }

    public void putFood(int amount) {
        if (foodMaxAmount - foodAmount - amount >= 0) {
            this.foodAmount += amount;
            System.out.printf("%s bowl increased by %d pts, there is now %d\n", color, amount, foodAmount);
        }
        else {
            this.foodAmount = this.foodMaxAmount;
            System.out.printf("%s bowl increased by %d pts. Bowl is full, there is now %d\n", color, amount, foodMaxAmount);
        }
    }

    public void decreaseFood(int amount) {
        if (foodAmount - amount >= 0) {
            this.foodAmount -= amount;
            System.out.printf("Food decreased by %d pts, in %s bowl now %d\n", amount, color, foodAmount);
        }
        else {
            this.foodAmount = 0;
            System.out.println("Bowl is empty");
        }
    }


    public String getColor() {
        return color;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodMaxAmount() {
        return foodMaxAmount;
    }

}
