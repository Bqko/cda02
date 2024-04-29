package midterm.bakuri_sheklashvili_1.task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print the set of all different words
        System.out.println("Set of all different words:");
        System.out.println(uniqueWords);

        // Create a map to store the length of the word and the number of words with that length
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        // Print the map of word lengths and their counts
        System.out.println("\nMap of word lengths and their counts:");
        System.out.println(wordLengthMap);

        // Write results to the "task4.txt" file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("task4.txt", true));
            writer.newLine();
            writer.newLine();
            writer.write("Set of all different words:\n" + uniqueWords + "\n");
            writer.write("Map of word lengths and their counts:\n" + wordLengthMap + "\n");
            writer.close();
            System.out.println("\nResults appended to the file \"task4.txt\".");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
