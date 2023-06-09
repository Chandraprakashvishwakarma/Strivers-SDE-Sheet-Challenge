/*
Q. no. 23 : Count Subarrays with Given XOR
Codding Ninjas:
*/

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int xor =0,count =0;
		map.put(xor,1);
		for(int i:arr){
			xor=xor^i;
			int x = xor^k;
			if(map.get(x)!=null) count+=map.get(x);
			if(map.containsKey(xor)) map.put(xor,map.get(xor)+1);
			else map.put(xor,1);
		}
		return count;
	}
}
