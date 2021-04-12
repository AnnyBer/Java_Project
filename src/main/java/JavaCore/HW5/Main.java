package JavaCore.HW5;

import JavaCore.HW5.AppData;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {


    // Реализовать сохранение данных в csv файл;
    //Реализовать загрузку данных из csv файла. Файл читается целиком.


    public static void main(String[] args) throws IOException, CsvException {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{1, 2, 3}, {4, 5, 6}};

        AppData appData = new AppData(header, data);
        appData.writeToCsv("data.csv");


        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        List<String[]> allCsv = reader.readAll();
        for (String[] row : allCsv) {
            System.out.println(Arrays.toString(row));
        }
    }
}
