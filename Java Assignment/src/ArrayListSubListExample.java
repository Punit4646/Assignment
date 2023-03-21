import java.util.ArrayList;

public class ArrayListSubListExample {
    public static void main(String[] args) {
        // create a new ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // print out the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // extract a portion of the ArrayList
        ArrayList<Integer> subList = new ArrayList<>(numbers.subList(2, 5));

        // print out the extracted sub-list
        System.out.println("Extracted Sub-List: " + subList);
    }
}
