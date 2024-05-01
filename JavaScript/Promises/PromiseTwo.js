const promiseTwo = new Promise(function (resolve, reject) {
    setTimeout(function () {
        let error = false;
        if (!error) {
            resolve("This is our second promise")
        } else {
            reject("Your promise rejected");
        }
    }, 1000)

});

promiseTwo.then(function () {
    console.log("Promise fullfiled");
}).catch(function (error) {
    console.log("Promise rejected");
})