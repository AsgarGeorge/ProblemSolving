package Accenture;

import java.util.Scanner;

public class Gcd_Lcm {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        System.out.println(gcd(N1,N2));
        System.out.println(lcm(N1,N2));
    }
    public static int gcd(int a,int b){
        while( a != 0 && b!= 0) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }
        return (a != 0) ? a : b;

    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }

}
