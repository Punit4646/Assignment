import java.util.HashMap;
import java.util.Collection;

public class MapValuesExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<String, String>();

        // Add key-value pairs to the HashMap
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        // Get a collection view of the values in the HashMap
        Collection<String> values = map.values();

        // Print the collection of values
        System.out.println("Values in the HashMap: " + values);
    }
}
