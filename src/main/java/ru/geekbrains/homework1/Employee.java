package ru.geekbrains.homework1;

public class Employee {

    public String name;
    public String position;
    public String email;
    public String number;
    public int salary;
    public int age;


    public Employee(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public void info() {
        System.out.println(name + " " + position + " " + email + " " + number + " " + salary + " " + age);
    }
}
