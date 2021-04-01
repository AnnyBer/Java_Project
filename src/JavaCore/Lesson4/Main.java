package JavaCore.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.

        String[] listWord = {"car", "cat", "map", "hat", "cat", "car", "red"};
        HashMap<String, Integer> matchWorlds = new HashMap<>();

        for (int i = 0; i < listWord.length; i++) {
            if (matchWorlds.containsKey(listWord[i])) {
                matchWorlds.put(listWord[i], matchWorlds.get(listWord[i]) + 1);
            } else {
                matchWorlds.put(listWord[i], 1);
            }
        }
        System.out.println("1. Вывод списка уникальных слов с посчетом сколько раз они встречаются: " + matchWorlds);
        System.out.println("____________________");

        //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий
        //и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
        // а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
        // может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        // Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через
        // консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(String.valueOf(123456789), "Иванов");
        phoneBook.add(String.valueOf(123456789), "Иванов");
        phoneBook.add(String.valueOf(123456789), "Иванов");
        phoneBook.add(String.valueOf(123456789), "Иванов");

        phoneBook.add(String.valueOf(987654321), "Петров");
        phoneBook.add(String.valueOf(876543219), "Синицына");
        phoneBook.add(String.valueOf(765432198), "Кукушкина");
        phoneBook.add(String.valueOf(654321987), "Иванов");
        phoneBook.add(String.valueOf(543219876), "Петров");
        phoneBook.add(String.valueOf(432198765), "Сидоров");

        System.out.println(phoneBook.toString());
        System.out.println(phoneBook.get("Иванов"));

        System.out.println("___________________________");

//      Без возможности добавлять одинаковые номера телефонов.

        PhoneBookSet phoneBookSet = new PhoneBookSet();
        phoneBookSet.add(String.valueOf(123456789), "Иванов");
        phoneBookSet.add(String.valueOf(123456789), "Иванов");
        phoneBookSet.add(String.valueOf(123456789), "Иванов");
        phoneBookSet.add(String.valueOf(123456789), "Иванов");

        phoneBookSet.add(String.valueOf(987654321), "Петров");
        phoneBookSet.add(String.valueOf(876543219), "Синицына");
        phoneBookSet.add(String.valueOf(765432198), "Кукушкина");
        phoneBookSet.add(String.valueOf(654321987), "Иванов");
        phoneBookSet.add(String.valueOf(543219876), "Петров");
        phoneBookSet.add(String.valueOf(432198765), "Сидоров");

        System.out.println(phoneBookSet.toString());
        System.out.println(phoneBookSet.get("Иванов"));
    }
}
