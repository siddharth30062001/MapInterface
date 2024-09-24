package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        
        String input = "hello world";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
