/*
Q. no. 13: Search a 2D Matrix
*/
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        if(a.length==0) return false;
        int n = a.length,m=a[0].length;
        int l=0,r=(n*m)-1;
        while(l<=r){
            int mid = (r+l)/2;
            if(a[mid/m][mid%m]==target) return true;
            if(a[mid/m][mid%m]>target) r=mid-1;
            else l=mid+1;
        }
        return false;
    }
}

/*
Codding Ninjas Solution :

import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int r = mat.size(), c = mat.get(0).size(),low =0,high = (r*c)-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mat.get(mid/c).get(mid%c)==target) return true;
            else if(mat.get(mid/c).get(mid%c)<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}




GFG solution :

        int i=0,j=m-1;
	    while(i<n && j>=0){
	        if(matrix[i][j]==x) return true;
	        if(matrix[i][j]<x) i++;
	        else j--;
	    }
	    return false;
*/