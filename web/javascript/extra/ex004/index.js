/*
Exercício 14: Escreva um programa que verifica se um ano é bissexto.

Descrição: Nesse exercício, você vai criar uma função que recebe um ano e verifica se ele é bissexto. Um ano é bissexto se for divisível por 4, exceto os que são divisíveis por 100 mas não por 400
*/

const recebeAno = (ano) => {
    if (ano % 4 === 0 || (ano % 400 == 0) === 0 && ano % 100 != 0) {
        return  'É bixesto' 
    } else {
        return 'Não é bixesto'
    }
} 

console.log(recebeAno(2024))