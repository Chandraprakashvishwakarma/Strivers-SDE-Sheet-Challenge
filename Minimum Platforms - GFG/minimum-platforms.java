//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java
/*
Q. no. 44: Minimum Number of Platforms
*/
class Solution
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max = 0,plat=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]>dep[j]) {plat--;j++;}
            else {plat++;i++;}
            max = Math.max(max,plat);
        }
        return max;
    }
}

/*
Codding Ninjas:

import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int i = 0,j=0, plat = 0,max = 0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){ plat++; i++; }
            else{ plat--; j++;}
            max = Math.max(max,plat);
        }
        return max;
    }
}

*/
