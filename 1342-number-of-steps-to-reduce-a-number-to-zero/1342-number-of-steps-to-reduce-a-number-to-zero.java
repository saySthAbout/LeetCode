class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while(num > 0){
            if(num % 2 == 0){ // 짝수인 경우
                num = num / 2;
            }else{ // 홀수인 경우
                num = num - 1;
            }
            step++;
        }
        return step;
        // 짝수인지 홀수인지 판단
        // 짝수라면 나누기 2
        // 홀수라면 -1
        // 0 과 같으면 반환
    }
}