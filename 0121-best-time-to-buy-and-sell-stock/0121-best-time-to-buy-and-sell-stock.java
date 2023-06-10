/*
Q. no. 6: Best Time to Buy and Sell Stock
*/
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i:prices){
            min = Math.min(min,i);
            max= Math.max(max,i-min);
        }
        return max;
    }
}

/*

Codding Ninjas:

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min=Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i:prices){
            min = Math.min(min,i);
            maxProfit = Math.max(maxProfit,i-min);
        }
        return maxProfit;
    }
}

*/
