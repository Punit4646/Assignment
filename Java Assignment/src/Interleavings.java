import java.util.ArrayList;

public class Interleavings {
    public static ArrayList<String> interleavings(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();
        if (s1.isEmpty()) {
            result.add(s2);
        } else if (s2.isEmpty()) {
            result.add(s1);
        } else {
            for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
                ArrayList<String> interleavings = interleavings(s1.substring(i + 1), s2.substring(0, i) + s1.charAt(i) + s2.substring(i + 1));
                for (String interleaving : interleavings) {
                    result.add(s1.substring(0, i) + interleaving);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "WX";
        String s2 = "YZ";
        ArrayList<String> interleavings = interleavings(s1, s2);
        System.out.println(interleavings);
    }
}
