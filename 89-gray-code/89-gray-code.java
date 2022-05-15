// Backtracking + Bit manipulation solution
// Time: O(2 ^ (n + 1)), 0ms
// Space: O(n) for call stack and O(2 ^ n) for ans, 34.2mb
class Solution {
    int nums = 0;
    
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        backTrack(n, ret);
        return ret;
    }
    
    private void backTrack(int n, List<Integer> ret) {
        if (n == 0) {
            ret.add(nums);
            return;
        }
        else {
            backTrack(n - 1, ret);
            nums ^= (1 << n - 1); // Flip the bit at position n
            backTrack(n - 1, ret);
        }
    }
}