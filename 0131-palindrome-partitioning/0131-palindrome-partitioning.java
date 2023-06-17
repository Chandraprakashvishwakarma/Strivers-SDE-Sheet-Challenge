/*
Q. no. 53: Palindrome Partitioning
*/
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s,res,new ArrayList<String>(),0);
        return res;
    }
    public void helper(String s,List<List<String>> res ,List<String> temp,int index){
        if(index == s.length()) { res.add( new ArrayList<>(temp)); return;}
        for(int i=index;i<s.length();i++){
            if(isPal(s,index,i)){
                temp.add(s.substring(index,i+1));
                helper(s,res,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPal(String s,int l,int h){
        while(l<h){
            if(s.charAt(l++)!=s.charAt(h--)) return false;
        }
        return true;
    }
}

/*

Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s,res,new ArrayList<String>(),0);
        return res;
    }
    public static void helper(String s,List<List<String>> res,ArrayList<String> temp,int index){
        if(index == s.length()) {res.add(new ArrayList<>(temp));return;}
        for(int i=index;i<s.length();i++){     
            if(isPal(s,index,i)){
                temp.add(s.substring(index,i+1));
                helper(s,res,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
        return;
    }
    public static boolean isPal(String s,int l,int h){
        while(l<h){
            if(s.charAt(l++)!=s.charAt(h--)) return false;
        }
        return true;
    }
}
*/