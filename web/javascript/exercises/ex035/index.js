const soma = (x, y) => {
  if (typeof x !== "number" || typeof y !== "number") {
    throw new ReferenceError("x e y precisam ser números");
  } //Lançando erro caso caso os argumentos enviados não sejam números

  return x + y; // Nada após o throw ser lido é executado
};
try {
  console.log(soma(4, "5"));
} catch (error) {
  console.log(`Mensagem definida // ${error}`);
}
/* saída
Mensagem definida // ReferenceError: x e y precisam ser números
*/

try {
  // Executado se não houver erros
} catch (err) {
  // Executado se houver erros
} finally {
  // Sempre é execurado
}
