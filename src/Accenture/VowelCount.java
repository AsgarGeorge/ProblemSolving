package Accenture;

import java.util.*;


public class VowelCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(maxVowel(str));

    }

    public static char maxVowel(String str) {

        String vowels = "aeiou";
        // Map to count occurrences of each vowel
        Map<Character, Integer> count = new HashMap<>();

        // Initialize map with vowels
        for (char v : vowels.toCharArray()) {
            count.put(v, 0);
        }

        // Iterate through the string and count vowels
        for (char c : str.toLowerCase().toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            }
        }

        // Find the most frequent vowel
        char mostFrequent = ' ';
        int maxCount = 0;
        for (char v : vowels.toCharArray()) {
            if (count.get(v) > maxCount) {
                maxCount = count.get(v);
                mostFrequent = v;
            }
        }

        return mostFrequent;
    }
}
