package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StrProblems {
    public static void main(String[] args) {
        System.out.println(isAnagram("ANAGRAM","NAGARAM"));
    }
    public int romanToInt(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        return ans;
    }


    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[52]; // 26 for 'A'-'Z' and 26 for 'a'-'z'

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 >= 'A' && ch1 <= 'Z') {
                freq[ch1 - 'A']++;
            } else if (ch1 >= 'a' && ch1 <= 'z') {
                freq[ch1 - 'a' + 26]++;
            }

            if (ch2 >= 'A' && ch2 <= 'Z') {
                freq[ch2 - 'A']--;
            } else if (ch2 >= 'a' && ch2 <= 'z') {
                freq[ch2 - 'a' + 26]--;
            }
        }

        for (int i = 0; i < 52; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            Character original = s.charAt(i);
            Character replacement = t.charAt(i);
           if(!map.containsKey(original)) {
               if(!map.containsValue(replacement)){
                   map.put(original,replacement);
               }
               else{
                   return false;
               }
           }
           else {
               Character checkReplace = map.get(original);
               if(checkReplace!= replacement) return false;
           }
        }


        return true;

    }
    public static String largestOddNumber(String num) {
        char []arr = num.toCharArray();
        int maxOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 1){
                maxOdd = Integer.max(maxOdd,arr[i]);
            }
        }
        if(maxOdd == 0){
            return "";
        }else {
            return new String(String.valueOf(maxOdd));
        }

    }
    public static String reverseWords(String s) {

        int i = 0;
        int j = 0;
        int N = s.length();
        StringBuilder result = new StringBuilder();
        while(i < N){
            while(i < N && s.charAt(i) ==' ') i++;
            j = i;
            while(j < N && s.charAt(j) != ' '){
                j++;
            }
            if(i < j){
                String word = s.substring(i,j);

                if(result.length()==0) result.append(word);
                else result.insert(0, word + " ");
            }

            i = j+1;

        }
        return result.toString();


    }
}
