class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        if(nums.length == 2){
            answer[0] = 0;
            answer[1] = 1;
        }else{
            for(int i=0; i<nums.length-1; i++){
                for(int y=i+1;y<nums.length;y++){
                    if(nums[i] + nums[y] == target){
                        answer[0] = i;
                        answer[1] = y;
                        return answer;
                    }
                }
            }            
        }
        return answer;
    }
}