// Create a function named generateMultiplier that takes a multiplier as an argument and returns a function. The returned function should take a number as an argument and multiply it by the multiplier. Use this function to create a doubler function and use it to double the number .

function multiplyGenerater(number){
    return function(x){
        return number * x;
    }
}

const result = multiplyGenerater(5);
console.log("Here is your Result:- " + result(6));