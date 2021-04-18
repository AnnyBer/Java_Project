package JavaCore.Lesson8;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseRepository {
    private static final String URL = "jdbc:sqlite:geekbrains.db";
    private static final String sqlCreateTable = "CREATE TABLE IF NOT EXISTS weather (\n" +
            "    Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,\n" +
            "    City TEXT NOT NULL,\n" +
            "    DayDate DATETIME NOT NULL,\n" +
            "    dayIconPhrase TEXT,\n" +
            "    nightIconPhrase TEXT,\n" +
            "    tempMaxValue REAL,\n" +
            "    tempMaxUnit TEXT,\n" +
            "    tempMinValue REAL,\n" +
            "    tempMinUnit TEXT,\n" +
            "\n" +
            "    PRIMARY KEY(Timestamp, City, DayDate)\n" +
            ");";
    private static final String insertSql = "INSERT INTO weather" +
            "(City, DayDate, dayIconPhrase, nightIconPhrase, tempMaxValue," +
            "tempMaxUnit, tempMinValue, tempMinUnit)\n" +
            "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String selectSql = "select * from weather" +
            " where Timestamp > DATETIME('now', '-5 Minute')" +
            " AND City=?" +
            " AND DayDate > DATETIME('now')" +
            " AND DayDate < DATETIME('now', ?);";

    static {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection connect() {
        // SQLite connection string
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static String getAmountDays(Period period) {
        if (period == Period.FIVE_DAYS) {
            return "+5 Day";
        }

        return "+0 Day";
    }

    public static ArrayList<DayForecast> getDayForecasts(Period period, String city) {
        ArrayList<DayForecast> result = new ArrayList<>();

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(selectSql)) {

            stmt.setString(1, city);
            stmt.setString(2, getAmountDays(period));
            ResultSet rs = stmt.executeQuery();

            // loop through the result set
            while (rs.next()) {
                String date = rs.getString("DayDate");
                String dayIconPhrase = rs.getString("dayIconPhrase");
                String nightIconPhrase = rs.getString("nightIconPhrase");
                float tempMaxValue = rs.getFloat("tempMaxValue");
                String tempMaxUnit = rs.getString("tempMaxUnit");
                float tempMinValue = rs.getFloat("tempMinValue");
                String tempMinUnit = rs.getString("tempMinUnit");

                DayForecast df = new DayForecast(
                        date,
                        dayIconPhrase,
                        nightIconPhrase,
                        tempMaxValue,
                        tempMaxUnit,
                        tempMinValue,
                        tempMinUnit);
                result.add(df);
            }
        } catch (SQLException e) {
            if (e.getErrorCode() != 1) {
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());
            }
        }

        return result;
    }

    public static void setDayForecasts(ArrayList<DayForecast> dayForecasts, String city) {
        if (dayForecasts.size() == 0) {
            return;
        }

        try (Connection conn = connect()) {
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.execute(sqlCreateTable);
            conn.commit();

            PreparedStatement saveWeather = conn.prepareStatement(insertSql);

            for (DayForecast dayF : dayForecasts) {
                saveWeather.setString(1, city);
                saveWeather.setString(2, dayF.getDate());
                saveWeather.setString(3, dayF.getDayIconPhrase());
                saveWeather.setString(4, dayF.getNightIconPhrase());
                saveWeather.setFloat(5, dayF.getTempMax().Value);
                saveWeather.setString(6, dayF.getTempMax().Unit);
                saveWeather.setFloat(7, dayF.getTempMin().Value);
                saveWeather.setString(8, dayF.getTempMin().Unit);
                saveWeather.addBatch();
            }
            saveWeather.executeBatch();

            conn.commit();

            stmt.close();
            saveWeather.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
