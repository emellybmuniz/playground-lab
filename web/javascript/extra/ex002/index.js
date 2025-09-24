// Exercício 9: Escreva um programa que recebe um número e verifica se ele é positivo, negativo ou zero.



let typeOf = (number) => {
    if (number === 0) return 'O valor é zero'

    if (number>=1) return 'O valor é positivo'

    if (number < 0) return 'O valor é negativo'

}


console.log(typeOf('a'))