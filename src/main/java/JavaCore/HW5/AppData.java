package JavaCore.HW5;

import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }


    public void writeToCsv(String name) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(name),
                ';',
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        writer.writeNext(header);

        for (int[] row: data) {
            String[] strRow = new String[row.length];
            int i = 0;
            for (int item: row) {
                strRow[i] = item + "";
                i++;
            }
            writer.writeNext(strRow);
        }
        writer.close();
    }

    public void readToCsv(String name) {
        FileInputStream dataFile = null;
        try {
            dataFile = new FileInputStream(name);
            byte[] buffer = new byte[dataFile.available()];
            dataFile.read(buffer, 0, buffer.length);
            String csv = buffer.toString();

            String[] rows = csv.split("\n");
            String[][] strData = {{""}};
            int i = 0;
            for (String row : rows) {
                strData[i] = row.split(";");
                i++;
            }

            header = strData[0];

            i = 0;
            int j = 0;
            data = new int[i][j];
            for (String[] row : strData) {
                for (String word : row) {
                    data[i][j] = Integer.getInteger(word);
                    j++;
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
