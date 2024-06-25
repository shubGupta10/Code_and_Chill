document.addEventListener('DOMContentLoaded', function() {
    const yearsSelect = document.getElementById('yearsSelect');

    // Generate options for years from 1900 to 2024
    for (let year = 1900; year <= 2024; year++) {
        const option = document.createElement('option');
        option.value = year;
        option.textContent = year;
        yearsSelect.appendChild(option);
    }

    // Attach event listener to the Calculate button
    const calculateButton = document.getElementById('calculateButton');
    calculateButton.addEventListener('click', calculateMortgage);
});

function calculateMortgage() {
    // Retrieve input values
    let loanAmount = parseFloat(document.getElementById('LoanAmount').value);
    let annualRate = parseFloat(document.getElementById('annualRate').value);
    let loanTerms = parseInt(document.getElementById('loanTerms').value);

    // Calculate monthly interest rate and number of payments
    const monthlyInterestRate = annualRate / 12;
    const numberOfPayments = loanTerms * 12;

    // Calculate monthly payment
    const monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

    // Display the result
    document.getElementById('result').textContent = `Monthly Payment: $${monthlyPayment.toFixed(2)}`;
}
