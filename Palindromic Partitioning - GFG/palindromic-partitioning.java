//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
/*
Q. no. 184 : Palindromic Partitioning
*/
class Solution{
    static int palindromicPartition(String s)
    {
        int n = s.length();
		int [] dp = new int[n+1];

		for(int i=n-1;i>=0;i--){
			int minCost =Integer.MAX_VALUE;

			for(int j = i;j<s.length();j++){
				if(isPal(i,j,s)){
					int cost = 1+dp[j+1];
					minCost = Math.min(minCost,cost);
				}
			}
			dp[i] =  minCost;
		}
		return dp[0]-1;
    }
    
    public static boolean isPal(int i,int j,String s){
		
		while(i<j) {
			if(s.charAt(i++)!=s.charAt(j--)) return false;
		}
		return true;
	}
}

/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {

	public static int palindromePartitioning(String s) {
	    // Write your code here
		int n = s.length();
		int [] dp = new int[n+1];

		for(int i=n-1;i>=0;i--){
			int minCost =Integer.MAX_VALUE;

			for(int j = i;j<s.length();j++){
				if(isPal(i,j,s)){
					int cost = 1+dp[j+1];
					minCost = Math.min(minCost,cost);
				}
			}
			dp[i] =  minCost;
		}
		// Arrays.fill(dp,-1);
		// return helper(0,str,dp)-1;
		return dp[0]-1;
	}
	//recursion + memoization
	// public static int helper(int i,String s,int [] dp){
	// 	if(i == s.length()) return 0;

	// 	if(dp[i]!=-1) return dp[i];

	// 	int minCost =Integer.MAX_VALUE;

	// 	for(int j = i;j<s.length();j++){
	// 		if(isPal(i,j,s)){
	// 			int cost = 1+helper(j+1,s,dp);
	// 			minCost = Math.min(minCost,cost);
	// 		}
	// 	}
	// 	return dp[i] =  minCost;
	// }

	public static boolean isPal(int i,int j,String s){
		
		while(i<j) {
			if(s.charAt(i++)!=s.charAt(j--)) return false;
		}
		return true;
	}

}

*/