/*
Exercício 20: Escreva um programa que imprime uma classificação baseada na nota de um aluno.
A nota máxima é 100, sendo 0 a 59(F), 60 a 69(D), 70 a 79(C), 80 a 89(B) e 90 a 100(A)
*/

const notaAluno = (nota) => {
    if (nota > 100 || nota < 0) return `nota inválida`
    if (nota < 100 && nota >= 80) return `nota: ${nota}, classificação: B`
    if (nota < 80 && nota >= 70) return `nota: ${nota}, classificação: C`
    if (nota < 70 && nota >= 60) return `nota: ${nota}, classificação: D`
    if (nota < 60 && nota >= 0) return `nota: ${nota}, classificação: F`
    if (nota === 100) return `nota: ${nota}, classificação: A`

}
const nota = notaAluno(200)

console.log(nota)