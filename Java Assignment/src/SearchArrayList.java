import java.util.ArrayList;

public class SearchArrayList {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> names = new ArrayList<String>();

        // add some names to the ArrayList
        names.add("Dj");
        names.add("Punit");
        names.add("Ram");

        // search for the element "Bob"
        if (names.contains("Punit")) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found.");
        }
    }
}
