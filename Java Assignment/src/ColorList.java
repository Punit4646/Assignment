import java.util.ArrayList;

public class ColorList {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> colors = new ArrayList<String>();

        // add some colors to the ArrayList
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        // print out the contents of the ArrayList
        System.out.println("Colors in the list are: ");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
