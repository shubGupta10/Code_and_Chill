const firstNumber = 20;
const secondNumber = 10;


const OperatorsArr  = ["+", "-", "*", "/", "%" ];

OperatorsArr.forEach(operator => {
    let result;
    switch (operator){
        case "+":
            result = firstNumber + secondNumber;
            break;

        case "-":
            result = firstNumber - secondNumber;
            break;
        case "*":
            result = firstNumber * secondNumber;
            break;
        case "/":
            result = firstNumber / secondNumber;
            break;
        case "%":
            result = firstNumber % secondNumber;
            break;
    }

    console.log(`${firstNumber} ${operator} ${secondNumber} = ${result}`)
})
