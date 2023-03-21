import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        // shuffle the ArrayList
        Collections.shuffle(numbers);

        // print out the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + numbers);
    }
}
