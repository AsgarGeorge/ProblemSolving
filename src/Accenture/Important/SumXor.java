package Accenture.Important;

import java.util.Scanner;

public class SumXor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0, xor = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                xor ^= arr[i];
            } else {
                sum += arr[i];
            }
        }
        int diff = sum - xor;
        System.out.print(diff);
    }
}
