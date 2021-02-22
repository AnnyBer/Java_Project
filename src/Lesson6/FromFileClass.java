package Lesson6;

import java.io.*;

public class FromFileClass {

    private static final int Amount = 2;

    private static final String Search = "Hello";
    private static FileInputStream fis;
    private static FileOutputStream fos;


    private static void mergeFiles(String inFile1, String inFile2){
        try {
            fos = new FileOutputStream("File_3.txt");
            int ch;
            fis = new FileInputStream(inFile1);
            while ((ch = fis.read()) != -1)
                fos.write(ch);
            fis.close();

            fis = new FileInputStream(inFile2);
            while ((ch = fis.read()) != -1)
                fos.write(ch);
            fis.close();

            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static boolean searchWord(String search, String nameFile) {
        boolean res = false;
        try {
            fis = new FileInputStream(nameFile);
            int ch;
            int i = 0;
            byte[] bWord = search.getBytes();
            while ((ch = fis.read()) != -1) {
                if (i == bWord.length -1) {
                    res = true;
                    break;
                }

                if (ch == bWord[i]) {
                    i++;
                } else {
                    i = 0;
                    if (ch == bWord[i]){
                        i++;
                    }
                }
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        String[] files = new String[Amount];
            files[0] = "File_1.txt";
            files[1] = "File_2.txt";

        try {
            fos = new FileOutputStream("File_1.txt");
            PrintStream printstream = new PrintStream(fos);
            printstream.println("Класс OutputStream - это абстрактный класс, определяющий байтовый поток вывода." +
                    " Наследники данного класса определяют куда направлять данные: в массив байтов, в файл или канал." +
                    " Из массива байт можно создать текстовую строку String. Hello");

            } catch (FileNotFoundException e) {
            System.out.println("Не сoздан File_1");
            }
            fos.close();

        try {
            fos = new FileOutputStream("File_2.txt");
            PrintStream printstream = new PrintStream(fos);
            printstream.println("Класс FileOutputStream создаёт объект класса OutputStream, который можно использовать для записи " +
                    "байтов в файл. Это основной класс для работы с файлами. Создание нового объекта не зависит от того, существует ли " +
                    "заданный файл или нет. Если файл отсутствует, то будет создан новый файл. В случае попытки открытия файла, доступного " +
                    "только для чтения, будет вызвано исключение.");

        } catch (FileNotFoundException e) {
            System.out.println("Не создан File_2");
            fos.close();
        }
        mergeFiles(files[0], files[1]);

        if (searchWord(Search, "File_1.txt")) {
            System.out.println("Слово найдено в файле File_1.txt");
        }

        if (!searchWord(Search, "File_2.txt")) {
            System.out.println("Слово не найдено в файле File_2.txt");
        }
    }


}
