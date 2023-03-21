import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        // add some numbers to the ArrayList
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);

        // create a new ArrayList and copy the contents of the first ArrayList into it
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(numbers1);

        // print out the contents of the second ArrayList
        System.out.println("Contents of second ArrayList: " + numbers2);
    }
}
