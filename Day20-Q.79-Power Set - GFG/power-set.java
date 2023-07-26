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
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/*
Q. no. 79: Power Set
*/

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
       ArrayList<String> res = new ArrayList<>();
		for(int i=0;i<(1<<s.length());i++){
		    String temp = "";
			for(int j=0;j<s.length();j++){
				if((i & (1 << j))!=0) temp+=s.charAt(j);
			}
			if(!temp.equals("")) res.add(temp);
		}
		Collections.sort(res);
		return res;
    }
}

/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i=0;i<(1<<arr.size());i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0;j<arr.size();j++){
				if((i & (1 << j))!=0) temp.add(arr.get(j));
			}
			res.add(temp);
		}
		return res;
	}
}



*/