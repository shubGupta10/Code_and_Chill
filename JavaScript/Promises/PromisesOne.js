const promiseOne = new Promise(function(resolve, reject){
    setTimeout(function(){
        console.log("This is our first Promise");
        resolve();
    }, 1000)
});

promiseOne.then(function(){
    console.log("Promise Fullfilled");
}).catch(function(error){
    console.log("Sorry promise not fullfiled, caught an error");
})


