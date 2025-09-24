// Cadastro de pessoas

function cadastraPessoa(nome, sobrenome, idade) {
  return {
    nome,
    sobrenome,
    idade,

    fala() {
      console.log(`Programa finalizado!`);
    },
  };
}

pessoa1 = cadastraPessoa("Emelly", "Beatriz", "18");
pessoa2 = cadastraPessoa("Carolina", "Amália", "41");
pessoa3 = cadastraPessoa("Vitor", "Souza", "18");
pessoa4 = cadastraPessoa("Camilla", "Borba", "18");
pessoa5 = cadastraPessoa("Luiz", "Miranda", "25");

console.log(pessoa1.nome, pessoa1.sobrenome);
console.log(pessoa5.nome, pessoa5.sobrenome);
pessoa2.fala();
/* saída:
    Emelly Beatriz
    Luiz Miranda
    Programa finalizado!
*/
