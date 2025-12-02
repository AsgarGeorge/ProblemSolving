package Accenture;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i = 0 , j = 0;
        int n = str.length();
        StringBuilder result = new StringBuilder();
        while(i < n){
            while(str.charAt(i)==' ') i++;
            j = i;
            while(j < n && str.charAt(j)!=' ') j++;
            String word = str.substring(i,j);
            if(result.length()==0) result.append(word);
            else result.insert(0,word + ' ');

            i = j+1;

        }
        System.out.print(result);
    }
}
