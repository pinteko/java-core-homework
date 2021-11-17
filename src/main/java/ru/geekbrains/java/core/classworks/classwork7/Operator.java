package ru.geekbrains.java.core.classworks.classwork7;

public enum Operator {
    SUM {
        public int operation(int a, int b) {
            return a + b;
        }
    },
    MUL {
        public int operation(int a, int b) {
            return a * b;
        }
    };

    public abstract int operation(int a, int b);
}
