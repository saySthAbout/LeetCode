/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let str = String(x);
    let y = str.split('').reverse().join('');
            console.log(y);
    if(y === str){
        return true;
    }else{
        return false;
    }
};