import java.util.HashMap;
import java.util.Map;

public class MapEmptyCheck {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        // Adding key-value mappings to the map
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);
        
        // Checking if the map is empty
        if (map.isEmpty()) {
            System.out.println("Map is empty!");
        } else {
            System.out.println("Map is not empty!");
        }
        
        // Removing all key-value mappings from the map
        map.clear();
        
        // Checking if the map is empty again
        if (map.isEmpty()) {
            System.out.println("Map is empty!");
        } else {
            System.out.println("Map is not empty!");
        }
    }
}
