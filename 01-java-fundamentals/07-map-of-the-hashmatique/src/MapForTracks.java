import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapForTracks {
    public static void main(String[] args) {
        Map<String, String> trackList = new HashMap<>();
        trackList.put("Joy", "I am the best");
        trackList.put("Hii", "Hello there");
        trackList.put("Glory", "I will shine");
        trackList.put("Blessing", "I am blessed");

        String joy = trackList.get("Joy");
        System.out.println(joy);
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }

        Iterator<String> iterator = trackList.values().iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }



    }

}
