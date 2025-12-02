package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {0};
        int nums2[] = {1};
        merge(nums1 , 0 , nums2, 1);
        System.out.println(Arrays.toString(nums1)+ " nums1");
        System.out.println(Arrays.toString(nums2)+ " nums2");
    }
    public static  void merge(int[] arr1, int m, int[] arr2, int n) {

        int i = 0; int j = 0;
        while(i < m){
            if(arr1[i] <= arr2[j]){
                i++;
            }
            else{
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i++;
            }
        }
        while(i < m+n && j < n){
            if(j == n-1){
                arr1[i] = arr2[j];
                break;
            }
            if(arr2[j] <= arr2[j+1]){
                arr1[i++] = arr2[j++];
            }
            else{
                arr1[i++] = arr2[j+1];
                arr2[j+1] = arr2[j];
                j++;
            }
        }


    }


}
