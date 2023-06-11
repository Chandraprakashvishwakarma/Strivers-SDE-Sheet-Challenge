/*
Q. no. 19: Pair Sum
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i]) != null){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}

/*

Codding Ninjas: 
Problem: You are given an integer array 'ARR' of size 'N' and an integer
'S'. Your task is to return the list of all pairs of elements such that each sum of elements of each pair equals 'S'.
Note:
Each pair should be sorted i.e the first value should be less than or equals to the second value.
Return the list of pairs sorted in non-decreasing order of their first value. In case if two pairs have the same first value, the pair with a smaller second value should come first.


import java.io.*;
import java.util.* ;
public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        List<int[]> res = new ArrayList<>();
        for(int i =0;i<arr.length; i++){
            map.putIfAbsent(arr[i], new HashSet<>());
            map.get(arr[i]).add(i);
        }
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).remove(i);
            }
            if(map.containsKey(s-arr[i])){
                Set<Integer> value = map.get(s-arr[i]);
                int[] arr1 = new int[2];
                arr1[0]=arr[i];
                arr1[1]=s-arr[i];
                for(int j : value){
                    res.add(arr1);
                }
            }
        }
        return res;
    }
}

*/