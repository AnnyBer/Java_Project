package JavaCore.Lesson8;


import com.fasterxml.jackson.annotation.JsonProperty;

class Temperature {
    Temp MinimumObject;
    Temp MaximumObject;

    Temperature() {
    }

    @JsonProperty("Temperature.Minimum")
    public Temp getMinimum() {
        return this.MinimumObject;
    }

    @JsonProperty("Maximum")
    public Temp getMaximum() {
        return this.MaximumObject;
    }

    @JsonProperty("Minimum")
    public void setMinimum(Temp MinimumObject) {
        this.MinimumObject = MinimumObject;
    }

    @JsonProperty("Maximum")
    public void setMaximum(Temp MaximumObject) {
        this.MaximumObject = MaximumObject;
    }
}

