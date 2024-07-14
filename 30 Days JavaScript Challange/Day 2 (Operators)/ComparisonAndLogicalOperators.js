const firstNumber = 20;
const secondNumber = 30;

// Compare if one number is greater than the other
if(firstNumber > secondNumber){
    console.log("First Number is greater than Second Number");
} else if(secondNumber > firstNumber){
    console.log("Second Number is greater than First Number");
}

// Check if the numbers are equal
if(firstNumber === secondNumber){
    console.log("First and Second numbers are equal");
} else {
    console.log("First and Second numbers are not equal");
}

// See if one number is less than or equal to the other
if(firstNumber <= secondNumber){
    console.log("First Number is less than or equal to Second Number");
}

// Combine conditions
if(firstNumber > 10 && firstNumber < 30){
    console.log("First number is between 10 and 30");
}

// Using logical OR
if(firstNumber === 20 || secondNumber === 20){
    console.log("One of the numbers is 20");
}