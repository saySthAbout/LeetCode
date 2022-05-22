// Recursion + Bit manipulation solution
// Time: O(2 ^ n), 1ms
// Space: O(n) for call stack, O(2 ^ n) for ans, 34.4mb
class Solution {
    public List<Integer> grayCode(int n) {
        // Base case
        if(n == 0) {
            List<Integer> ans = new ArrayList<>();
            ans.add(0);
            return ans;
        }
        
        // grayCode(n) = grayCode(n - 1) + (1 << (n - 1) + reversed(grayCode(n - 1) ))
        List<Integer> ans = grayCode(n - 1);
        int base = 1 << (n - 1); // 01 << 2 -> 0100
        int size = ans.size();
        for(int i = size - 1; i >= 0; i--) {
            ans.add(base + ans.get(i));  // 1 + the mirror of the grayCode(n - 1)0
        }
        
        return ans;
    }
}