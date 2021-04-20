package JavaCore.Lesson8;


import JavaCore.Lesson8.Headline;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class JsonForecast {
    Headline HeadlineObject;
    ArrayList<DayForecast> DailyForecasts = new ArrayList();

    public JsonForecast() {
    }

    public JsonForecast(Headline headlineObject, ArrayList<DayForecast> dailyForecasts) {
        this.HeadlineObject = headlineObject;
        this.DailyForecasts = dailyForecasts;
    }

    @JsonProperty("DailyForecasts")
    public ArrayList<DayForecast> getDailyForecasts() {
        return this.DailyForecasts;
    }

    @JsonProperty("DailyForecasts")
    public void setDailyForecasts(ArrayList<DayForecast> dailyForecasts) {
        this.DailyForecasts = dailyForecasts;
    }

    @JsonProperty("Headline")
    public Headline getHeadline() {
        return this.HeadlineObject;
    }

    @JsonProperty("Headline")
    public void setHeadline(Headline HeadlineObject) {
        this.HeadlineObject = HeadlineObject;
    }
}

