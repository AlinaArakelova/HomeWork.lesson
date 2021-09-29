package ru.geekbrains.homework1;


public class HomeWorkApp {
    public static void main(String[] args) {
        if (checkSum(4, 6)) {

        } else {

        }

        printLines(9, "alina");

        for (var i = 2000; i < 2030; i++) {
            System.out.println(i + " year = " + checkYear(i));
        }
    }

    public static boolean checkSum(int a, int b) {
        int i = a + b;
        //return (i >= 10 && i <= 20);
        if (i >= 10 && i <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }



    public static boolean checkNumberNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void printLines(int n, String l) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + l);
        }
    }
}
