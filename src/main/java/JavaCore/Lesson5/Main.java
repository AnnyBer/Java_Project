package JavaCore.Lesson5;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {


    public static void main(String[] args) throws IOException {

        //1. Открыть текстовый файл для чтения и перезаписать его в другой файл.
        // Каждый байт исходного файла перед записью увеличить на 5 (что-то вроде простого шифрования).

        createTxtFile("1.txt", "Hello!");

        FileInputStream dataFile = null;
        try {
            dataFile = new FileInputStream("1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OutputStream outFile2 = null;
        try {
            outFile2 = new FileOutputStream("2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert dataFile != null;
            assert outFile2 != null;
            try (InputStreamReader stream = new InputStreamReader(dataFile, UTF_8)) {
                int x;
                while ((x = stream.read()) != -1) {
                    System.out.print((char) (x + 5));
                    outFile2.write(x + 5);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------");

        try (InputStreamReader stream2 = new InputStreamReader(new FileInputStream("2.txt"), UTF_8)) {
            int x;
            while ((x = stream2.read()) != -1) {
                System.out.print((char) (x - 5));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void createTxtFile(String name, String txt) {
        try (OutputStream outputStream = new FileOutputStream(name)) {
            outputStream.write(txt.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
