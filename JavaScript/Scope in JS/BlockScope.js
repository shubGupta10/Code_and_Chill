function blockScope(){
    let blocKvariable = 20;
    console.log(blocKvariable);
}

console.log(blocKvariable); // u cant access an element outside a block
blockScope();