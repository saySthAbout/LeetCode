import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int i, j, k;
        i = j = k = 0;
        
        int[] nums = new int[length1 + length2];
        
        while(i < length1 && j < length2){
            nums[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        
        if(i == length1){
            while(j < length2){
                nums[k++] = nums2[j++];
            }
        }else{
            while(i < length1){
                nums[k++] = nums1[i++];
            }
        }
        
        if(nums.length % 2 == 0){
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }else{
            return (double) nums[nums.length / 2];
        }
    }
}