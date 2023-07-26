/*
Q. no. 63: Single Element in a Sorted Array
*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-2,mid=0;
        while(low<=high){
            mid=(low+high)>>1;
            if(nums[mid]==nums[mid^1]) low=mid+1;
            else high=mid-1;
        }
        return nums[low];
    }
}
/*
//Second logic 
while(low<high){
            mid=(low+high)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1])||(mid%2==1&&nums[mid]==nums[mid-1])){
                low=mid+1;
            }
            else high=mid;
        }
        return nums[low];
        
        
Codding Ninjas:

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        if(arr.size()<2) return arr.get(0);
        int l =0,r=arr.size()-1;
        while(l<r){
            int mid = (l+r)/2;
            if(mid%2==1){
                if(mid >0 && arr.get(mid)==arr.get(mid-1)) l=mid+1;
                else r=mid;
            }
            else {
                if(mid<arr.size()-1 && arr.get(mid)==arr.get(mid+1)) l=mid+1;
                else r=mid;
            }
        }
        return arr.get(l);
    }
}
*/