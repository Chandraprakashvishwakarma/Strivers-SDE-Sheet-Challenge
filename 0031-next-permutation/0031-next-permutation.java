/*
Q. no. 3: Next Permutation
*/
// https://www.youtube.com/watch?v=JDOXKqF60RQ&list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz&index=25

class Solution {
    public void nextPermutation(int[] nums) {
        int br=-1;
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]<nums[i+1]){
				br = i;
				break;
			}
		}
		if(br ==-1){
			reverse(nums,0,nums.length-1);
			return ;
		}
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]>nums[br]){
				swap(nums,i,br);
				break;
			}
		}
		reverse(nums,br+1,nums.length-1);
		
	}
	public static void swap(int []  nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void reverse(int []  nums,int i,int j){
		while(i<j){
			swap(nums,i,j);
			i++;j--;
		}
	}
}