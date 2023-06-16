/*
Q. no. 51: Return Subsets Sum to K ( Combination Sum )
*/
class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        helper(a,res,new ArrayList<Integer>(),target,0);
        return res;
    }
    public void helper(int [] a,List<List<Integer>> res,List<Integer> temp,int target,int start){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target>0){for(int i=start;i<a.length;i++){
            temp.add(a[i]);
            helper(a,res,temp,target-a[i],start);
            temp.remove(temp.size()-1);
            start++;
        }}
        return;
    }
}

/*
Codding Ninjas:

import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr,res,new ArrayList<>(),0,0,k);
        return res;
        }
        public static void helper(ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> res , ArrayList<Integer> temp,int index ,int sum ,int k){
            if(sum == k) res.add(new ArrayList<>(temp));
            for(int i=index;i<arr.size();i++){
                sum+=arr.get(i);
                temp.add(arr.get(i));
                helper(arr,res,temp,i+1,sum,k);
                sum-=arr.get(i);
                temp.remove(temp.size()-1);
            }
            return;
        }
}
*/