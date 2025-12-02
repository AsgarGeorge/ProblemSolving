package Accenture.Important;

import java.util.Scanner;

public class FindHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h = scan.nextInt();
        double initialV = scan.nextInt();
        double finalV = scan.nextInt();
        double ans = h* Math.pow(initialV/finalV,2);
        System.out.print((int)ans);
    }
}
