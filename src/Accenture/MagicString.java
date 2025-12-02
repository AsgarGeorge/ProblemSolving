package Accenture;
import java.util.*;
public class MagicString {
    public static void main(String[] args) {
        //write your code here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }
        System.out.println(str.length()-max);

    }
}
