package ru.geekbrains.java.core.classworks.classwork2;


public class Classwork {
    public static void main(String[] args) {
   // printSomethingIntoConsole();
    //printArgumentValueIntoConsole("hello");
    //double someNumber = calculateSomeExpression(0.24, 5.23);
   // vendingWithIfs();
    // vendingWithSwitch();
    //vendingWithSwitchModern();
     //   whileExample();
     //   forLoopExample();
     //   forForExample();
      //  arraySimpleExample();


String[] strings = {
        "March",
        "April",
        "May",
        "June" };
    for (String s : strings )  //iter
    {
        System.out.println(s);
    }


    }

public static void arraySimpleExample() {
    int[] arr = new int[7];
    arr[0] = 10;
    arr[1] = 10;
    arr[2] = 20;
    arr[3] = 30;
    arr[4] = 40;
    arr[5] = 50;
    arr[6] = 60;
    arr[1] = arr[1] + arr[3] / arr[2];
    System.out.println(arr[1]);

    int[] arr1 = {1, 2, 3, 4, 4, 5, 6, 6};

    System.out.println(arr1.length);

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

  public static void forForExample() {
              for (int i = 0; i < 10; i++) {
            System.out.printf("Exercise #%d:", i);
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " ");
                if (j == 4) {
                    break;
                }
            }
            System.out.println();
        }
  }

    public static void forLoopExample() {
        for (int a = 0, b = 10, c = 100; a < 10 && b > 0 && c > 10; a++, b--, c -=10) {
            System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }

    public static void whileExample() {
        int counter = 1;
        while (counter < 21) {

            counter++;
            if (counter % 3 == 0) {
                continue;
            }
            System.out.println(counter);
            if (counter == 10) {
                break;
            }
        }
    }

    public static void vendingWithIfs() {
        int choice = 2;
        if (choice == 1) {
            System.out.println("Give Lays");
        }
        else if (choice == 2) {
            System.out.println("Give Cheetos");
        }
        else if (choice == 3) {
            System.out.println("Give Coca Cola");
        }
        else if (choice == 4) {
            System.out.println("Give Pepsi");
        }
        else if (choice == 5) {
            System.out.println("Give Snickers");
        }
        else {
            System.out.println("Error. Try Again");
        }
    }

    public static void vendingWithSwitch() {
        int choice = 3;
        switch (choice) {
            case 1:
            case 8:
            case 24: //для кейсов 1, 8, 24  вызовется Give Lays
            System.out.println("Give Lays");
            break;
            case 2:
            System.out.println("Give Cheetos");
            break;
            case 3:
            System.out.println("Give Coca Cola");
            break;
            case 4:
            System.out.println("Give Pepsi");
            break;
            case 5:
            System.out.println("Give Snickers");
            break;
            default:
            System.out.println("Error. Try Again");
        }
    }

    public static void vendingWithSwitchModern() { //Java 14+
        int choice = 5;
        switch (choice) {
            case 1, 43 -> System.out.println("Give Lays");
            case 2 -> System.out.println("Give Cheetos");
            case 3 -> System.out.println("Give Coca Cola");
            case 4 -> {
                System.out.println("Give Pepsi");
                //....
            }
            case 5 -> System.out.println("Give Snickers");
            default -> System.out.println("Error. Try Again");
        }
    }


    public static void printSomethingIntoConsole() {
        System.out.println("Something");
    }

    public static void printArgumentValueIntoConsole(String word) {
        System.out.printf("Your argument was: %s\n", word); //souf
    }

    public static double calculateSomeExpression(double firstValue, double secondValue) {
        double result = firstValue / secondValue;
        System.out.println("Calculating...");
       // System.out.println("first value: " + firstValue + "; second value: " + secondValue + "; result is: " + result);
       // System.out.printf("First value: %f; second value: %f; result is: %f\n", firstValue, secondValue, result);
        String s = String.format("First value: %.02f; second value: %f; result is: %f\n", firstValue, secondValue, result);
        /*
         * %s - string and universal
         * %d - integers
         * %f - floats
         * %c - characters
         *  %b - boolean
         */
        System.out.print(s);
        return result;

    }
}
