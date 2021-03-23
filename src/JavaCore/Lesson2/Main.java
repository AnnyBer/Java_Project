package JavaCore.Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"2","3","6","7"},
                {"1","7","4","9"},
                {"5","3","2","A"},
                {"7","2","3","1"}
        };
        String[][] arr2 = {
                {"2","3","6","7","6","7"},
                {"1","7","4","9","6","7"},
                {"5","3","2","5","6","7"},
                {"7","2","3","1","6","7"},
                {"5","3","2","5","6","7"},
                {"7","2","3","1","6","7"}
        };

        try {
            System.out.println(Arrays.deepToString(arrayToInt(arr)));

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println(Arrays.deepToString(arrayToInt(arr2)));

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    private static int[][] arrayToInt(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int[][] res = new int[4][4];
        if (arr.length != 4) throw new MyArraySizeException("Размер массива больше чем 4*4");
        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Размер массива больше чем 4*4");
            for (int j = 0; j < 4; j++) {
                try {
                    res[i][j] = Integer.parseInt(arr[i][j]);

                } catch(Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return res;
    }
}
