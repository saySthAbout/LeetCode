/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    let num = 1;
    let result = new Array();
    
    while(num <= n){
        if(num % 3 === 0 && num % 5 === 0){
            result.push("FizzBuzz");
        }else if(num % 3 === 0){
            result.push("Fizz");
        }else if(num % 5 === 0){
            result.push("Buzz");
        }else{
            result.push(String(num));
        }
        num++;
        console.log(result);
    }
    return result;
};