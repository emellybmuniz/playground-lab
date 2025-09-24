// Factory function (Função fábrica)

function imcPessoa(nome, sobrenome, altura, peso) {
  return {
    nome,
    sobrenome,
    altura,
    peso,
    exibirNome() {
      // método que exibe nome
      return `${this.nome} ${this.sobrenome}`;
    },

    get imc() {
      // método que calcula o IMC da pessoa
      const indice = this.peso / this.altura ** 2;
      return indice.toFixed(2);
    },
  };
}

let pessoa = imcPessoa("João", "Dias", 1.5, 70);
let pessoa2 = imcPessoa("Lídia", "Dias", 1.6, 60);

console.log(pessoa2.nome, pessoa2.sobrenome);
console.log(pessoa2.imc);
