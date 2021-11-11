package ru.geekbrains.java.core.classworks.classwork5oop1;

public class SomeClass {
    public static void main(String[] args) {
//        ru.geekbrains.java_core1.lessons.lesson5_oop.Cat cat = new ru.geekbrains.java_core1.lessons.lesson5_oop.Cat();
//        cat.name = "";

        Object[] objects = {
                "Hello",
                10,
                25,
                "jbvjnbdv",
                '3',
                4
        };
        System.out.println(findMaxNumFromObjectArray(objects));
//        System.out.println(null < 5);
    }

    static int findMaxNumFromObjectArray(Object[] arr) {
        Integer max = null;
        for (Object o : arr) {
            if (o instanceof Integer) {
                if (max == null) max = (Integer) o;
                else max = max < (Integer) o ? (Integer) o : max;
            }
        }
        return max;
    }
}
