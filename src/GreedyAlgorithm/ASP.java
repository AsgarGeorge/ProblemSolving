package GreedyAlgorithm;

import java.util.*;

public class ASP
    ///activity selection problem


{
    public static void main(String[] args) {
        int start[] = {1,3,0,8,5,5};
        int end[] =   {2,4,6,9,7,9};
        System.out.println(activitySelection(start,end,6));
        Stack<Integer> s = new Stack<Integer>();
    }

        public static int activitySelection(int start[], int end[], int n) {

            Activity[] activities = new Activity[n];
            for (int i = 0; i < n; i++) {
                activities[i] = new Activity(start[i],end[i]);
            }
            Arrays.sort(activities);
            int ans = 0;
            int lastActivityEnd = 0;
            for (int i = 0; i < n; i++) {
                if(activities[i].start > lastActivityEnd){
                    lastActivityEnd = activities[i].end;
                    ans++;
                }
            }
            return ans;
        }
    }
class Activity implements Comparable<Activity> {
    int start;
    int end;

    public Activity(int start, int end) {
        this.start = start;
        this.end = end;

    }

    @Override
    public int compareTo(Activity o) {
        if (this.end < o.end) {
            return -1;
        } else if (this.end > o.end) {
            return 1;
        } else return 0;
    }
}



