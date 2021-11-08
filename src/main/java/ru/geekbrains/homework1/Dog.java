package ru.geekbrains.homework1;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int run) {
        System.out.println(name + " " + "пробежал" + " " + run);
    }

    @Override
    public void swim(int swim) {
        System.out.println(name + " " + "проплыл" + " " + swim);

    }
}
