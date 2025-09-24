// Exercício com variáveis
let varA = 'A'; // B
let varB = 'B'; // C
let varC = 'C'; // A
let varTemporaria; 

varTemporaria = varA
varA = varB
varB = varC
varC = varTemporaria

// metodo moderno: 
// [varA, varB, varC] = [varB, varC, varA]

console.log(varA, varB, varC)
