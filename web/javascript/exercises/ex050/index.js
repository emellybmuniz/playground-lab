const persons = [
    {nome: 'Luiz', idade: 62},
    {nome: 'Maria', idade: 23},
    {nome: 'Eduardo', idade: 55},
    {nome: 'Letícia', idade: 19},
    {nome: 'Rosana', idade: 32},
    {nome: 'Wallace', idade: 47},
    {nome: 'Beatriz', idade: 20}
]

const filterNamePerson = persons.map(value => ({Nome: value.nome}))
const filterAgePerson = persons.map(value => ({ Idade: value.idade}))
const addIdObject = persons.map((value, index) => {
    const newObj = {...value}; // Criando novo Objeto
    newObj.id = index + 1;
    return newObj; // Retornando uma cópia sem alterar o objeto original
});

console.log(persons)
console.log(addIdObject)

/* Saída:
[
  { nome: 'Luiz', idade: 62 },
  { nome: 'Maria', idade: 23 },
  { nome: 'Eduardo', idade: 55 },
  { nome: 'Letícia', idade: 19 },
  { nome: 'Rosana', idade: 32 },
  { nome: 'Wallace', idade: 47 },
  { nome: 'Beatriz', idade: 20 }
]
[
  { nome: 'Luiz', idade: 62, id: 1 },
  { nome: 'Maria', idade: 23, id: 2 },
  { nome: 'Eduardo', idade: 55, id: 3 },
  { nome: 'Letícia', idade: 19, id: 4 },
  { nome: 'Rosana', idade: 32, id: 5 },
  { nome: 'Wallace', idade: 47, id: 6 },
  { nome: 'Beatriz', idade: 20, id: 7 }
]
*/