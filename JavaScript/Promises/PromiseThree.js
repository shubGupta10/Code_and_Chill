const promiseThree = new Promise(function (resolve, reject) {
    setTimeout(function () {
        let error = false;
        if (!error) {
            resolve("This is our Third promise")
        } else {
            reject("Your promise rejected");
        }
    }, 5 * 1000)

});


async function ourPromise(){
    try {
        const response = await promiseThree
        console.log(response);
    } catch (error) {
        console.log("Error", error);
    }
    
}

ourPromise();