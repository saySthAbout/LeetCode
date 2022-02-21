class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num == 1) {
                count ++;
                break;
            }
            if(num%2 == 0){
                count ++;
            }
            else {
                count+=2;
            }
            num/=2;
        }
        return count;
    }
}