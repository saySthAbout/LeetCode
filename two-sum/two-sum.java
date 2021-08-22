class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        maybe creating a hashmap which contains element as key and indices as value can solve it?        
        */
        
        HashMap <Integer, Integer> map = new HashMap<>();
        // for storing indices
        int[] StoreIndex = new int[2];
        
        // inserting it on HashMap
        for (int i=0; i < nums.length; i++)
        {
            if (map.containsKey(target - nums[i]))
            {
                StoreIndex[1] = i;
                StoreIndex[0] = map.get(target - nums[i]);
                return StoreIndex;
            }
            map.put(nums[i], i);
            
        }
        return nums;
    }
}