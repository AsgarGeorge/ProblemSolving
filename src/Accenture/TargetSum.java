package Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int targetSum = s.nextInt();
        System.out.println(Arrays.toString(findTarget(arr,targetSum)));



    }
    public static int [] findTarget(int arr[], int target){
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[j]+arr[i];
                if(target == sum){
                    return new int[]{i,j};
                }
                sum = 0;
            }


        }
        return new int[]{-1,-1};
    }
}
