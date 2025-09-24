/*Exercício 12: Escreva um programa que verifica a situação de um estudante de acordo com sua média final.

Neste  exercício, você vai criar uma função que recebe a média final de um estudante e verifica sua situação, se aprovado (média igual ou superior a 7), se em recuperação (média entre 5 e 6.9) ou se reprovado (média abaixo de 5) */

let calcMedia = (mediaFinal) => {
    if (mediaFinal >= 7) return 'aprovado'
    if (mediaFinal >= 5 && mediaFinal < 6.9) return 'recuperação'
    if (mediaFinal < 5) return 'reprovado'

}

console.log(calcMedia(5))