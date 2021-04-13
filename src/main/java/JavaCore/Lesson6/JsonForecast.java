package JavaCore.Lesson6;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class JsonForecast {

    Headline HeadlineObject;
    ArrayList <DayForecast> DailyForecasts = new ArrayList <DayForecast> ();

    public JsonForecast() {}

    public JsonForecast(Headline headlineObject, ArrayList<DayForecast> dailyForecasts) {
        HeadlineObject = headlineObject;
        DailyForecasts = dailyForecasts;
    }

    @JsonProperty("DailyForecasts")
    public ArrayList<DayForecast> getDailyForecasts() {
        return DailyForecasts;
    }
    @JsonProperty("DailyForecasts")
    public void setDailyForecasts(ArrayList<DayForecast> dailyForecasts) {
        DailyForecasts = dailyForecasts;
    }

    // Getter Methods
    @JsonProperty("Headline")
    public Headline getHeadline() {
        return HeadlineObject;
    }

    // Setter Methods
    @JsonProperty("Headline")
    public void setHeadline(Headline HeadlineObject) {
        this.HeadlineObject = HeadlineObject;
    }
}
