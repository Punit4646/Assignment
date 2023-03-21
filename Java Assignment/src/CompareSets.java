import java.util.*;

public class CompareSets {
   public static void main(String[] args) {
      Set<Integer> set1 = new HashSet<Integer>();
      set1.add(1);
      set1.add(2);
      set1.add(3);
      set1.add(4);
      set1.add(5);
      
      Set<Integer> set2 = new HashSet<Integer>();
      set2.add(3);
      set2.add(4);
      set2.add(5);
      set2.add(6);
      set2.add(7);

      System.out.println("Set 1: " + set1);
      System.out.println("Set 2: " + set2);
      
      set1.retainAll(set2);
      
      System.out.println("Common elements: " + set1);
   }
}
