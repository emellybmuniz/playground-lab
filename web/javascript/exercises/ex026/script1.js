// índices        0  1   2   3   4   5   6   7   8
const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90]
//acessando os primeiros valores
const [firstNumber, secondNumber, ...rest] = numbers;
console.log(firstNumber, secondNumber)
// saída: 10 20

// exibindo o resto
console.log(rest)
/* saída: 
[
  30, 40, 50, 60,
  70, 80, 90
]
*/

// pulando elementos
const numbers1 = [10, 20, 30]
const [,,thirdNumber] = numbers1
console.log(thirdNumber)
//saída: 30