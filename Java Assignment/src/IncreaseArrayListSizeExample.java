import java.util.ArrayList;

public class IncreaseArrayListSizeExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(5); // create an ArrayList with initial capacity of 5
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("Current size of ArrayList: " + numbers.size());
        
        numbers.ensureCapacity(10); // increase capacity to 10
        
        System.out.println("New size of ArrayList: " + numbers.size());
    }
}
