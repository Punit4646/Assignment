import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> names = new ArrayList<String>();

        // add some names to the ArrayList
        names.add("dj");
        names.add("Punit");
        names.add("Charlie");
        names.add("Ram");

        // print out the original ArrayList
        System.out.println("Original list of names: " + names);

        // remove the third element from the ArrayList
        names.remove(2);

        // print out the updated ArrayList
        System.out.println("Updated list of names: " + names);
    }
}
