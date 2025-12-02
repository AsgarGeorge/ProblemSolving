package Accenture;

import java.util.Arrays;
import java.util.Scanner;


public class CountTriplets {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i= 0 ; i < arr.length;i++){
            arr[i] = s.nextInt();
        }
        int targetProduct = s.nextInt();
        s.close();
        System.out.println(triplets(arr,N,targetProduct));

    }
    public static int triplets(int []arr, int N, int targetProduct){

        // sorting the array
        Arrays.sort(arr);
        //using three-pointer algorithm
        int count = 0;
        for(int i=0 ; i < arr.length-2;i++){
            int j = i+1; int k = arr.length-1;

            while(j < k){
                int product = arr[i]*arr[j]*arr[k];
                if(product == targetProduct){
                    count++;
                    j++;
                    k--;
                }
                else if(product < targetProduct ){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return count;
    }
}
