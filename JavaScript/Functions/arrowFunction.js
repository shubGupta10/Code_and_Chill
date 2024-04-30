//Here we are going to practice some ways of using the Arrow function


//1: Normal Arrow function
const add = () =>{
    return 2 + 2;
}

console.log(add());


console.log("----------------------------------------------------")

//2: Arrow function with Parameters

const addNew = (number) => {
    return number + 5;
}

console.log(addNew(5));


console.log("----------------------------------------------------")

//3: Arrow function without using 'return'
const multiply = (a,b) => (a * b);

console.log(multiply(4,6));


console.log("----------------------------------------------------")

//4: Arrow function using in Arrays
//basically we created square of the array we have.
const number = [1,2,3,4,5];

const SquareNumber = number.map(num => (num ** 2));

console.log("Here is the Original Number:- ", number)
console.log("Here is the Modified version of the Number:- ", SquareNumber);

console.log("----------------------------------------------------")

//5: Using ternary Operator with Arrow Function

const Result = (a,b) => (a>b ? "A is bigger than B" : " A is not bigger than B")


console.log(Result(4,6));
console.log(Result(10,5));

