package Accenture.Important;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String str = scan.nextLine();
        int length = scan.nextInt();
        char ch = scan.next().charAt(0);
        int count = 0;
        for(int i = 0; i < length;i++){
            if(str.charAt(i) == ch) count++;
        }
        System.out.print(count);
    }
}
