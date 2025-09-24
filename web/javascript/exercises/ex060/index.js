/*
 * Recapitulação dos conceitos de JavaScript
 */

// 1. Variáveis e Tipos de Dados
// (var, let, const, string, number, boolean, etc.)
console.log("--- Variáveis e Tipos de Dados ---");
let nome = "Emelly"; // string
const idade = 25; // number
let estudando = true; // boolean
console.log(`Nome: ${nome}, Idade: ${idade}, Estudando: ${estudando}`);


// 2. Funções
// (declaração, parâmetros, retorno)
console.log("\n--- Funções ---");
function saudar(nomePessoa) {
  return `Olá, ${nomePessoa}! Bem-vinda de volta.`;
}
console.log(saudar(nome));


// 3. Arrays
// (criação, acesso, métodos)
console.log("\n--- Arrays ---");
const topicosEstudados = ["Variáveis", "Funções", "Arrays"];
console.log("Tópicos já vistos:", topicosEstudados.join(", "));
topicosEstudados.push("Objetos");
console.log("Próximo tópico:", topicosEstudados[3]);


// Adicione aqui outros tópicos que você já viu!
// - Objetos
// - Estruturas de controle (if/else, switch)
// - Laços de repetição (for, while)
// - Manipulação do DOM

console.log("\nRecapitulação concluída! Pronto para o próximo passo.");
