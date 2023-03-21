import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("Array elements: ");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
