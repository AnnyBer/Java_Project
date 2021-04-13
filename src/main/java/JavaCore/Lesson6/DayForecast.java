package JavaCore.Lesson6;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DayForecast {

        private String Date;
        private float EpochDate;
        private Temperature TemperatureObject;
        private Weather DayObject;
        private Weather NightObject;
        private ArrayList<String> Sources = new ArrayList<String>();
        private String MobileLink;
        private String Link;

    public DayForecast() {}

    // Getter Methods
        @JsonProperty("Date")
        public String getDate() {
            return Date;
        }

        @JsonProperty("EpochDate")
        public float getEpochDate() {
            return EpochDate;
        }

        @JsonProperty("Temperature")
        public Temperature getTemperature() {
            return TemperatureObject;
        }

         @JsonProperty("Day")
        public Weather getDay() {
            return DayObject;
        }

        @JsonProperty("Night")
        public Weather getNight() {
            return NightObject;
        }

         @JsonProperty("MobileLink")
        public String getMobileLink() {
            return MobileLink;
        }

         @JsonProperty("Link")
        public String getLink() {
            return Link;
        }

        public ArrayList<String> getSources() {
            return Sources;
        }

        // Setter Methods
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

    class Weather {
        private float Icon;
        private String IconPhrase;
        private boolean HasPrecipitation;
        private String PrecipitationType;
        private String PrecipitationIntensity;

        // Getter Methods
        @JsonProperty("Icon")
        public float getIcon() {
            return Icon;
        }

        @JsonProperty("IconPhrase")
        public String getIconPhrase() {
            return IconPhrase;
        }

        @JsonProperty("HasPrecipitation")
        public boolean getHasPrecipitation() {
            return HasPrecipitation;
        }

        @JsonProperty("PrecipitationType")
        public String getPrecipitationType() {
            return PrecipitationType;
        }

        @JsonProperty("PrecipitationIntensity")
        public String getPrecipitationIntensity() {
            return PrecipitationIntensity;
        }

        // Setter Methods

        @JsonProperty("Icon")
        public void setIcon(float Icon) {
            this.Icon = Icon;
        }

        @JsonProperty("IconPhrase")
        public void setIconPhrase(String IconPhrase) {
            this.IconPhrase = IconPhrase;
        }
        @JsonProperty("HasPrecipitation")
        public void setHasPrecipitation(boolean HasPrecipitation) {
            this.HasPrecipitation = HasPrecipitation;
        }

        @JsonProperty("PrecipitationType")
        public void setPrecipitationType(String value) {
            this.PrecipitationType = value;
        }

        @JsonProperty("PrecipitationIntensity")
        public void getPrecipitationIntensity(String value) {
            this.PrecipitationIntensity = value;
        }
    }

     class Temperature {
        Temp MinimumObject;
        Temp MaximumObject;


        // Getter Methods
        @JsonProperty("Temperature.Minimum")
        public Temp getMinimum() {
            return MinimumObject;
        }
         @JsonProperty("Maximum")
        public Temp getMaximum() {
            return MaximumObject;
        }

        // Setter Methods
        @JsonProperty("Minimum")
        public void setMinimum(Temp MinimumObject) {
            this.MinimumObject = MinimumObject;
        }
         @JsonProperty("Maximum")
        public void setMaximum(Temp MaximumObject) {
            this.MaximumObject = MaximumObject;
        }
    }
        class Temp {
        private float Value;
        private String Unit;
        private float UnitType;


        // Getter Methods
        @JsonProperty("Value")
        public float getValue() {
            return Value;
        }
        @JsonProperty("Unit")
        public String getUnit() {
            return Unit;
        }
            @JsonProperty("UnitType")
        public float getUnitType() {
            return UnitType;
        }

        // Setter Methods
        @JsonProperty("Value")
        public void setValue(float Value) {
            this.Value = Value;
        }
            @JsonProperty("Unit")
        public void setUnit(String Unit) {
            this.Unit = Unit;
        }
            @JsonProperty("UnitType")
        public void setUnitType(float UnitType) {
            this.UnitType = UnitType;
        }

            @Override
            public String toString() {
                return Value + "°" + Unit;
            }
        }
