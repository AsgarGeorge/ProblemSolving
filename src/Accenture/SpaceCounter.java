package Accenture;

import java.util.Scanner;

public class SpaceCounter {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int counter = 0;
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                counter++;
            }
        }
        System.out.print(counter);
    }
}
