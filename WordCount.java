package MapInterface;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        
        Map<String, Integer> wordMap = new HashMap<>();


        File file = new File("C:/Users/siddh/OneDrive/Desktop/example.txt");
        Scanner scanner = new Scanner(file);

        // Iterate through the file and count each word
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase(); // Convert to lowercase for case-insensitive matching
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        scanner.close();

        // Print the occurrence of each word
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

