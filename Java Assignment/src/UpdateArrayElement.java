import java.util.ArrayList;

public class UpdateArrayElement {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> names = new ArrayList<String>();

        // add some names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // print out the original ArrayList
        System.out.println("Original list of names: " + names);

        // update the element at index 1 (the second element)
        names.set(1, "Punit");

        // print out the updated ArrayList
        System.out.println("Updated list of names: " + names);
    }
}
