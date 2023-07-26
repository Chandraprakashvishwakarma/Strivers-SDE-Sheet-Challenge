/*
Q. no. 65: Median of Two Sorted Arrays
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null && nums2 == null){
            return 0;
        }
        
        if(nums1 == null){
            int n = nums2.length;
            return nums2[(n - 1) / 2] * 0.5 + nums2[n / 2] * 0.5;
        }
        
        if(nums2 == null){
            int n = nums1.length;
            return nums1[(n - 1) / 2] * 0.5 + nums1[n / 2] * 0.5;
        }
        
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        // choose shorter to binary search
        int n = nums1.length;
        int m = nums2.length;
        int left = 0;
        int right = n;
        
        while(left < right){
            int i = (left + right) / 2;
            int j = (n + m) / 2 - i;
            
            if(nums1[i] < nums2[j - 1]){
                left = i + 1;
            }else{
                right = i;
            }
        }
        
        int first = left;
        int second = (n + m) / 2 - left;
        
        int shorterLeft = first == 0 ? Integer.MIN_VALUE : nums1[first - 1];
        int shorterRight = first == n ? Integer.MAX_VALUE : nums1[first];
        
        int longerLeft = second == 0 ? Integer.MIN_VALUE : nums2[second - 1];
        int longerRight = second == m ? Integer.MAX_VALUE : nums2[second];
        
        if((n + m) % 2 == 1) {
            return Math.min(shorterRight, longerRight);
        }else{
            return Math.max(shorterLeft, longerLeft) * 0.5 + Math.min(shorterRight, longerRight) * 0.5;
        }
 

        
    }
}
// System.out.pritln()
/*
Codding Ninjas:

public class Solution {
    public static double median(int[] a, int[] b) {
        int n = a.length,m = b.length;
        if(n>m) return median(b,a);

        int l = 0,h = n;
        while(l<=h){
            int cut1 = (l+h)/2;
            int cut2 = (n+m+1)/2 -cut1;

            int l1 = cut1==0?Integer.MIN_VALUE:a[cut1-1];
            int l2 = cut2==0?Integer.MIN_VALUE:b[cut2-1];

            int r1 = cut1==n?Integer.MAX_VALUE:a[cut1];
            int r2 = cut2==0?Integer.MAX_VALUE:b[cut2];

            if(l1<=r2 && l2<=r1){
                if((m+n)%2 == 0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else return Math.max(l1,l2);
            }
            else if(l1>r2){
                h = cut1-1;
            }
            else l = cut1+1;
        }
    	return 0.0;
    }
}


*/