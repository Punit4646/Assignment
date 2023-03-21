import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // associate some values with keys in the HashMap
        studentGrades.put("Dj", 90);
        studentGrades.put("Ram", 80);
        studentGrades.put("Punit", 95);
        studentGrades.put("Charan", 85);

        // print out the HashMap
        System.out.println("The student grades are: " + studentGrades);
    }
}
