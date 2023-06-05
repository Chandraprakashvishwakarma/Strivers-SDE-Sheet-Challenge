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