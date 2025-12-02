package LeetCode;

import java.util.Map;
import java.util.TreeMap;

public class MinimumWindow {
        public String minWindow(String s, String t) {
            int[] need = new int[52];
            int[] have = new int[52];
            for(int i = 0; i < t.length(); i++){
                char ch = t.charAt(i);
                if(ch >= 'A' && ch <= 'Z') need[ch - 'A']++;
                else need[ch - 'a' + 26]++;
            }
            int n = s.length();
            int start = 0, end = 0;
            TreeMap<Integer,String> map = new TreeMap<>();

            while(end < n){
                char ch = s.charAt(end);
                if(ch >= 'A' && ch <= 'Z') have[ch - 'A']++;
                else have[ch - 'a' + 26]++;

                if(matches(need,have)){
                    String candidate = s.substring(start,end+1);
                    int length = candidate.length();
                    map.put(length,candidate);
                    while(start < end){
                        char ch1= s.charAt(start);
                        if(ch1 >= 'A' && ch1 <= 'Z') have[ch1 - 'A']--;
                        else have[ch1 - 'a' + 26]--;
                        start++;
                    }
                    end = end + 1;
                    continue;
                }
                end++;

            }
            int min = Integer.MAX_VALUE;
            for (Map.Entry m: map.entrySet()){
                int key = (int) m.getKey();
                if(key< min){
                    min = key;
                }
            }





            return map.get(min);
        }
        public boolean matches(int need[], int have[]){
            for(int i = 0; i< 26; i++){
                if(need[i] != 0){
                    if(need[i] != have[i])return false;
                }
            }
            return true;
        }
    }
