import java.util.Arrays;

public class LessonTwo {

    public static void main(String[] args){
        task1();
        task2();
    }

    public static void task1() {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]=(myArray[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void task2() {
        int[] theThird = new int[8];
        theThird[0] = 1;
        for (int i = 1; i < 8; i++) {
            theThird[i] = theThird[i-1]+3;
        }
        System.out.println(Arrays.toString(theThird));
    }

    public static void task3() {

    }
}
