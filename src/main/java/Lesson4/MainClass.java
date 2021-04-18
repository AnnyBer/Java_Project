package Lesson4;

public class MainClass {
    public static void main(String[] args) {

        Employee coWorker = new Employee("Ivanov", "Ivan",
                "Ivanich", "director", "+7 999 888 77 66",
                55000, 1977);

// 4 Вывести при помощи методов из пункта 3 ФИО и должность.

        System.out.println("Hi! My name is " + coWorker.getSurname() + " " + coWorker.getName() + " " + coWorker.getSecondName()
                + ", and my position " + coWorker.getPosition() + "! Nice to meet you ;)");

// 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Employee[] dreamTeam = new Employee[5];
        {
            dreamTeam[0] = new Employee("Petrov", "Petr", "Petrovich", "project Manager",
                    "+7 888 777 66 55", 45000, 1988);
            dreamTeam[1] = new Employee("Aleksanrova", "Aleksandra", "Aleksandrovna", "designer",
                    "+7 777 666 55 44", 35000, 1990);
            dreamTeam[2] = new Employee("Kodin", "Sergey", "Sergeevich", "developer",
                    "+7 666 555 44 33", 55000, 1965);
            dreamTeam[3] = new Employee("Bugina", "ludmila", "Nikolaevna", "tester",
                    "+7 555 444 33 22", 40000, 1985);
            dreamTeam[4] = new Employee("Durov", "Artem", "Pavlovich", "system administrator",
                    "+7 444 333 22 11", 50000, 1973);
        }
        for (int i = 0; i < dreamTeam.length; i++)
            if (dreamTeam[i].getAge() > 40) {
                System.out.println(dreamTeam[i].getFullInfo());
            } else {
                System.out.println("Сотрудник молод, но уже умён. Ему нет 40 лет.");
            }
    }
}
