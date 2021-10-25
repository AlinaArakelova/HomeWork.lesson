package ru.geekbrains.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Алина", "Менеджер", "mail@mail.ru", "8988111111", 100000, 29);
        employees[1] = new Employee("Денис", "Программист", "mail@gmail.ru", "8800533575", 100000, 41);
        employees[2] = new Employee("Тима", "Музыкант", "mail@gmail.ru", "8800533575", 20000, 45);
        employees[3] = new Employee("Даник", "Секретарь", "mail@gmail.ru", "8900569076", 5000, 25);
        employees[4] = new Employee("Мага", "Директор", "mail@gmail.ru", "8800533575", 300000, 39);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].info();
            }
        }
    }
}
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.