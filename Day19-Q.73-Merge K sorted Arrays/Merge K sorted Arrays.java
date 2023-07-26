/*
Codding Ninjas:
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

class data{
    int val,arrPos,valPos;
    data(int val,int arrPos,int valPos){
        this.val=val;
        this.arrPos=arrPos;
        this.valPos=valPos;
    }
}
public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		PriorityQueue<data>p=new  PriorityQueue<>(Comparator.comparingInt(a -> a.val));
		for(int i=0;i<kArrays.size();i++){
			int val = kArrays.get(i).get(0);
			int arrPos = i;
			int valPos = 0;
			p.add(new data(val,arrPos,valPos));
		}
		ArrayList<Integer> res = new ArrayList<>();
		while(!p.isEmpty()){
			data d = p.poll();
			res.add(d.val);
			int i = d.arrPos;
			int j = d.valPos;
			if(i<kArrays.size() && j+1<kArrays.get(i).size()){
				p.add(new data(kArrays.get(i).get(j+1),i,j+1));
			}
		}
		return res;
	}
}
