package Accenture;

import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int [n];
        for(int i=0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        int ans = findEquilibrium(arr);
        if(ans == -1){
            System.out.print("NOT FOUND");
        }
        else{
            System.out.print(ans);
        }
    }
    public static int findEquilibrium(int arr[]){
        for(int i = 1; i < arr.length-1; i++){
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];


            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];


            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
