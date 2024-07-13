const numberVar = 12;
const stringVar = "Shubham";
const booleanVar = true;
let undefinedVar;
const nullVar =  null;
const arr = ["Moto", "Vivo", "Samsung", "Realme"];
const obj = {
    name: "Moto",
    price: "20k",
    isAndroid: 'Yes'
}


const logValueAndType = (variable, name) => {
    console.log(`${name}:`);
    console.log(`Value: ${variable}`);
    console.log(`Type: ${typeof variable}`);
    console.log("-----")
}

logValueAndType(numberVar, "Number");
logValueAndType(stringVar, "String");
logValueAndType(booleanVar, "Boolean");
logValueAndType(undefinedVar, "undefined");
logValueAndType(nullVar, "Null");
logValueAndType(arr, "Array");
logValueAndType(obj, "Object");

