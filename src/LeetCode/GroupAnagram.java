package LeetCode;
import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            String frequencyString = generateFrequencyString(s);
            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(s);
            }
            else{
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                map.put(frequencyString,stringList);
            }

        }
        return new ArrayList<>(map.values());
    }
    public static String generateFrequencyString(String s){

        int freq[] = new int [26];
        Arrays.fill(freq,0);
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;

        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                sb.append((char)i+'a');
                sb.append(freq[i]);
            }
        }
        return sb.toString();

    }
}
