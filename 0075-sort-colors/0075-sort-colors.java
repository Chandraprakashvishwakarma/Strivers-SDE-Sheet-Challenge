/**

Q. no. 5: Sort 0 1 2


Dutch national flag algorithm
    take three pointer -> 
    from mid to high-1 everything will be unsorted , 0 to low-1 0's are sorted , low to mid-1 1's are sorted , high to n-1 2's are sorted 
 */
class Solution {
    public void sortColors(int[] arr) {
        int low =0,mid = 0,high = arr.length-1;
        while(low<=mid && mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void swap(int [] nums,int a,int b){
        int temp =nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}