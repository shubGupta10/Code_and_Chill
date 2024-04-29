function outer(){
    const name = "Shubham"
    function inner(){
        console.log(name);
    }
    return inner; 
}

const newFn = outer();
newFn();


// ye jo return inner hai wo pura lexical scope ko return kr rha , means inner ko to kr rha saath me outer ko bhi.