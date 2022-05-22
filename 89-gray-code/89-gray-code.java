class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> grayCode = new ArrayList<>();
        grayCode.add(0);

        if (n == 0)
            return grayCode;

        for (int i = 0; i < n; i++) {
            int length = grayCode.size();
            for (int j = length - 1; j >= 0; j--) {
                grayCode.add(grayCode.get(j) | (1 << i) );
            }
        }

        return grayCode;
    }
}