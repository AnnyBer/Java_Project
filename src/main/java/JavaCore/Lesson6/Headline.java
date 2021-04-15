package JavaCore.Lesson6;

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

    public Headline(String effectiveDate, float effectiveEpochDate,
                    float severity, String text, String category, String endDate,
                    float endEpochDate, String mobileLink, String link) {
        EffectiveDate = effectiveDate;
        EffectiveEpochDate = effectiveEpochDate;
        Severity = severity;
        Text = text;
        Category = category;
        EndDate = endDate;
        EndEpochDate = endEpochDate;
        MobileLink = mobileLink;
        Link = link;
    }

    public Headline() {}

    // Getter Methods
    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return EffectiveDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public float getEffectiveEpochDate() {
        return EffectiveEpochDate;
    }

    @JsonProperty("Severity")
    public float getSeverity() {
        return Severity;
    }

    @JsonProperty("Text")
    public String getText() {
        return Text;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return Category;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return EndDate;
    }

    @JsonProperty("EndEpochDate")
    public float getEndEpochDate() {
        return EndEpochDate;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return MobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return Link;
    }

    // Setter Methods
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
