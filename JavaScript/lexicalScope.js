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


function outerSec(){
    const nameSec = "Gupta"
    function innerSec(){
        const secret = "my1234"
        console.log(secret);
    }

    function nameThird(){
        console.log("Third fn");
    }

    innerSec();
    nameThird();
}

outerSec();