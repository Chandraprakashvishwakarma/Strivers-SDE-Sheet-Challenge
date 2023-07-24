/*
Q. no. 56: Print Permutations
*/class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,res,new ArrayList<Integer>());
        return res;
    }
    public void helper(int [] a,List<List<Integer>> res,List<Integer> temp){
        if(temp.size()==a.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(temp.contains(a[i])) continue;
            temp.add(a[i]);
            helper(a,res,temp);
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