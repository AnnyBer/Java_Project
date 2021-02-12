package Lesson4;

public class Employee {
    private static int thisYear = 2021;

    String surname;
    String name;
    String secondName;
    String position;
    String phone;
    float salary;
    int birthYear;

// 2 Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee (String surname, String name, String secondName, String position, String phone,float salary, int birthYear) {

        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }

// 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;

    String getSurname() {
        return surname;
    }

    String getName() {
        return name;
    }

    String getSecondName() {
        return secondName;
    }

    String getPosition() {
        return position;
    }

    String getPhone() {
        return phone;
    }

    float getSalary() {
        return salary;
    }

    int getAge() {
        return thisYear - birthYear;
    }

    String getFullInfo() {
        return this.surname + " " + this.name + " " + this.secondName
                + ", " + this.getAge() + " years old. Tel: " +
                this.phone + " . Salary " + this.salary +
                " for the position of " + this.position + " .";
    }
}
