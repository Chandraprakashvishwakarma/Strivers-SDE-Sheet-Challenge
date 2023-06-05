/*
Q. no. 8: Merge Intervals
LeetCode
*/
class Solution {
    public int[][] merge(int[][] a) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        int s = a[0][0];
        int e = a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0]<=e) e = Math.max(e,a[i][1]);
            else {
                list.add(new int [] {s,e});
                s = a[i][0];
                e = a[i][1];
            }
        }
        list.add(new int [] {s,e});
        
        return list.toArray(new int[0][]);
    }
}

/*
Q. no. 8: Merge Intervals

Codding Ninjas:-

import java.util.* ;
import java.io.*; 

//     Following is the Interval class structure

//     class Interval {
//         int start, int finish;

//         Interval(int start, int finish) {
//             this.start = start;
//             this.finish = finish;
//         }
//     }
    

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
         Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval interval1, Interval interval2) {
                return interval1.start - interval2.start;
            }
        });

        int s = intervals[0].start;
        int e = intervals[0].finish;
        List<Interval> res = new ArrayList<Interval>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<= e) e = Math.max(e,intervals[i].finish);
            else{
                Interval temp = new Interval(s,e);
                res.add(temp);
                s = intervals[i].start;
                e = intervals[i].finish;
            }
        }
        Interval temp = new Interval(s,e);
        res.add(temp);
        return res;

    }
}
*/