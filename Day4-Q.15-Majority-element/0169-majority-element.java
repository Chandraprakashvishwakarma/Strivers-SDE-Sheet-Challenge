/*
Q. no. 15: Majority Element
*/
class Solution {
    public int majorityElement(int[] nums) {
        int pre = 0, count = 0;
        for(int i:nums){
            if(count==0){
                pre = i;
                count=1;
            }
            else if(i==pre) count++;
            else count--;
        }
        return pre;
    }
}

/*
Codding ninjas

import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		int el =arr[0],count =1;
		for(int i=1;i<n;i++){
			if(el == arr[i]) count++;
			else count--;
			if(count==0){
				el = arr[i];
				count =1;
			}
		}
		count =0;
		for(int i:arr){
			if(i==el) count++;
		}
		if(count >n/2) return el;
		else return -1;
	}
}
*/
