package JavaCore.Lesson8;


import com.fasterxml.jackson.annotation.JsonProperty;

class Temp {

    @JsonProperty("Value")
    public float Value;

    @JsonProperty("Unit")
    public String Unit;

    @JsonProperty("UnitType")
    public float UnitType;

    Temp() {}

    Temp(float value,  String unit) {
        this.Unit = unit;
        this.Value = value;
    }

    public String toString() {
        return this.Value + "°" + this.Unit;
    }
}
