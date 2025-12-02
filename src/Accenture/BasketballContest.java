package Accenture;

import java.util.Scanner;

public class BasketballContest {

    public static int maxPossibleScore(int N, int K, int[]arr) {

        int maxScore = 0;
        for (int i = 0; i <= N-K; i++) {
            int currentScore = 0;
            int count = 1;
            for (int j = i; j < i + K; j++) {

                currentScore = arr[j]*(count++) + currentScore;
                ;

            }
            maxScore = Math.max(currentScore,maxScore);
        }
        return maxScore;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++)
        {  array[i]=s.nextInt();
        }

        int result = maxPossibleScore(N, K, array);
        System.out.println(result);
    }
}

