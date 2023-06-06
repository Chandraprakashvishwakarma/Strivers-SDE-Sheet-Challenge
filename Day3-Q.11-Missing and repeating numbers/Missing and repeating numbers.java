/*
Q. no. 11: Missing and repeating numbers
*/
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int missing=0,repeating=0;
        int sum =0;
        for(int i:arr){
            if(arr.get(Math.abs(i)-1)<0) repeating =Math.abs(i);
            else arr.set(Math.abs(i)-1,-1*(arr.get(Math.abs(i)-1)));
            sum+=Math.abs(i);
        }
        sum-=repeating;
        int actualSum = n*(n+1)/2;
        missing = actualSum - sum;
        return new int [] {missing,repeating};
    }
}
