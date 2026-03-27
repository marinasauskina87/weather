public class Main {
    public static void main(String[] args) {

        Weather weather = new Weather(-22.5, "schnee");


        System.out.println("Temperatur: " + weather.getTemperature());
        System.out.println("Beschreibung: " + weather.getDescription());

        String icon = WeatherIconDictionary.getIcon(weather.getDescription());

        if (icon != null) {
            System.out.println("Icon gefunden: " + icon);
        } else {
            System.out.println("Kein Icon verfügbar");
        }
    }
}