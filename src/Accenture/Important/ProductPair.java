package Accenture.Important;

import java.util.Scanner;

public class ProductPair {
    public static void main(String[] args){
        //write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int temp = 0;
        int m = arr[0];
        int p = arr[1];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] + arr[j] == 18)
                {
                    temp = arr[i] * arr[j];

                    if(temp >= max)
                    {
                        max = temp;
                        m = arr[i];
                        p = arr[j];
                    }
                }

            }
        }
        if(m>p)
        {
            System.out.println("[" + m + "," + p + "]");
        }
        else{
            System.out.println("[" + p + "," + m + "]");
        }
    }
}
