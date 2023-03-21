import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        // create a new HashSet
        HashSet<String> colors = new HashSet<String>();

        // add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // create an iterator for the HashSet
        Iterator<String> iterator = colors.iterator();

        // iterate through the HashSet and print out each element
        System.out.println("HashSet elements:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
