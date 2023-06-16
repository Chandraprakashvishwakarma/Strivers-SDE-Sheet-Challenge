//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends

/*
Q. no. 47: Find Minimum Number Of Coins
*/
class Solution{

	public int minCoins(int coins[], int m, int V) 
	{ 
	    int table[] = new int[V + 1];
        table[0] = 0;
        for (int i = 1; i <= V; i++)
        table[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < m; j++)
            if (coins[j] <= i)
            {
                int sub_res = table[i - coins[j]];
                if (sub_res != Integer.MAX_VALUE 
                       && sub_res + 1 < table[i])
                       table[i] = sub_res + 1;
            }
        }
          if(table[V]==Integer.MAX_VALUE)
            return -1;
        return table[V];
	} 
}

/*

Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int [] coins = {1,2,5,10,20,50,100,500,1000};
        int res = 0;
        int j = coins.length-1;
        while(amount>0 && j>=0){
            if(amount>=coins[j]){
                res+=(amount/coins[j]);
                amount%=coins[j];
            }
            else{
                j--;
            }
        }
        return res;
    }
}
*/