package JavaCore.Lesson8;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    private static final String KEY = "CGJzusnlRQDntWXv4eJcnZ772u3NXdbl";
    private static final String PROTOCOL = "http";
    private static final String HOST = "dataservice.accuweather.com";
    private static final String FORECASTS_ENDPOINT = "forecasts";
    private static final String API_VERSION_1 = "v1";
    private static final String DAILY = "daily";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();


    public static void getWeather(Period period, String city) throws IOException {
        ArrayList<DayForecast> result = DataBaseRepository.getDayForecasts(period, city);

        if (result.size() == 0) {
            result = requestWeather(period, city);
            DataBaseRepository.setDayForecasts(result, city);
        }

        printWeather(result);
    }

    private static String getAmountDays(Period period) {
        if (period == Period.FIVE_DAYS) {
            return "5day";
        }
        return "1day";
    }

    private static ArrayList<DayForecast> requestWeather(Period period, String selectedCity) throws IOException {
        String cityKey = findCity(selectedCity);
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(HOST)
                .addPathSegment(FORECASTS_ENDPOINT)
                .addPathSegment(API_VERSION_1)
                .addPathSegment(DAILY)
                .addPathSegment(getAmountDays(period))
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", KEY)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String json = response.body().string();

        ObjectMapper objectMapper = new ObjectMapper();

        JsonForecast jsonForecast = objectMapper
                .readerFor(JsonForecast.class)
                .readValue(json);

        return jsonForecast.getDailyForecasts();
    }

    private static void printWeather(ArrayList<DayForecast> dayForecasts) {
        for (DayForecast dayF : dayForecasts) {
            System.out.println("---------------------------------");
            System.out.println("На дату: " + dayF.getDate());
            System.out.println("Ожидается днем: " + dayF.getDayIconPhrase());
            System.out.println("Ожидается ночью: " + dayF.getNightIconPhrase());
            System.out.println("Максимальная температура: " + dayF.getTempMax());
            System.out.println("Минимальная температура: " + dayF.getTempMin());
            System.out.println("---------------------------------");
            System.out.println();
        }
    }

    public static String findCity(String selectedCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(API_VERSION_1)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter("apikey", KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        ObjectMapper objectMapper = new ObjectMapper();
        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();

        return cityKey;
    }

    public static void main(String[] args) throws IOException {
        getWeather(Period.FIVE_DAYS, "Saint Petersburg");
    }
}