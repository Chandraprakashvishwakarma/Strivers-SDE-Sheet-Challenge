//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/*
Q. no. 61: Find Nth root of M
*/
class Solution
{
    public int NthRoot(int n, int m)
    {
        int l = 1,h = m;
        while(l<=h){
            int mid = l+(h-l)/2;
            int val = (int)Math.pow(mid,n);
            if( val== m) return mid;
            else if(val>m) h = mid -1;
            else l = mid+1;
        }
        return -1;
    }
}

/*
Codding Ninjas:

public class Solution {
    public static int NthRoot(int n, int m) {
        int l = 1,h = m;
        while(l<h){
            int mid = (l+h)/2;
            int val = (int)Math.pow(mid,n);
            if(val == m) return mid;
            else if(val>m) h = mid;
            else l = mid+1;
        }
        return -1;
    }
}

*/