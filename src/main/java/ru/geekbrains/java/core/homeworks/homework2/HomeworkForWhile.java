package ru.geekbrains.java.core.homeworks.homework2;

import java.util.Scanner;

public class HomeworkForWhile {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.println(amountInteger(((int) Math.random() * 7), ((int) Math.random() * 20) ));
        amountPositiveNegative((int) (Math.random() * 1000 - 500));
        System.out.println(amountOppositePositiveNegative((int) (Math.random() * 10 - 5)));
        System.out.println("Введите строку");
        String user = sc.nextLine();
        System.out.println("Введите число");
        int userCount = sc.nextInt();
        printString(user, userCount);
        System.out.println("Введите год у узнайте вискокосный ли он");
        System.out.println(leapYear(sc.nextInt()));

        }

        public static boolean amountInteger(int a, int b) {
        boolean bool;
        if ((a + b >= 10) && (a + b <=20)) { bool = true; }
            else {bool = false;}
            return bool;
        }

        public static void amountPositiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
        }

        public static boolean amountOppositePositiveNegative(int a) {
        boolean bool;
        if (a >= 0) {
            bool = false;
        }
        else {
            bool = true;
        }
        return bool;
        }

        public static void printString(String str, int count) {
        for (int a = 0; a < count; a++) {
            System.out.println(str);
        }
        }

        public static boolean leapYear(int year) {
            boolean bool;
            if ((year % 4 == 0)) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                } else {
                    bool = true;
                } }
                else {
                    bool = false;
                }
                return bool;
        }
}

