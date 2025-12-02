package Accenture;

import java.util.Arrays;
import java.util.Scanner;

public class MinSubarray {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i= 0 ; i < arr.length;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        double avg = (arr[N-1]+arr[N-2])/2;
        if(arr[N-1]+arr[N-2] %2 != 0){
            avg++;
        }
        for(int i= 0 ; i < arr.length;i++){
            if(arr[i] < avg){
                arr[i] = 0;
            }

        }
        int sum = 0;
        for(int i= 0 ; i < arr.length;i++){

            sum += arr[i];
        }
        System.out.print(sum);
    }
}
