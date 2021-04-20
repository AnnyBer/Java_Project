package JavaCore.Lesson8;


import com.fasterxml.jackson.annotation.JsonProperty;

class Weather {
    private float Icon;
    private String IconPhrase;
    private boolean HasPrecipitation;
    private String PrecipitationType;
    private String PrecipitationIntensity;

    Weather() {
    }

    @JsonProperty("Icon")
    public float getIcon() {
        return this.Icon;
    }

    @JsonProperty("IconPhrase")
    public String getIconPhrase() {
        return this.IconPhrase;
    }

    @JsonProperty("HasPrecipitation")
    public boolean getHasPrecipitation() {
        return this.HasPrecipitation;
    }

    @JsonProperty("PrecipitationType")
    public String getPrecipitationType() {
        return this.PrecipitationType;
    }

    @JsonProperty("PrecipitationIntensity")
    public String getPrecipitationIntensity() {
        return this.PrecipitationIntensity;
    }

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
