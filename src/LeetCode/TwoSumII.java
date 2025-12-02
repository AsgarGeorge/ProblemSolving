package LeetCode;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static  int[] twoSum(int[] arr, int target) {

        int n = arr.length;
        for(int i = 0; i < n; i++){
            int rem = target - arr[i];
            int secElement = search(arr,rem,i+1,n-1);
            if(secElement != -1){
                return new int[]{i+1,secElement+1};
            }
        }
        return new int[0];
    }
    public static int search(int arr[], int target,int low,int high){

        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid -1;
            else low = mid + 1;

        }
        return -1;
    }

}


