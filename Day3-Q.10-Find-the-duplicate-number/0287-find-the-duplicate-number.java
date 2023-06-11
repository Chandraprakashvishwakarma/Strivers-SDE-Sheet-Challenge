/*
Q. no. 10:  Find the Duplicate Number
LeetCode
*/
class Solution {
    public int findDuplicate(int[] nums) {
        for(int i:nums){
            if(nums[Math.abs(i)]<0)
                return Math.abs(i);
            else {
                nums[Math.abs(i)]*=-1;
            }
        }
        return -1;
    }
}

/*
Codding ninja

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        for(int i:arr){
            if(arr.get(Math.abs(i))<0) return Math.abs(i);
            else arr.set(Math.abs(i),-arr.get(Math.abs(i)));
        }
        return -1;
    }
}

*/