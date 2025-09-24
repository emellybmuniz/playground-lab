// Reduce
// Sintaxe
const numbers = [23, 47, 8, 15, 72, 4, 36, 59, 91, 10]
const sumNumbers = numbers.reduce((accumulator, value, index, array) => {
    accumulator += value
    return accumulator
}, 1) // 365

console.log(sumNumbers)