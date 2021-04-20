package JavaCore.Lesson8;


import JavaCore.Lesson8.Temperature;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class DayForecast {
    private String Date;
    private float EpochDate;
    private Temperature TemperatureObject;
    private Weather DayObject;
    private Weather NightObject;
    private ArrayList<String> Sources = new ArrayList();
    private String MobileLink;
    private String Link;

    public DayForecast () {}

    public DayForecast(String date, float epochDate, Temperature temperatureObject,
                       Weather dayObject, Weather nightObject, ArrayList<String> sources,
                       String mobileLink, String link) {
        Date = date;
        EpochDate = epochDate;
        TemperatureObject = temperatureObject;
        DayObject = dayObject;
        NightObject = nightObject;
        Sources = sources;
        MobileLink = mobileLink;
        Link = link;
    }

    public DayForecast(String date,
                       String dayIconPhrase,
                       String nightIconPhrase,
                       float tempMaxValue,
                       String tempMaxUnit,
                       float tempMinValue,
                       String tempMinUnit) {
        this.Date = date;
        this.DayObject = new Weather();
        this.DayObject.setIconPhrase(dayIconPhrase);

        this.NightObject = new Weather();
        this.NightObject.setIconPhrase(nightIconPhrase);

        this.TemperatureObject = new Temperature();

        this.TemperatureObject.setMaximum(new Temp(tempMaxValue, tempMaxUnit));
        this.TemperatureObject.setMinimum(new Temp(tempMinValue, tempMinUnit));
    }

    public String getDayIconPhrase() {
        return this.getDay().getIconPhrase();
    }

    public String getNightIconPhrase() {
        return this.getNight().getIconPhrase();
    }

    public Temp getTempMax() {
        return this.getTemperature().getMaximum();
    }

    public Temp getTempMin() {
        return this.getTemperature().getMinimum();
    }

    @JsonProperty("Date")
    public String getDate() {
        return this.Date;
    }

    @JsonProperty("EpochDate")
    public float getEpochDate() {
        return this.EpochDate;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return this.TemperatureObject;
    }

    @JsonProperty("Day")
    public Weather getDay() {
        return this.DayObject;
    }

    @JsonProperty("Night")
    public Weather getNight() {
        return this.NightObject;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return this.MobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return this.Link;
    }

    public ArrayList<String> getSources() {
        return this.Sources;
    }

    @JsonProperty("Date")
    public void setDate(String Date) {
        this.Date = Date;
    }

    @JsonProperty("EpochDate")
    public void setEpochDate(float EpochDate) {
        this.EpochDate = EpochDate;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature TemperatureObject) {
        this.TemperatureObject = TemperatureObject;
    }

    @JsonProperty("Day")
    public void setDay(Weather DayObject) {
        this.DayObject = DayObject;
    }

    @JsonProperty("Night")
    public void setNight(Weather NightObject) {
        this.NightObject = NightObject;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }

    @JsonProperty("Link")
    public void setLink(String Link) {
        this.Link = Link;
    }

    @JsonProperty("Sources")
    public void setSources(ArrayList<String> value) {
        this.Sources = value;
    }


}
