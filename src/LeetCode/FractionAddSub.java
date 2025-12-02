package LeetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FractionAddSub {
    public static void main(String[] args) {
        System.out.println(fractionAddition("-1/2+1/2"));

    }
    public static String fractionAddition(String expression){
        int numerator = 0;
        int denominator = 1;
        Pattern pattern = Pattern.compile("([+-]?\\d+)/(\\d+)");
        Matcher matcher = pattern.matcher(expression);
        while(matcher.find()){
            int num = Integer.parseInt(matcher.group(1));
            int den = Integer.parseInt(matcher.group(2));
            numerator = (numerator*den) + (denominator*num);
            denominator = denominator*den;

            int gcd = gcd(Math.abs(numerator),denominator);
            numerator /= gcd;
            denominator /= gcd;

        }
        return numerator+"/"+denominator;
    }
    public static int gcd(int a ,int b){
        while( b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
