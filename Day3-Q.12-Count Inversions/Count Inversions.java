/*
Q. no. 12: Count Inversions
*/
import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long ans =0;
        ans =  mergeSort(arr,0,arr.length-1);
        return ans;
    }
    public static long mergeSort(long arr[], int l, int r){
        long inversion_count=0;
        if(l<r){
        int m = (l+r)/2;
        inversion_count += mergeSort(arr, l, m);
        inversion_count += mergeSort(arr, m+1, r);
        inversion_count += merge(arr,l,m,r);
        }
        return inversion_count;
    }

    public static long merge(long arr[],int l,int m ,int r){
        long inversion_count=0;
        long [] temp = new long [r-l+1];
        int left=l, right=m+1, k=0;
        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                inversion_count+=(m+1-left);
                temp[k++] = arr[right++];
            }
        }
        while(left<=m) temp[k++]=arr[left++];
        while(right<=r) temp[k++] = arr[right++];

        for(int i=0;i<temp.length;i++) arr[l+i]= temp[i];
        
        return inversion_count;
    }
}
