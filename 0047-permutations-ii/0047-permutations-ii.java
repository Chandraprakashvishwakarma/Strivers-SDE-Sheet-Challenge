/*
Q. no. 55: Print Permutations - String
*/
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        helper(nums,res,new ArrayList<Integer>(),used);
        return res;
    }
    public void helper(int [] a,List<List<Integer>> res,List<Integer> temp,boolean [] used){
        if(temp.size()==a.length && !res.contains(temp)){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(used[i] || i > 0 && a[i] == a[i-1] && !used[i - 1] ) continue; 
            used[i]=true;
            temp.add(a[i]);
            helper(a,res,temp,used);
            used[i]=false;
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
    public static List<String> findPermutations(String s) {
        List<String> res = new ArrayList<>();
        boolean used[] = new boolean[s.length()];
        helper(s,res,-1,"",used);
        return res;
    }
    public static void helper(String s,List<String> res,int index,String temp,boolean [] used){
        if(temp.length()==s.length()) {res.add(temp);return;}
        for(int i=0;i<s.length();i++){
            if(!used[i]){
            used[i] =true;
            temp+=(s.charAt(i));
            helper(s,res,i,temp,used);
            used[i]=false;
            temp=temp.substring(0,temp.length()-1);
            }
        }
    }
}
*/