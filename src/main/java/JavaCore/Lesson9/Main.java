package JavaCore.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Student> students = new ArrayList<Student>(Arrays.asList(
            new Student("Pavel", Arrays.asList(new Course("Pyton"))),
            new Student("Nikola", Arrays.asList(new Course("DevOps"), new Course("Java"))),
            new Student("Oksana", Arrays.asList(new Course("DevOps"), new Course("Data Science"),
                    new Course("Pyton")))
    ));
    public static Course course = new Course("DevOps");

    // Написать функцию, принимающую список Student и возвращающую список
    // уникальных курсов, на которые подписаны студенты.

    public static List<Course> uniqueCourse(List<Student> students) {
        return students.stream()
                .map(f -> f.getCourses())
                .flatMap(f -> f.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    //Написать функцию, принимающую на вход список Student и возвращающую
    // список из трех самых любознательных (любознательность определяется количеством курсов).

    public static List<Student> inquisitiveStudent(List<Student> students) {
        return students.stream()
                .sorted((p1, p2) -> p2.getCourses().size() - p1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList());
    }
    //Написать функцию, принимающую на вход список Student и экземпляр Course,
    //возвращающую список студентов, которые посещают этот курс.

    public static List<String> popularCourse(List<Student> students, Course course) {
        return students.stream()
                .filter(p -> p.getCourses().contains(course))
                .map(Student::getName)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println("Список уникальных курсов:");
        System.out.println(uniqueCourse(students));
        System.out.println("Самые любознательные студенты:");
        System.out.println(inquisitiveStudent(students));
        System.out.println("Имена студенов, посещающие один курс.");
        System.out.println(popularCourse(students, course));
    }
}
