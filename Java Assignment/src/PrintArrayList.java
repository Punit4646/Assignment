import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dates");
        
        // Printing all the elements using the position of the elements
        for(int i=0; i<list.size(); i++) {
            System.out.println("Element at index " + i + " is: " + list.get(i));
        }
    }
}
