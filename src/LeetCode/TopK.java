package LeetCode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                continue;
            }
            map.put(nums[i],1);
        }
        Comparator<Integer> comp = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1) > map.get(o2)){
                    return 1;
                }
                else if(map.get(o1) == map.get(o2)){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);
        for(Integer key: map.keySet()){
            if(pq.size() < k){
                pq.add(key);
            }
            if(map.get(pq.peek())< map.get(key)){
                pq.poll();
                pq.add(key);
            }
        }
        int [] ans = new int[pq.size()];
        for(int j = 0; j < ans.length; j++){
            ans[j] = pq.poll();
        }
        return ans;
    }
}