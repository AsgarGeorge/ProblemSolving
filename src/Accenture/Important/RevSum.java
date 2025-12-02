package Accenture.Important;

import java.util.Scanner;

public class RevSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;


        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.print(sum);
    }
}
