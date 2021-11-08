package ru.geekbrains.homework1;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int run) {
        System.out.println(name + " " + "пробежал" + " " + run);
        if (run > 200) {
            System.out.println("кошка сдохла");
        }
    }

    @Override
    public void swim(int swim) {
        System.out.println(name + " " + "проплыл" + " " + swim);
        if (swim > 0) {
            System.out.println("кошка сдохла");
        }
    }
}
