/*
Q. no. 40: Trapping Rain Water
*/
class Solution {
    public int trap(int[] a) {
        int l = 0,r = a.length-1;
        int lmax = 0,rmax = 0;
        int res = 0;
        while(l<r){
            if(a[l]<=a[r]){
                if(a[l]>lmax){
                    lmax=a[l];
                }
                else{
                    res+=(lmax - a[l]);
                }
                l++;
            }
            else {
                if(a[r]>rmax){
                    rmax = a[r];
                }
                else{
                    res+=(rmax-a[r]);
                }
                r--;
            }
        }
        return res;
    }
}

/*
Codding Ninjas: time: O(N) space: O(2N); 

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long [] left = new long [n];
        long [] right = new long [n];
        long max = Integer.MIN_VALUE;
        long min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            left[i] = max;
            min =Math.max(min,arr[n-1-i]);
            right[n-1-i] = min;
        }
        long water = 0;
        for(int i=0;i<n;i++){
            water=water+Math.min(left[i],right[i])-arr[i];
        }
        return water;
    }
}
*/