import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cheery");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("orange");

        // Compare list1 and list2
        boolean isEqual = list1.equals(list2);

        if (isEqual) {
            System.out.println("Both array lists are equal");
        } else {
            System.out.println("Both array lists are not equal");
        }
    }
}
