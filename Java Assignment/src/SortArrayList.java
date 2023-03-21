import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add some numbers to the ArrayList
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);

        // sort the ArrayList
        Collections.sort(numbers);

        // print out the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }
}
