function outer(){
    const name = "Shubham";
    function inner(){
        console.log(name);
    }

    function innerTwo(){
        console.log(name);
    }
    inner();
}

outer();