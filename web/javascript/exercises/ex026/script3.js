// Atribuição via desestruturaçao

const person = {
    lastName: 'Pereira',
    age: '18',
    address: {
        street: 'São Francisco de Assis',
        number: 9
    }
};
const {address: {street, number}, address} = person;
console.log(street, number)
console.log(address)
//saída: São Francisco de Assis 9
//saída: { street: 'São Francisco de Assis', number: 9 }




/* saída:
{
  name: 'Emelly Beatriz',
  lastName: 'Pereira',
  age: '18',
  address: { street: 'São Francisco de Assis', number: 9 }
}
*/