const addtaskbtn = document.getElementById('addtextbtn');
const listresultDiv = document.getElementById('listAllItems');

addtaskbtn.addEventListener('click', () => {
    const inputtext = document.getElementById('addtext').value;
    const newElem = document.createElement('li');
    const newBtn = document.createElement('button');
    newElem.textContent = inputtext;
    newBtn.textContent = "Delete";
    newBtn.classList.add("Delete-btn");
    newElem.append(newBtn);
    listresultDiv.append(newElem);

    newBtn.addEventListener('click', () => {
        listresultDiv.removeChild(newElem);
    });

    document.getElementById('addtext').value = "";
});
