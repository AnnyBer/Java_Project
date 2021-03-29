package JavaCore.Lesson3;

import java.util.*;

public class Main {

    public void replaceElement(Object[] arr, int i, int j){
        Object element = arr [i];
        arr[i] = arr[j];
        arr[j] = element;
    }
    public static void main(String[] args) {

        Box<Apple> boxAppleList = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple())));
        Box<Orange> boxOrangeList = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange(), new Orange())));
        System.out.println(boxAppleList.getWeight());
        System.out.println(boxOrangeList.getWeight());

        System.out.println(boxAppleList.compare(boxOrangeList));

        Box<Apple> boxAppleListSale = new Box<>(new ArrayList<>());

        System.out.println("Было фруктов в коробке:" + boxAppleList.getWeight() + " кг.");
        System.out.println("Было фруктов в новой коробке:" + boxAppleListSale.getWeight() + " кг.");
        boxAppleList.moveTo(boxAppleListSale, Apple.class.getName());
        System.out.println("Осталось фруктов в коробке:" + boxAppleList.getWeight() + " кг.");
        System.out.println("Стало фруктов в новой коробке:" + boxAppleListSale.getWeight() + " кг.");



    }
}
