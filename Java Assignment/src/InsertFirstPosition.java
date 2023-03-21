import java.util.ArrayList;

public class InsertFirstPosition {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> names = new ArrayList<String>();

        // add some names to the ArrayList
        names.add("Gaurang Bhai");
        names.add("Sherwin");
        names.add("Druv");

        // insert a new name at the first position of the ArrayList
        names.add(0, "Punit");

        // print out the contents of the ArrayList
        System.out.println("Names in the list are: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
