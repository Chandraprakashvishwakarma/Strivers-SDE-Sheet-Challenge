/*
Q. no. 49: Subset Sums
*/
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> a, int N){
        ArrayList<Integer> res = new ArrayList<>();
        helper(a,res,N,0,0);
        return res;
    }
    void helper(ArrayList<Integer> a,ArrayList<Integer> res,int n,int i,int sum){
        if(i==n){
            res.add(sum);
            return;
        }
        helper(a,res,n,i+1,sum+a.get(i));
        helper(a,res,n,i+1,sum);
        return;
    }
}

/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(num,res,0,0);
        Collections.sort(res);
        return res;
    }
    public static void helper(int [] num,ArrayList<Integer> res,int sum,int index){
        res.add(sum);
        for(int i=index;i<num.length;i++){
            sum+=num[i];
            helper(num,res,sum,i+1);
            sum-=num[i];
        }
        return;
    }
}
*/
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
