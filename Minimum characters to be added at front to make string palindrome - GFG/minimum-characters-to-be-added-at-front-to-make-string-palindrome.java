//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java
/*
Q. no. 108: Minimum characters to be added at front to make string palindrome
*/
class Solution {
    public static int fixJ(String str, int i, int j) {
      while (str.charAt(i) != str.charAt(j)) {
         j--;
      }
      return j;
   }
   public static boolean checkPalindrome(String s, int i, int j) {
      while (i < j) {
         if (s.charAt(i++) != s.charAt(j--)) {
            return false;
         }
      }
      return true;
   }
   public static int minChar(String str) {
      if (str.length() == 0 || str.length() == 1) {
         return 0;
      }
      int i = 0, j = str.length() - 1;
      j = fixJ(str, i, j);
      while (j != i) {
         if (checkPalindrome(str, i, j)) {
            return str.length() - j - 1;
         }
         j = fixJ(str, i, --j);
      }
      return str.length() - j - 1;
   }
}
/*
Codding Ninjas:

//Using lps (giving TLE)
// public class Solution {

//     public static int minCharsforPalindrome(String str) {
//         String s = "";
//         for(int i=str.length()-1;i>=0;i--) s+=str.charAt(i);
//         s=str+'#'+s;
//         int last_lps = getLps(s);
//         return str.length()-last_lps;
//     }

//     public static int getLps(String str){
//         int [] lps = new int [str.length()];
//         int j=1;
//         int len = 0;
//         while(j<str.length()){
//             if(str.charAt(len)==str.charAt(j)){
//                 lps[j] = len+1;
//                 len++;
//                 j++;
//             }
//             else {
//                 if(len!=0) len = lps[len-1];
//                 else j++;
//             }
//         }
//         return lps[str.length()-1];
//     }

// }

public class Solution {
   public static int fixJ(String str, int i, int j) {
      while (str.charAt(i) != str.charAt(j)) {
         j--;
      }
      return j;
   }
   public static boolean checkPalindrome(String s, int i, int j) {
      while (i < j) {
         if (s.charAt(i++) != s.charAt(j--)) {
            return false;
         }
      }
      return true;
   }
   public static int minCharsforPalindrome(String str) {
      if (str.length() == 0 || str.length() == 1) {
         return 0;
      }
      int i = 0, j = str.length() - 1;
      j = fixJ(str, i, j);
      while (j != i) {
         if (checkPalindrome(str, i, j)) {
            return str.length() - j - 1;
         }
         j = fixJ(str, i, --j);
      }
      return str.length() - j - 1;
   }

}
*/

//{ Driver Code Starts.

class GFG {
	public static void main(String[] args) throws IOException
	{
	    var sc = new FastReader();
	    int test = sc.nextInt();
	    while(test-->0){
    		String s = sc.nextString();
    		System.out.println(Solution.minChar(s));
	    }
	}
    
    public static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		private void read() throws IOException
		{
			st = new StringTokenizer(br.readLine());
		}

		public String nextString() throws IOException
		{
			while(!st.hasMoreTokens())
				read();
			return st.nextToken();
		}

		public int nextInt() throws IOException
		{
			return Integer.parseInt(nextString());
		}

		public long nextLong() throws IOException
		{
			return Long.parseLong(nextString());
		}
	}
}
// } Driver Code Ends