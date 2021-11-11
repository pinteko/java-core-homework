package ru.geekbrains.java.core.homeworks.homework5oop1;

import java.time.Year;

public class StaffMember {
    private String fullName;
    private String position;
    private String email;
    private int phoneHumber;
    private int salary;
    private int birthYear;

    public StaffMember(String fullName, String position, String email, int phoneHumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneHumber = phoneHumber;
        this.salary = salary;
        this.birthYear = Year.now().getValue() - age;
    }

    @Override
    public String toString() {
        return String.format("Staff member: %s. Position: %s. Email: %s. Phone number: %d. Salary: %d. Age: %d", fullName, position, email, phoneHumber, salary, getAge());
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

}
