package JavaCore.Lesson2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j) {
        super ("Неверные данные в ячейке (" + i + "), (" + j + ")");
    }
}
