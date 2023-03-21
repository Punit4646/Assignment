import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        System.out.println("Original list: " + list);
        
        // swap elements at index 1 and 3
        Collections.swap(list, 1, 3);
        System.out.println("List after swapping elements: " + list);
    }
}
