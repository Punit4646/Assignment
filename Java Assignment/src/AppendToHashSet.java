import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // create a new HashSet
        HashSet<String> colors = new HashSet<String>();

        // add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // append an element to the end of the HashSet
        colors.add("Yellow");

        // print out the updated HashSet
        System.out.println("Updated HashSet: " + colors);
    }
}
