package ru.geekbrains.java.core.homeworks.homework5oop1;

public class Employees {
    public static void main(String[] args) {
        StaffMember[] employees = new StaffMember[5];
        employees[0] = new StaffMember("Ihar Kruk", "master", "iharkruk@gmail.com", 32450980, 3000, 28);
        employees[1] = new StaffMember("Nasik Zhuk", "videographer", "nasikzhik@gmail.com", 23434676, 2500, 24);
        employees[2] = new StaffMember("Kirill Korsuk", "developer", "korsukkirill@gmail.com", 34696554, 4000, 53);
        employees[3] = new StaffMember("Vova Pablo", "electric", "vovchap@gmail.com", 76945646, 3000, 29);
        employees[4] = new StaffMember("Oleg G", "worker", "olega@gmail.com", 23445232, 2500, 78);

        for (int i = 0; i < employees.length; i++) {
            int age = employees[i].getAge();
            if (age > 40) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
