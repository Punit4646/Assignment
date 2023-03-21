import java.util.HashSet;

public class HashSetSize {
    public static void main(String[] args) {
        // create a new HashSet
        HashSet<String> colors = new HashSet<String>();

        // add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // get the number of elements in the HashSet
        int size = colors.size();

        // print out the number of elements in the HashSet
        System.out.println("The number of elements in the HashSet is: " + size);
    }
}
