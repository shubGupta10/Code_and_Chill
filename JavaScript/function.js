// Q1:- Create a function named generateMultiplier that takes a multiplier as an argument and returns a function. The returned function should take a number as an argument and multiply it by the multiplier. Use this function to create a doubler function and use it to double the number .

function multiplyGenerater(number){
    return function(x){
        return number * x;
    }
}

const result = multiplyGenerater(5);
console.log("Here is your Result:- " + result(6));

// -----------------------------------------------------

// Here is the code of :-

// 1 : Formal and Normal Function

function Table(number){
    for(let i=1; i<=10; i++){
        console.log(`${number} x ${i} = ${number * i}`);
    }
}

Table(5);

// --------------------------------------------------------

// 2:- Function Expression in Arrow functio and with function keyword

const add = (number) => {
    return (number + 2);
}

console.log("The Result is : " + add(5)); 

//with function keyword

const add2 = function(number) {
    return (number + 5);
}

console.log("The Result is : " + add2(5));

//here this add is a constant it acts as a varible in 1st and then act as a function when call it.

// -----------------------------------------------------



// 3:- Anonamous Function

const sub = (number) =>{
    return (number - 10)
}

console.log("The Result of this function is : " + sub(20));


// -----------------------------------------------------

// 4:- Arrow Function

const random = (name) =>{
    return ("Hello " + name)
}


console.log(random("Shubham")); 
