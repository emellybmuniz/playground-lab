const persons = [
    {nome: 'Luiz', idade: 62},
    {nome: 'Maria', idade: 43},
    {nome: 'Eduardo', idade: 55},
    {nome: 'Letícia', idade: 10},
    {nome: 'Rosana', idade: 64},
    {nome: 'Wallace', idade: 63},
] // retornar pessoa mais velha

const OldPerson = persons.reduce((acumulator, value) => {
    return (acumulator.idade > value.idade) ? acumulator : value
}) // { nome: 'Rosana', idade: 64 }
console.log(OldPerson)



