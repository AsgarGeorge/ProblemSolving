package Accenture;
import java.util.*;
public class Voting {
    public static void main(String[] args){
        //write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i]=s.nextInt();

        }

        int ans = majorityVote(arr);
        System.out.print(ans);
    }
    public static int majorityVote(int []v) {
        int n = v.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();


        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }


        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }
}
