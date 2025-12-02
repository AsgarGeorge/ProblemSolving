package Accenture;

import java.util.Scanner;

public class AntMovement {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++)
        {  array[i]=s.nextInt();
        }

        System.out.println(antMoved(array,N));


    }
    public static int  antMoved(int []arr, int N){
        int moveCounter = 0;
        int antMoved = 0;
        for(int i = 0; i < N; i++){
            moveCounter += arr[i];
            if(moveCounter == 0){
                antMoved++;
            }
        }
        return antMoved;
    }
}
