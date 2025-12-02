package Accenture.Important;

import java.util.Scanner;

public class SpecialFibo {
    public static void main(String[] args){
        //write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n <= 1)return 1;
        return fibo(n-1)* fibo(n-1) + fibo(n-2)*fibo(n-2) % 47;
    }

}
