// Retorne as pessoas que tem o nome com 5 letra ou mais
// Retorne as pessoas com mais de 50 anos
// Retorne as pesssoas cujo nome termina com a

const persons = [
    { nome: 'Emelly', idade: 18 },
    { nome: 'Anderson', idade: 35 },
    { nome: 'Luana', idade: 22 },
    { nome: 'Carlos', idade: 55 },
    { nome: 'Eva', idade: 60 },
    { nome: 'Mariana', idade: 45 },
    { nome: 'João', idade: 28 },
    { nome: 'Anna', idade: 60 },
    { nome: 'Fernando', idade: 52 },
    { nome: 'Clara', idade: 30 },
    { nome: 'Isadora', idade: 40 },
    { nome: 'Roberto', idade: 70 },
    { nome: 'Gabriela', idade: 33 },
    { nome: 'Rosa', idade: 55 },
    { nome: 'Felipe', idade: 25 },
    { nome: 'Sofia', idade: 45 },
    { nome: 'Aline', idade: 20 }
];

const namesFilter = persons.filter(value => value.nome.length >= 5)
const ageFilter = persons.filter(value => value.idade > 50)
const namesEndA = persons.filter(value => value.nome.endsWith('a'))

console.log(namesFilter), console.log(ageFilter), console.log(namesEndA)

/* saída:
[
  { nome: 'Emelly', idade: 18 },
  { nome: 'Anderson', idade: 35 },
  { nome: 'Luana', idade: 22 },
  { nome: 'Carlos', idade: 55 },
  { nome: 'Mariana', idade: 45 },
  { nome: 'Fernando', idade: 52 },
  { nome: 'Clara', idade: 30 },
  { nome: 'Isadora', idade: 40 },
  { nome: 'Roberto', idade: 70 },
  { nome: 'Gabriela', idade: 33 },
  { nome: 'Felipe', idade: 25 },
  { nome: 'Sofia', idade: 45 },
  { nome: 'Aline', idade: 20 }
]
[
  { nome: 'Carlos', idade: 55 },
  { nome: 'Eva', idade: 60 },
  { nome: 'Anna', idade: 60 },
  { nome: 'Fernando', idade: 52 },
  { nome: 'Roberto', idade: 70 },
  { nome: 'Rosa', idade: 55 }
]
[
  { nome: 'Luana', idade: 22 },
  { nome: 'Eva', idade: 60 },
  { nome: 'Mariana', idade: 45 },
  { nome: 'Anna', idade: 60 },
  { nome: 'Clara', idade: 30 },
  { nome: 'Isadora', idade: 40 },
  { nome: 'Gabriela', idade: 33 },
  { nome: 'Rosa', idade: 55 },
  { nome: 'Sofia', idade: 45 }
]
*/