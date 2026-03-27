public class Weather {
    double temperature;
    String description;

    Weather(double temperature, String description) {
        this.temperature = temperature;
        this.description = description;
    }
    public double getTemperature() {
        return temperature;
    }
    public String getDescription() {
        return description;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
