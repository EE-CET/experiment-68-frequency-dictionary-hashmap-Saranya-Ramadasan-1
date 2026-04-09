import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        String text = scanner.nextLine();

        // Split by whitespace
        String[] words = text.trim().split("\\s+");

        // Using LinkedHashMap to preserve the order in which words first appear
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}