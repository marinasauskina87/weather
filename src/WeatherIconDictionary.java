import java.util.HashMap;
import java.util.Map;

public class WeatherIconDictionary {

    private static final Map<String, String> icons = new HashMap<>();

    static {
        icons.put("sonnig", "☀️");
        icons.put("regnerisch", "🌧️");
        icons.put("bewölkt", "☁️");
        icons.put("schnee", "❄️");
        icons.put("stürmisch", "🌪️");
        icons.put("neblig", "🌫️");
        icons.put("windig", "💨");
        icons.put("heiß", "🔥");
        icons.put("kalt", "🥶");
        icons.put("gewitter", "⛈️");
    }

    public static String getIcon(String description) {
        return icons.get(description.toLowerCase());
    }
}