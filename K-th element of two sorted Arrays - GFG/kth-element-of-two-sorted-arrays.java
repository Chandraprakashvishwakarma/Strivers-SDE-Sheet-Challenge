//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
Q. no. 66: K-th element of two sorted Arrays
*/
class Solution {
    public long kthElement( int a[], int b[], int n, int m, int k) {
        if(m<n) return kthElement(b,a,m,n,k);
        int l = Math.max(0,k-m),h = Math.min(k,n);
        while(l<=h){
            int cut1 = (l+h)/2;
            int cut2 = k - cut1;
            
            int l1 = cut1<1?Integer.MIN_VALUE:a[cut1-1];
            int l2 = cut2<1?Integer.MIN_VALUE:b[cut2-1];

            int r1 = cut1>=n?Integer.MAX_VALUE:a[cut1];
            int r2 = cut2>=m?Integer.MAX_VALUE:b[cut2];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2) h = cut1-1;
            else l = cut1+1;
        }
        return 0;
    }
}

/*
Codding Ninjas:

public class Solution {
    public static int ninjaAndLadoos(int a[], int b[], int n, int m, int k) {
        if(m<n) return ninjaAndLadoos(b,a,m,n,k);
        int l = Math.max(0,k-m),h = Math.min(k,n);
        while(l<=h){
            int cut1 = (l+h)/2;
            int cut2 = k - cut1;
            
            int l1 = cut1<1?Integer.MIN_VALUE:a[cut1-1];
            int l2 = cut2<1?Integer.MIN_VALUE:b[cut2-1];

            int r1 = cut1>=n?Integer.MAX_VALUE:a[cut1];
            int r2 = cut2>=m?Integer.MAX_VALUE:b[cut2];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2) h = cut1-1;
            else l = cut1+1;
        }
        return 0;
    }
}

*/