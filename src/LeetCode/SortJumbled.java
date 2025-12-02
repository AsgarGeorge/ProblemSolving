package LeetCode;

import java.util.*;

class Pair{
    int num;
    int mappedNum;

    public Pair(int num, int mappedNum) {
        this.num = num;
        this.mappedNum = mappedNum;
    }

    @Override
    public String toString() {
        return "pair{" +
                "num=" + num +
                ", mappedNum=" + mappedNum +
                '}';
    }
}

public class SortJumbled {
    public static int[] sortJumbled(int[] mapping, int[] nums) {

        Comparator<Pair> comp = new Comparator<Pair>() {

            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.mappedNum > o2.mappedNum){
                    return 1;
                }
                else if(o1.mappedNum == o2.mappedNum){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        };
        List<Pair> list = new ArrayList<>();
        for (int num:nums){
            String str = Integer.toString(num);
            Integer key = 0;
            for (int i = 0; i < str.length(); i++) {
               key =  key * 10 + mapping[str.charAt(i)-'0'] ;
            }
            list.add(new Pair(num,key));
        }
        System.out.println(list);
        Collections.sort(list,comp);

        int i = 0;
        for(Pair e : list){

            nums[i++]=e.num;
        }
        System.out.println(list);

    return nums;
    }

    public static void main(String[] args) {
        int []mappings ={8,9,4,0,2,1,3,5,7,6};
        int nums[] = {991,338,38};
        int []arr = sortJumbled(mappings,nums);
        System.out.println(Arrays.toString(arr));
    }
}
