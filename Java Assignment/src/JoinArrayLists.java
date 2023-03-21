import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("date");
        list2.add("elderberry");
        list2.add("fig");

        List<String> joinedList = new ArrayList<String>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined list: " + joinedList);
    }
}
