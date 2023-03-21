import java.util.HashSet;
import java.util.ArrayList;

public class HashSetToArrayList {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        ArrayList<String> arrayList = new ArrayList<String>(hashSet);

        System.out.println("ArrayList elements: ");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
