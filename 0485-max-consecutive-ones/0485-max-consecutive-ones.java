/*
Q. no. 42: Max Consecutive Ones
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count =0;
            else {
                count++;
                max = Math.max(max,count);
            }
        }
        return max;
    }
}

/*
Codding Ninjas: 

Problem: 
Given a binary array 'ARR' of size 'N', your task is to find the longest sequence of continuous 1's that can be formed by replacing at-most 'K' zeroes by ones. Return the length of this longest sequence of continuous 1's.

Sample Input 1:
1
7
1 0 0 1 1 0 1
1
Sample Output 1:
4

Solution:

import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		int max = 0,count=0;
		int i=0,j=0;
		while(i<n && j<n){
			if(k>0 || arr.get(j)==1){
				if(arr.get(j)==0) k--;
				count++;
				max = Math.max(max,count);
				j++;
			}
			else {
				if(arr.get(i)==0) k++;
				count--;
				i++;
			}
		}
		return max;
	}
}
*/

