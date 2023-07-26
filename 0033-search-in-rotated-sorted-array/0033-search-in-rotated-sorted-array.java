/*
Q. no. 64: Search in Rotated Sorted Array
*/
class Solution {
    public int search(int[] nums, int target) {
        int l = 0,h = nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            
            if(nums[mid]<=nums[h]){
                if(nums[mid]<=target && nums[h]>=target) l=mid+1;
                else h = mid-1;
            }
            else{
                if(nums[l]<=target && nums[mid]>=target) h = mid-1;
                else l = mid+1;
            }
        }
        return -1;
    }
}

/*
Codding Ninjas:

public class Solution {
    public static int search(int arr[], int key) {
        int l = 0,r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==key) return mid;
            
            if(arr[l]<=arr[mid]){
                if(arr[l]<=key && arr[mid]>=key) r = mid-1;
                else l = mid+1;
            }
            else {
                if(arr[mid]<=key && arr[r]>=key) l = mid+1;
                else r = mid-1;

            }
        }
        return -1;
    }
}
*/