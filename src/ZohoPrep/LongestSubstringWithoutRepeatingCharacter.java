package ZohoPrep;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str = "cadbzabcd";
        String str2 = "jksdhjfkjsfnvolsrslkjdfnslkfn";
        System.out.println(solve(str));
        System.out.println(solve(str2));
    }
    public static int solve(String str){
        int left = 0, right = 0, maxLen = 0;

        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        while(right < str.length()){
            if(hash[str.charAt(right)] != -1){
                if(hash[str.charAt(right)] > left){
                    left = hash[str.charAt(right)] + 1;
                }
            }

            maxLen = Math.max(maxLen, right-left+1);
            System.out.println(left + " " + right);
            hash[str.charAt(right)] = right;
            right++;
        }
        return maxLen;
    }
}
