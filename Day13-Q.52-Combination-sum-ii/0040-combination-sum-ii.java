/*
Q. no. 52: Combination Sum II
*/

class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int target) {
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        helper(a,res,new ArrayList<Integer>(),target,0);
        return res;
    }
    public void helper(int [] a,List<List<Integer>> res,List<Integer> temp, int target,int start){
        if(target == 0) {
             res.add(new ArrayList<>(temp));
        }
        else if(target>0){
            for(int i=start;i<a.length;i++){
                if(i>start && a[i]==a[i-1]) continue;
                temp.add(a[i]);
                helper(a,res,temp,target-a[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
}

/*
Codding Ninjas:

import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr,res,new ArrayList<Integer>(),0,target);
        return res;
    }
    public static void helper(ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> res , ArrayList<Integer> temp,int index,int target){
        if(target == 0) res.add(new ArrayList<>(temp));
        if(target>0){
            for(int i=index;i<arr.size();i++){
                if(i!=index && arr.get(i)==arr.get(i-1)) continue;
                temp.add(arr.get(i));
                helper(arr,res,temp,i+1,target-arr.get(i));
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
}

*/