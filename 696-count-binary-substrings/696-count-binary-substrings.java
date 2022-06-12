class Solution {
    public int countBinarySubstrings(String s) {
        int all = 0;
        int nowCount = 0;
        int prevCount = 0;
        char prev = ' ';
        
        for (char c: s.toCharArray()) {
            if (prev == c) {
                nowCount++;
            } else {
                prev = c;

                all += Math.min(prevCount, nowCount);
                prevCount = nowCount;
                nowCount = 1;
            }
        }
        
        all += Math.min(prevCount, nowCount);
        return all;
    }
}