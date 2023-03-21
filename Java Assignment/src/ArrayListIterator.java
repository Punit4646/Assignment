import java.util.ArrayList;

public class ArrayListIterator {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add some numbers to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // iterate through the ArrayList and print out each element
        System.out.println("Elements in the list are: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
