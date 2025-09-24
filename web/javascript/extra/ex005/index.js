/*
Exercício 15: Escreva um programa que verifica se uma palavra é um palíndromo.
Descrição: Um palíndromo é uma palavra que tem a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda para a direita. Nesse exercício, você irá criar uma função que recebe uma palavra como argumento e verifica se ela é um palíndromo.
*/

const isPalindromo = (palindromo) => {
    if (palindromo.split('').reverse().join('') === palindromo ) return 'É um Palíndromo'
    else return 'Não é um Palíndromo'

}

console.log(isPalindromo('Ada'))
