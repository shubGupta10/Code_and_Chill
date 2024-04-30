function localScope(){
    let localvaribale = 10;
    console.log(localvaribale);
}

console.log(localvaribale); //this will give me an error , bcz localvarible is a localScope

localScope();