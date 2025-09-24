/* 
Cálculo de IMC
'Nome' 'sobrenome' tem 'let' anos, pesa 84 kg 
tem 1.8 de altura e seu IMC é de 'let'
Luiz Otávio nasceu em 'let'
*/
const nome = 'Maria Clara';
const sobrenome = 'Oliveira';
const alturaEmM = 1.8;
let idade = 30;
let peso = 84;
let iMC; // peso / (altura * 2)
let anoNascimento; // idade - ano
let anoAtual = 2024; 
iMC = peso / (alturaEmM * alturaEmM)
anoNascimento = anoAtual - idade
console.log(`${nome} ${sobrenome} tem ${idade} anos, pesa ${peso} kg, tem ${alturaEmM} m e seu IMC é de ${iMC.toFixed(2)}`);
console.log(`${nome} ${sobrenome} nasceu no ano de ${anoNascimento}`)

