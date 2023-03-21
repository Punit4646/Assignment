import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        
        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Print the ArrayList before replacing the second element
        System.out.println("ArrayList before replacing the second element: " + colors);
        
        // Replace the second element of the ArrayList with the specified element
        colors.set(1, "Pink");
        
        // Print the ArrayList after replacing the second element
        System.out.println("ArrayList after replacing the second element: " + colors);
    }
}
