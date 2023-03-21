import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentChar {
    public static char findSecondMostFrequentChar(String str) {
        // Create a map to store the frequency of each character in the string
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the maximum frequency and the character that has that frequency
        int maxFrequency = Integer.MIN_VALUE;
        char maxChar = '\0';
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Find the second maximum frequency and the character that has that frequency
        int secondMaxFrequency = Integer.MIN_VALUE;
        char secondMaxChar = '\0';
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > secondMaxFrequency && entry.getValue() < maxFrequency) {
                secondMaxFrequency = entry.getValue();
                secondMaxChar = entry.getKey();
            }
        }

        return secondMaxChar;
    }

    public static void main(String[] args) {
        String str = "successes";
        char secondMostFrequentChar = findSecondMostFrequentChar(str);
        System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
    }
}
