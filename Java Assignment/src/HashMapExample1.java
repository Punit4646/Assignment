import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // associate some values with keys in the HashMap
        studentGrades.put("Dj", 90);
        studentGrades.put("Ram", 80);
        studentGrades.put("Punit", 95);
        studentGrades.put("Charan", 85);
        
        // get the number of key-value mappings in the HashMap
        int size = studentGrades.size();

        // print out the size of the HashMap
        System.out.println("The number of key-value mappings in the HashMap is: " + size);
    }
}
