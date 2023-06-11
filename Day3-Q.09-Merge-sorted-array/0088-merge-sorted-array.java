/*
Q. no. 9:  Merge Sorted Array
LeetCode
*/
class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m+n-1;
        m--;n--;
        while(m>=0 && n>=0){
            if(arr1[m]>arr2[n]) arr1[i--]=arr1[m--];
            else arr1[i--]=arr2[n--];
        }
        while(n>=0) arr1[i--]=arr2[n--];
    }
}

/*
Codding ninjas

import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i = m+n-1;
        m--;n--;
        while(m>=0 && n>=0){
            if(arr1[m]>arr2[n]) arr1[i--]=arr1[m--];
            else arr1[i--]=arr2[n--];
        }
        while(n>=0) arr1[i--]=arr2[n--];
        return arr1;
    }
}

*/