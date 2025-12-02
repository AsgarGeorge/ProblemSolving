package LeetCode;

public class CountGoodNumbers {
    public static int countGoodNumbers(long n) {
        if(n%2==0){
            return 5;
        }
        if(n%2 == 1){
            return 4;
        }

        return (int)(countGoodNumbers(n-2)*countGoodNumbers(n-1));
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
    }
}
