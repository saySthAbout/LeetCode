class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 동
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            // 남
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // 서
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // 북
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return result;
    }
}