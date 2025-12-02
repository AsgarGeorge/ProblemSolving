package Cognizant;

public class Prime {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        for(int i = 1000; i >= 2; i--){
            if(checkPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean checkPrime(int num){
        if(num <= 1)return false;
        int range =(int) Math.pow(num,0.5);
        for(int i = 2 ; i <= range;i++){
            if(num % i == 0)return false;
        }
        return true;
    }
}
