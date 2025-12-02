package Accenture.Important;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int arr[] = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }
        // gokul -> stringbuilder is a class same as string but here strings
        // are muttable and have different method names.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            if(arr[i] % 2 == 0){
                sb.append("even");
            }
            else{
                sb.append("odd");
            }
        }
        System.out.print(sb.toString());
    }
}
