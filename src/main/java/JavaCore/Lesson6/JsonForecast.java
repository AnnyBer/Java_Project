package JavaCore.Lesson6;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class JsonForecast {

    Headline Headline;
    ArrayList< Forecast > DailyForecasts = new ArrayList < Forecast > ();


    // Getter Methods

    public Headline getHeadline() { return Headline; }

    // Setter Methods

    public void setHeadline(Headline Headline) {
        this.Headline = Headline;
    }
}
    class Headline {
    private String EffectiveDate;
    private float EffectiveEpochDate;
    private float Severity;
    private String Text;
    private String Category;
    private String EndDate;
    private float EndEpochDate;
    private String MobileLink;
    private String Link;


    // Getter Methods

    public String getEffectiveDate() {
        return EffectiveDate;
    }

    public float getEffectiveEpochDate() {
        return EffectiveEpochDate;
    }

    public float getSeverity() {
        return Severity;
    }

    public String getText() {
        return Text;
    }

    public String getCategory() {
        return Category;
    }

    public String getEndDate() {
        return EndDate;
    }

    public float getEndEpochDate() {
        return EndEpochDate;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public String getLink() {
        return Link;
    }

    // Setter Methods

    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }

    public void setEffectiveEpochDate(float EffectiveEpochDate) {
        this.EffectiveEpochDate = EffectiveEpochDate;
    }

    public void setSeverity(float Severity) {
        this.Severity = Severity;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public void setEndEpochDate(float EndEpochDate) {
        this.EndEpochDate = EndEpochDate;
    }

    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }
}

    class Codebeautify {
    private String Date;
    private float EpochDate;
    Temperature TemperatureObject;
    Day DayObject;
    Night NightObject;
    ArrayList < Object > Sources = new ArrayList < Object > ();
    private String MobileLink;
    private String Link;


    // Getter Methods

    public String getDate() {
        return Date;
    }

    public float getEpochDate() {
        return EpochDate;
    }

    public Temperature getTemperature() {
        return TemperatureObject;
    }

    public Day getDay() {
        return DayObject;
    }

    public Night getNight() {
        return NightObject;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public String getLink() {
        return Link;
    }

    // Setter Methods

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setEpochDate(float EpochDate) {
        this.EpochDate = EpochDate;
    }

    public void setTemperature(Temperature TemperatureObject) {
        this.TemperatureObject = TemperatureObject;
    }

    public void setDay(Day DayObject) {
        this.DayObject = DayObject;
    }

    public void setNight(Night NightObject) {
        this.NightObject = NightObject;
    }

    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }
}
    class Night {
    private float Icon;
    private String IconPhrase;
    private boolean HasPrecipitation;


    // Getter Methods

    public float getIcon() {
        return Icon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public boolean getHasPrecipitation() {
        return HasPrecipitation;
    }

    // Setter Methods

    public void setIcon(float Icon) {
        this.Icon = Icon;
    }

    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
    }

    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }
}
    class Day {
    private float Icon;
    private String IconPhrase;
    private boolean HasPrecipitation;


    // Getter Methods

    public float getIcon() {
        return Icon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public boolean getHasPrecipitation() {
        return HasPrecipitation;
    }

    // Setter Methods

    public void setIcon(float Icon) {
        this.Icon = Icon;
    }

    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
    }

    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }
}
    class Temperature {
    TempValue MinimumObject;
    TempValue MaximumObject;


    // Getter Methods

    public TempValue getMinimum() {
        return MinimumObject;
    }

    public TempValue getMaximum() {
        return MaximumObject;
    }

    // Setter Methods

    public void setMinimum(TempValue MinimumObject) {
        this.MinimumObject = MinimumObject;
    }

    public void setMaximum(TempValue MaximumObject) {
        this.MaximumObject = MaximumObject;
    }
}
    class TempValue {
    private float Value;
    private String Unit;
    private float UnitType;


    // Getter Methods

    public float getValue() {
        return Value;
    }

    public String getUnit() {
        return Unit;
    }

    public float getUnitType() {
        return UnitType;
    }

    // Setter Methods

    public void setValue(float Value) {
        this.Value = Value;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public void setUnitType(float UnitType) {
        this.UnitType = UnitType;
    }
}
    class Forecast {
    private float Value;
    private String Unit;
    private float UnitType;


    // Getter Methods

    public float getValue() {
        return Value;
    }

    public String getUnit() {
        return Unit;
    }

    public float getUnitType() {
        return UnitType;
    }

    // Setter Methods

    public void setValue(float Value) {
        this.Value = Value;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public void setUnitType(float UnitType) {
        this.UnitType = UnitType;
    }
}
