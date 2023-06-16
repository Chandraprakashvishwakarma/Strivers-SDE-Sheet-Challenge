/*
Q. no. 50: Subset Sums II
*/
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        helper(nums,res, new ArrayList<Integer>(),0);
        return res;
    }
    public void helper(int[] arr,List<List<Integer>> res,List<Integer> temp,int index){
        res.add(new ArrayList(temp));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            helper(arr, res,temp,i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }
}

/*
Codding Ninjas: 

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr,res,new ArrayList<Integer>(),0);
        return res;
    }

    public static void helper(int[] arr,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> temp,int index){
        res.add(new ArrayList(temp));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            helper(arr, res,temp,i+1);
            temp.remove(temp.size()-1);
        }
        return;
    }

}
*/