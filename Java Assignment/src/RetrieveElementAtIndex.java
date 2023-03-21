import java.util.ArrayList;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> names = new ArrayList<String>();

        // add some names to the ArrayList
        names.add("Punit");
        names.add("Bob");
        names.add("Charlie");

        // retrieve the element at index 1 (the second element)
        String name = names.get(1);

        // print out the retrieved element
        System.out.println("Element at index 1 is: " + name);
    }
}
