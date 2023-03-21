import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseExample {
    public static void main(String[] args) {
        // create a new ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();

        // add some colors to the ArrayList
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        // print out the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // reverse the ArrayList
        Collections.reverse(colors);

        // print out the reversed ArrayList
        System.out.println("Reversed ArrayList: " + colors);
    }
}
