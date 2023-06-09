/*
Q. no. 21: Longest Consecutive Sequence
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        for(int i:set){
            int count=0;
            if(!set.contains(i-1)){
                while(set.contains(i)){
                    count++;
                    i++;
                }
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}

/*
Codding Ninjas:

import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr) set.add(i);
        int max = 0;
        for(int i:set){
            int count =1;
            if(!set.contains(i+1)){
                while(set.contains(--i)) count++;
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
*/