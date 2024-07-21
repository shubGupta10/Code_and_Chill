//Task 1

const dayNumber = 2;

switch (dayNumber){
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturday");
        break;
    case 7:
        console.log("Sunday");
        break;
    default:
        console.log("Invalid day");
}


//Task 2

const marks = 95;

switch (true){
    case (marks >= 90):
        console.log("Grade A");
        break;
    case (marks >= 70):
        console.log("Grade B");
        break;
    case (marks >= 60):
        console.log("Grade C");
        break;
    case (marks >= 50):
        console.log("Grade D");
        break;
    case (marks >= 40):
        console.log("Grade E");
        break;
    default:
        console.log("Invalid Score")
}