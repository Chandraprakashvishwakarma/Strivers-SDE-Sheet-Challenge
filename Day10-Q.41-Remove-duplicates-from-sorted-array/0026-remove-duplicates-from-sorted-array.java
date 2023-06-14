/*
Q. no. 41: Remove Duplicates from Sorted Array
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}

/*
Codding Ninjas:

import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int j=0;
        for(int i=0;i<n;i++){
            if(!arr.get(j).equals(arr.get(i))){
                arr.set(++j,arr.get(i));
            }
        }
        return ++j;
	}
}
*/