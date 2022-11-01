class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
         
        int i, j, k;
        i = j = k = 0;
        int[] nums = new int[length1 + length2];
        while (i < length1 && j < length2) {
            nums[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
         
        if (i == length1) {
            for (; k < nums.length; k++) {
                nums[k] = nums2[j++];
            }
        }
        else {
            for (; k < nums.length; k++) {
                nums[k] = nums1[i++];
            }
        }
         
        if (nums.length % 2 == 0) return (double)(nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        else return nums[nums.length / 2];              
    }
}