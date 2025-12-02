package Accenture;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.print(findPeakElement(arr));

    }
    public static int findPeakElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if ((i == 0 || arr[i - 1]< arr[i])
                    && (i == n - 1 || arr[i] > arr[i + 1])) {
                return i;
            }
        }

        return -1;
    }
}
