package ZohoPrep;

import java.util.HashMap;
import java.util.Map;

public class CoupleSwapper {

    static int minSwaps;

    public static void minSwapsBacktrack(char[] arr, int index, int swaps) {
        int n = arr.length;

        // Base case: reached end
        if (index >= n - 1) {
            minSwaps = Math.min(minSwaps, swaps);
            return;
        }

        // If current and next are a couple, skip
        if (arr[index] == arr[index + 1]) {
            minSwapsBacktrack(arr, index + 2, swaps);
            return;
        }

        // Try finding the match for arr[index]
        boolean found = false;
        for (int i = index + 1; i < n; i++) {
            if (arr[i] == arr[index]) {
                found = true;
                // Bubble arr[i] to index+1
                for (int j = i; j > index + 1; j--) {
                    swap(arr, j, j - 1);
                }

                minSwapsBacktrack(arr, index + 2, swaps + (i - (index + 1)));

                // Backtrack
                for (int j = index + 1; j < i; j++) {
                    swap(arr, j, j + 1);
                }
            }
        }

        // If no match found for arr[index], this path is invalid
        if (!found) return;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getMinSwaps(String input) {
        minSwaps = Integer.MAX_VALUE;
        char[] arr = input.toCharArray();

        // Early check: if number of chars is odd, we can't fully couple
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : arr) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (int count : freq.values()) {
            if (count % 2 != 0) return -1;  // Not fully pairable
        }

        minSwapsBacktrack(arr, 0, 0);
        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }

    public static void main(String[] args) {
        test("MOMDAD");
        test("AABDCCBE");
        test("AABBCDDFFCZ");
        test("AACBB");
        test("AABBC"); // odd character count
    }

    private static void test(String input) {
        int backtrack = getMinSwaps(input);
        System.out.println("Input: " + input);
        System.out.println("Backtracking Swaps: " + backtrack);
        System.out.println();
    }
}
