/* Exercício 19: Escreva um programa que verifica se um número está dentro de um determinado intervalo. 

Descrição:  Neste exercício, você vai criar uma função que recebe três números como argumentos: um número a ser verificado, o limite inferior e o limite superior do intervalo. A função deve imprimir se o número está dentro do intervalo ou não.
*/

const validadorIntervalo = (num1, num2, num3) => {
    if (num2 <= num3 && num2 >= num1) return `${num2} está dentro do intervalo de ${num1} à ${num3}`
    else return `${num2} não está dentro do intervalo`
    
}

const nums = validadorIntervalo(1,-5,10)
console.log(nums)

