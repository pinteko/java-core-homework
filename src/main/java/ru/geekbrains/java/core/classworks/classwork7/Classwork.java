package ru.geekbrains.java.core.classworks.classwork7;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
//        stringsComparing();
//        stringBuilderExample();
//    JSON
//        catsAndBowls();
//        fightExample();
//        weekDayEnumExample();
//        enumOperatorExample();
//        innerClassExample();
        Car.NestedClassExample nested = new Car.NestedClassExample();

        class LocalClassExample {
            private String some;

            public LocalClassExample(String some) {
                this.some = some;
            }

            public String getSome() {
                return some;
            }

            public void setSome(String some) {
                this.some = some;
            }
        }

        class LocalChild extends LocalClassExample {
            public LocalChild(String some) {
                super(some);
            }
        }
    }

    private static void innerClassExample() {
        Car car = new Car("LADA", 500);
        Car.Engine engine1 = car.getEngine();
//        Car.Engine engine2 = new Car.Engine();
        Car.Engine engine3 = car.new Engine(1000);
        Car.Engine engine4 = new Car("Volga", 200).new Engine(400);
    }

    private static void enumOperatorExample() {
        Operator op = Operator.SUM;
        System.out.println(op.operation(10,14));
        op = Operator.MUL;
        System.out.println(op.operation(12, 3));
    }

    private static void weekDayEnumExample() {
        WeekDay day = WeekDay.TUESDAY;
        System.out.println(day);
        System.out.println(day.ordinal());
        day = WeekDay.SATURDAY;
        System.out.println(day.getDayNumber());
        System.out.println(day.getRussianTitle());
        WeekDay newDay = WeekDay.SATURDAY;
        System.out.println(day == newDay);
    }

    private static void fightExample() {
        var fighter1 = new Fighter("Scorpion", 100, 10);
        var fighter2 = new Fighter("Sub Zero", 130, 8);

        while(true) {
            fighter1.hit(fighter2);
            if (!fighter2.isAlive()) {
                break;
            }
            fighter2.hit(fighter1);
            if (!fighter1.isAlive()) {
                break;
            }
        }
    }

    private static void catsAndBowls() {
        Cat[] cats = {
                new Cat("Barsik", 100),
                new Cat("Murzik", 150),
                new Cat("Zhorik", 300)
        };

        var bowl = new Bowl(); //java 10+
        bowl.putFood(600);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
    }

    private static void stringBuilderExample() {
        String s1 = "Example";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++) {
            s1 += i;
        }
        long delta = System.currentTimeMillis() - startTime;
        System.out.println("String time: " + delta);

        StringBuilder sb = new StringBuilder("Example");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++) {
            sb.append(i);
        }
        delta = System.currentTimeMillis() - startTime;
        System.out.println("String builder time: " + delta);

        StringBuffer stringBuffer = new StringBuffer("Example");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 300_000; i++) {
            stringBuffer.append(i);
        }
        delta = System.currentTimeMillis() - startTime;
        System.out.println("String buffer time: " + delta);
    }


    private static void stringsComparing() {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = new String("Hi");
        String s4 = new String(s1);
        String s5 = "H";
        String s6 = "i";
        String s7 = s5 + s6;
        char[] chars = {'H', 'i'};
        String s8 = new String(chars);
        String s9 = new String(new byte[]{72, 105}).intern();
        String s10 = scanner.next().intern();

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1 == s7);
//        System.out.println(s1 == s8);
//        System.out.println(s1 == s9);
//        System.out.println(s1 == s10);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s7));
        System.out.println(s1.equals(s8));
        System.out.println(s1.equals(s9));
        System.out.println(s1.equals(s10));

//        System.out.println((int)chars[0]);
//        System.out.println((int)chars[1]);
    }
}
