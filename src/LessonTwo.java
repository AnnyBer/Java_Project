import java.util.Arrays;

public class LessonTwo {

    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
    }

//  1 Задать целочисленный массив, состоящий из элементов 0 и 1.
//  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий
//  в принятом массиве 0 на 1, 1 на 0;

    public static void task1() {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=(myArray[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(myArray));
    }

 //   2 Задать пустой целочисленный массив размером 8.
 //   Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

    public static void task2() {
        int[] theThird = new int[8];
        theThird[0] = 1;
        for (int i = 1; i < 8; i++) {
            theThird[i] = theThird[i - 1] + 3;
        }
        System.out.println(Arrays.toString(theThird));
    }

//   3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//   написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;

    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] res= multiplay(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] multiplay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
//   4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static void task4() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        int[] minMax = getMinMax(arr);
        System.out.println(Arrays.toString(minMax));
    }

    public static int[] getMinMax(int[] arr) {
        int[] res = new int[2];
        int max = 0;
        int min = arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
}

