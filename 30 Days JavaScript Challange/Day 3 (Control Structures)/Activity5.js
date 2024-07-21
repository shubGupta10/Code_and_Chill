const year = 366;

if((year % 4 === 0 &&  year % 100 !== 0) || (year % 400 === 0)){
    console.log("Year is leap year");
}else{
    console.log("year is not leap year");
}
