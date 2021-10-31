package ru.geekbrains.java.core.homeworks.homework3;

import java.util.Arrays;
import java.util.Random;

public class HomeworkMassive {
    public static void main(String[] args) {
        firstMassive();
        massiveHundred();
        sixOnTwo();
        squareMassive();
        System.out.println(Arrays.toString(createYourMassive(5, 77)));
        minMaxMassive();
        int[] arrMassive = {7, 5, 2, 1, 1, 6, 8, 2};
        System.out.println((middleMassive(arrMassive)));
        System.out.println(Arrays.toString(eight(arrMassive, 10)));

    }

    public static void firstMassive() {
        int[] massive = new int[10];
        Random rand = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = rand.nextInt(2);
        }
        System.out.println(Arrays.toString(massive));
        for (int j = 0; j < massive.length; j++) {
            if (massive[j] == 0) {
                massive[j] = 1;
            }
            else {
                massive[j] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));
    }

    public static void massiveHundred() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
    }

    public static void sixOnTwo() {
        int[] hook = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < hook.length; i++) {
            if (hook[i] < 6) {
                hook[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(hook));
    }

    public static void squareMassive() {
        int[][] square = new int[7][7];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j || i + j == 6) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createYourMassive(int len, int initialValue) {
        int[] cat = new int[len];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = initialValue;
        }
        return cat;
    }

    public static void minMaxMassive() {
        Random random = new Random();
        int[] minMax = new int[random.nextInt(20)];
                for (int i = 0; i < minMax.length; i++) {
                    minMax[i] = random.nextInt();
                }
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < minMax.length; j++) {
            if (max < minMax[j]) {
                max = minMax[j];
            }
        }
            System.out.println("Максимум:" + max);
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < minMax.length; k++) {
                if (min > minMax[k]) {
                    min = minMax[k];
                }
            }
                System.out.println("Минимум:" + min);
        }

        public static boolean middleMassive(int[] mid) {
            int oneSum = 0;
            int twoSum = 0;
            for (int i = 0; i < mid.length - 1; i++) {
                oneSum = oneSum + mid[i];
                for (int j = i; j < mid.length - 1; j++) {
                    twoSum = twoSum + mid[j + 1];
                }
                if (oneSum == twoSum) {
                    return true;
                }
                else {
                    twoSum = 0;
                }
            }
            return false;
        }

        public static int[] eight(int[] cycle, int offset) {
            if (offset >= 0) {
                if (offset >= cycle.length) {
                    offset = offset - cycle.length;
                }
                for (int i = 0; i < offset ; i++) {
                    int copy = cycle[cycle.length - 1];
                    for (int j = 0; j < cycle.length - 1; j++) {
                        cycle[cycle.length - j - 1] = cycle[cycle.length - j - 2];
                    }
                    cycle[0] = copy;
                }
            }
            else {
                if (Math.abs(offset) >= cycle.length) {
                    offset = Math.abs(offset) - cycle.length;
                }
                else {
                    offset = Math.abs(offset);
                }
                for (int i = 0; i < offset; i++) {
                    int copy = cycle[0];
                    for (int j = 0; j < cycle.length - 1; j++) {
                        cycle[j] = cycle[j + 1];
                    }
                    cycle[cycle.length - 1] = copy;
                }
                }
            return cycle;
        }
}




