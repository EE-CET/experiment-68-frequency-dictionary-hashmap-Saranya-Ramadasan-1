import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        String text = scanner.nextLine();

        // Use a regex that catches one or more whitespace characters
        String[] words = text.trim().split("\\s+");

        // TreeMap keeps keys in alphabetical order, which is often what strict testers want
        Map<String, Integer> frequencyMap = new TreeMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            // Ensure no trailing space after the count
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}