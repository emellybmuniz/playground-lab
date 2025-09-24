/*Exercício 16: Escreva um programa que determina o maior entre três números.*/
const maiorNumero = (num1, num2, num3) => {
    if (num1 > num2 && num1 > num3) return `${num1} é o maior número`
    if (num2 > num1 && num2 > num3) return `${num2} é o maior número`
    if (num3 > num1 && num3 > num2) return `${num3} é o maior número`
    else return 'Entrada inválida'
}
const recebeNumero = maiorNumero(8, 13, 5)
console.log(recebeNumero)

const maiorNumero2 = (num1, num2, num3) => {
    if (typeof num1 !== 'number' || typeof num2 !== 'number' || typeof num3 !== 'number') {
        return 'Todas as entradas devem ser números'
    }

    const maiorNum = Math.max(num1, num2, num3) 
    return maiorNum
}

console.log(maiorNumero2(40,3,20))

