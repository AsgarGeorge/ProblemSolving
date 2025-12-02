package ZohoPrep;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {4,6,5,2,1};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MAX_VALUE;

        for(int num: arr){
            if(max < num){
                secMax = max;
                max = num;
            } else if (secMax < num) {
                secMax = num;
            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
