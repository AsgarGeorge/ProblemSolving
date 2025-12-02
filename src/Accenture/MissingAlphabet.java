package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class MissingAlphabet {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int arr[] = new int[26];
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)==' ') continue;
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                sb.append((char)(i+'a'));
            }

        }
        System.out.print(sb);
        //System.out.println(Arrays.toString(arr));

    }
}
