package ru.geekbrains.java.core.homeworks.homework1;

public class HomeWorkApp {
    public static void main( String[] args )
    {
        printThreeWords();
        System.out.println(checkSumSign());
        System.out.println(printColor());
        System.out.println(compareNumbers());

    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static String checkSumSign() {
        int a = (int) (Math.random() * 40 - 20);
        int b = (int) (Math.random() * 100 - 50);
        String s;
        int c = a + b;
        if (c >= 0) {
          s = "Сумма положительная";
        }
        else {
          s = "Сумма отрицательная";
        }
        return s;
    }

    public static String printColor() {

        int value = (int) (Math.random() * 200 - 100);
        String s;
        if (value <= 0) {
            s = "Красный";
        }
        else if ((value > 0) && (value <= 100)) {
            s = "Желтый";
        }
        else {
            s = "Зеленый";
        }
        return s;
    }

    public static String compareNumbers() {
        int a = (int) (Math.random() * 20 - 10);
        int b = (int) (Math.random() * 30 - 15);
        String s;
        if (a >= b) {
            s = "a >= b";
        }
        else { s = "a < b";}
        return s;
    }
}
