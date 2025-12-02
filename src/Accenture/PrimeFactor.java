package Accenture;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int N = s.nextInt();
        int arrlen = N;
        ArrayList<Integer> prime = new ArrayList<>();
        int j = 0;
        for (int i = 2; i < arrlen; i++) {
            while (N % i == 0) {
                prime.add(i);
                N = N / i;
            }
        }
        if (N > 2) prime.add(N);
        int sum = 0;
        boolean valid = true;
        for (int ele : prime) {
            if (ele < arr.length) {
                int value = arr[ele];
                sum += value;
            } else {
                valid = false;
                break;
            }
        }
        if (!valid) {
            sum = 0;
        }

//        System.out.println(prime);
//        System.out.println(Arrays.toString(arr));
        System.out.print(sum);



    }
}