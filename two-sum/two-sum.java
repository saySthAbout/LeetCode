class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i=0;
        
        for(int n=0; n<nums.length; n++){
           for(int y = n+1; y<=nums.length-1; y++){
               if(nums[n] + nums[y] == target){
                   result[0] = n;
                   result[1] = y;
                   return result;
               }
           }
        }
        
        return result;
    }
}