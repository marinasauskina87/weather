public class Main {
    public static void main(String[] args) {
        Weather newWeather = new Weather(20, "Sunny");
        System.out.println(newWeather.getTemperature() +" "+ newWeather.getDescription());
        newWeather.setTemperature(25);
        System.out.println(newWeather.getTemperature() +" "+ newWeather.getDescription());
        newWeather.setDescription("Cloudy");
        System.out.println(newWeather.getTemperature() +" "+ newWeather.getDescription());
    }
}