// Copiando um objeto 

/*
const produto = { nome: 'Caneca', preco: 1.60};
const produto2 = produto // agora o produto2 está referenciando o mesmo local que o produto
produto2.nome = 'Xícara'  // alterando a chave de um altera a do outro
console.log(produto)
console.log(produto2)
saída: 
{ nome: 'Xícara', preco: 1.6 }
{ nome: 'Xícara', preco: 1.6 }
*/

// Spreed
/*
const produto  = { nome: 'Caneca', preco: 1.60};
const produto2 = { 
    ...produto,
    temEstoque: false
} 
produto2.nome = 'Xícara' // alterando a chave nome
console.log(produto) //{ nome: 'Caneca', preco: 1.6 }
console.log(produto2)// { nome: 'Xícara', preco: 1.6 }

*/

// Copiando objetos com o assign
/*
const produto  = { nome: 'Caneca', preco: 1.60};
const produto2 = Object.assign({}, produto,  {chave: 'Opcional'})
console.log(produto2) // { nome: 'Caneca', preco: 1.6, chave: 'Opcional' }
*/

// Pegando Propriedades Específicas

const produto  = { nome: 'Caneca', preco: 1.60, material: 'Porcelana'};
const produto2 = {nome: produto.nome, material: produto.material}
console.log(produto2)  // { nome: 'Caneca', material: 'Porcelana' }

console.log(Object.entries(produto))
/*
{ nome: 'Caneca', material: 'Porcelana' }
[ [ 'nome', 'Caneca' ], [ 'preco', 1.6 ], [ 'material', 'Porcelana' ] ]
*/
console.log(Object.values(produto))
/*
{ nome: 'Caneca', material: 'Porcelana' }
[ 'Caneca', 1.6, 'Porcelana' ]
*/


