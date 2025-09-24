// // tentando fazer uma Closure function
// function receboUmParametro(m) {
//     return function() {
//         console.log(`sei o parâmetro do meu vizinho ${m}`)
//     }
// }
// const exibindoMensagem = receboUmParametro('(sei mesmo)')
// exibindoMensagem()
// // sei o parâmetro do meu vizinho (sei mesmo)
 
// Exemplo de escopo léxico 
const msg = 'Olá mundo!' // Escopo Global

function returnFunction () {
    const msg2 = 'Bom dia'
    console.log(msg) 
    return function() {
        return msg, msg2  // retorna msg que esta no escopo léxico
    }
}
const displayMsg = returnFunction() 
console.dir(displayMsg) // [Function (anonymous)]
console.dir(displayMsg())  // executa 
/* Saída:
Olá mundo!
[Function (anonymous)]
'Bom dia'
*/



