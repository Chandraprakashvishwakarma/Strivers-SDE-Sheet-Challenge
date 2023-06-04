/*
Q. no. 4: Maximum Subarray
*/
class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE,sum=0;
        for(int i:nums){
            sum+=i;
            max = Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}