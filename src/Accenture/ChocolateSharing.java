package Accenture;

import java.util.Scanner;

public class ChocolateSharing {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }


        System.out.print(chocolateShare(arr,N));


    }
    public static int chocolateShare(int []arr, int N){
        int chocolateOfA = 0;
        for(int i=0 ; i< N;i++){
            chocolateOfA += arr[i]/3;
            if(arr[i] % 3 != 0){
                chocolateOfA++;
            }
        }
        return chocolateOfA;
    }
}
