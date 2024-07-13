//----------------Difference between let and const---------------------------

// using let
// -> Let allows reassignment of values
let letVariable = 10;
console.log("Its initial Value", letVariable);

letVariable = 20;
console.log("After assignment", letVariable);


//using const
// -> Const does not allow reassignment of values
const constVariable = 30;
console.log("Const initial value ", constVariable);

constVariable(40);
console.log("Const new Value", constVariable)

// error : constVariable does not allow reassignment of values.
