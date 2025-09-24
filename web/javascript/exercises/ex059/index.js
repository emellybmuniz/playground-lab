
// Classe base para produtos gerais em um e-commerce (Abstração)
function Produto(nome, preco) {
    this.nome = nome; // Nome do produto
    this.preco = preco; // Preço do produto
}

// Método para aumentar o preço do produto 
Produto.prototype.increase = function(percentual) {
    this.preco += this.preco * (percentual / 100);
};

// Método para aplicar desconto
Produto.prototype.discount = function(percentual) {
    this.preco -= this.preco * (percentual / 100);
};

// Classe derivada para camisetas, com atributos adicionais (Especificação)
function Camiseta(nome, preco, cor, tamanho, modelo) {
    Produto.call(this, nome, preco); // Chamada do construtor da classe base Produto
    this.cor = cor; // Atributos adicionais
    this.tamanho = tamanho; 
    this.modelo = modelo; 
}

// Configurando a herança de Produto para Camiseta
Camiseta.prototype = Object.create(Produto.prototype); //Camiseta recebe objeto com proto de produto 
Camiseta.prototype.constructor = Camiseta; // Apontando o construtor para a classe correta

// Criando outro Produto
function Caneca(nome, preco, material) {
    Produto.call(this, nome, preco)
    this.material = material;
}

Caneca.prototype = Object.create(Produto.prototype)
Caneca.prototype.constructor = Caneca;

// Criando produtos
const camiseta = new Camiseta('Regata', 75.0, 'Preta', 'M', 'Slim Fit');
const caneca = new Caneca('Love', 15.50, 'ceramica')

// Testando os métodos herdados a camiseta
console.log(`Preço original: R$ ${camiseta.preco.toFixed(2)}`);
camiseta.increase(10); // Aumenta o preço em 10%
console.log(`Preço após aumento: R$ ${camiseta.preco.toFixed(2)}`);
camiseta.discount(20); // Aplica desconto de 20%
console.log(`Preço após desconto: R$ ${camiseta.preco.toFixed(2)}`);

// Verificando os atributos da camiseta
console.log(camiseta);
console.log(caneca);


/* Output da caneca

Caneca { nome: 'Love', preco: 5.5, material: 'ceramica' }

*/


