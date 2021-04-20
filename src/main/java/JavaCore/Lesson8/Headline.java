package JavaCore.Lesson8;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headline {
    private String EffectiveDate;
    private float EffectiveEpochDate;
    private float Severity;
    private String Text;
    private String Category;
    private String EndDate;
    private float EndEpochDate;
    private String MobileLink;
    private String Link;

    public Headline(String effectiveDate, float effectiveEpochDate, float severity, String text, String category, String endDate, float endEpochDate, String mobileLink, String link) {
        this.EffectiveDate = effectiveDate;
        this.EffectiveEpochDate = effectiveEpochDate;
        this.Severity = severity;
        this.Text = text;
        this.Category = category;
        this.EndDate = endDate;
        this.EndEpochDate = endEpochDate;
        this.MobileLink = mobileLink;
        this.Link = link;
    }

    public Headline() {
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return this.EffectiveDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public float getEffectiveEpochDate() {
        return this.EffectiveEpochDate;
    }

    @JsonProperty("Severity")
    public float getSeverity() {
        return this.Severity;
    }

    @JsonProperty("Text")
    public String getText() {
        return this.Text;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return this.Category;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndEpochDate")
    public float getEndEpochDate() {
        return this.EndEpochDate;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return this.MobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return this.Link;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public void setEffectiveEpochDate(float EffectiveEpochDate) {
        this.EffectiveEpochDate = EffectiveEpochDate;
    }

    @JsonProperty("Severity")
    public void setSeverity(float Severity) {
        this.Severity = Severity;
    }

    @JsonProperty("Text")
    public void setText(String Text) {
        this.Text = Text;
    }

    @JsonProperty("Category")
    public void setCategory(String Category) {
        this.Category = Category;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    @JsonProperty("EndEpochDate")
    public void setEndEpochDate(float EndEpochDate) {
        this.EndEpochDate = EndEpochDate;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }

    @JsonProperty("Link")
    public void setLink(String Link) {
        this.Link = Link;
    }
}

