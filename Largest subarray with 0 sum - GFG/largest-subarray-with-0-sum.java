//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends

/*
Q. no. 21 : Largest subarray with 0 sum
*/
class GfG
{
    int maxLen(int arr[], int n)
    {
        int sum =0,max=0,target = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==target) max = Math.max(max,i+1);
            if(map.get(sum)==null) map.put(sum,i);
            else max=Math.max(max,i-map.get(sum));
        }
        return max;
    }
}

/*
Codding Ninjas : 
Problem : Given sum is zero.

Note: This solution can be used for any required sum(k).

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int prefixSum = 0,max = 0;
		int k = 0;//given in problem sum needed is zero
		for(int i=0;i<arr.size();i++){
			prefixSum+=arr.get(i);
			if(prefixSum == k){
				max = Math.max(max,i+1);
			}
			if(map.get(prefixSum-k)!=null){
				max = Math.max(max,i-map.get(prefixSum-k));
			}
			if(map.get(prefixSum)==null){
				map.put(prefixSum,i);
			}
		}
		return max;
	}
}

*/