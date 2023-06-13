/*
Q. no. 39: 3Sum

*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        int pre = 1;
        for(int i=0;i<nums.length-2;i++){
            if(pre!=nums[i]){
            int j=i+1,k=nums.length-1;
            int target = -nums[i];
            while(j<k){
                if(nums[j]+nums[k]<target) j++;
                else if(nums[j]+nums[k]>target) k--;
                else {
                    List<Integer> temp= new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    res.add(temp);
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
            }
            pre = nums[i];
        }
        return res;
    }
}


/*
Codding Ninjas:

import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int target)  {
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i=0;i<n-2;i++){
			if(i>0 && arr[i]==arr[i-1]) continue;
			int j=i+1,k=n-1;
			while(j<k){
				if(arr[i]+arr[j]+arr[k] == target) {
					ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
					// temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
					res.add(temp);
					j++;k--;
					while(j<k && arr[j]==arr[j-1]) j++;
					while(j<k && arr[k]==arr[k+1]) k--;
				}
				else if(arr[i]+arr[j]+arr[k] < target) j++;
				else k--;
			}
		}
		return res;
	}
}
*/
