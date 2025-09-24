let texto = "Um \"texto\"" //usando aspas duplas em uma string delimitada por aspas duplas

console.log(texto)
let mensagem = 'Um rato roeu a roupa do rei de roma';

console.log(mensagem.replace('Um', 'Outro'))
console.log(mensagem.indexOf('o', 2))
/* let texto1 = "texto";
console.log(texto.length); */

/* console.log(texto.charAt(4)) */

console.log(mensagem.concat('', ' em', '', ' um'))

console.log(mensagem.search(/[a-z]/))

// Slice(2, 5) (fatiar string)
// Slice(-5, -1)
console.log(mensagem.slice(-5))

console.log(mensagem.substring(0, 8)); // "Um rato

console.log(texto.toUpperCase()); // "JAVASCRIPT"

texto.toLowerCase(); // "javascript"