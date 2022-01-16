class Solution {
    // time complexity : while loop -> O(n)
    // space complexity : the worst case creating a new array -> O(n)
    public int[] plusOne(int[] digits){
        int carry = 1;
        int index = digits.length - 1;
        while(index >= 0 && carry > 0){
            digits[index] = (digits[index] + 1) % 10;
            carry = (digits[index] == 0)? 1 : 0; index--;
        } if(carry > 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        } return digits;
    }
}