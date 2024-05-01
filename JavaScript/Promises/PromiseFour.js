async function getData(){
    try {
        const response = await fetch('https://api.github.com/users/shubGupta10');
        const data = await response.json()
        console.log(data);
    } catch (error) {
        console.log("Error: Something went wrong", error);
    }
 
}

getData();