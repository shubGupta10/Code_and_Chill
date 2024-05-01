fetch('https://api.github.com/users/shubGupta10')
.then((response) => {
    return response.json();
})
.then((data) => {
    console.log(data);
})
.catch((error) => {
    console.log("Caught error", error);
})