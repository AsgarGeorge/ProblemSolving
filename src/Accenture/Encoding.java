package Accenture;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        String sb = new String();

        while(N > 0){
            int digit  = N%10;
            int squared = digit*digit;
            sb = squared + sb ;
            N = N / 10;
        }
        //System.out.println(Integer.parseInt(sb.reverse().toString()));

        System.out.println(sb);
        // output should be 13649

    }
}
