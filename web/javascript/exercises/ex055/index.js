// Notação de conchete

const objeto = {
    chave1: 'valor1',
    chave2: 'valor2',
    chave3: 'valor3'
};

// Acesso aos valores utilizando colchetes
console.log(objeto['chave1']); // Saída: valor1
console.log(objeto['chave2']); // Saída: valor2
console.log(objeto['chave3']); // Saída: valor3

// New Operator

const objeto2 = new Object();
objeto2.key = 'valor 1';
objeto2.key2 = 'valor 2';

console.log(objeto2['key']) // valor 1
console.log(objeto2) // { key: 'valor 1', key2: 'valor 2' }

// delete
delete objeto2.key2
console.log(objeto2) // { key: 'valor 1' }

Object.freeze(this) // Congela objeto (impossivel deletar ou modificar)

// defineProperty - defineProperties

function Produto(nome, preco, estoque) {
    this.nome = nome;
    this.preco = preco;

    Object.defineProperty(this, 'estoque', {
        enumerable: true, // mostra a chave
        writable: true, // pode alterar valor
        configurable: true, // pode reconfigurar a propriedade?
        value: estoque // valor
    }) 
}

const P1 = new Produto('Camiseta', 20, 4)
P1.estoque = 10;
console.log(P1)
///////


function GenericObject(arg1, arg2, arg3) {
    this.property1 = arg1; 
    this.property2 = arg2; 

    Object.defineProperties(this, {
        property3: {
            enumerable: true,
            writable: true,
            configurable: true,
            value: arg3
        },
        property4: {
            enumerable: true,
            writable: false,
            configurable: false,
            value: 'FixedValue'
        }
    }); 
}

const instance = new GenericObject('Value1', 100, 5);
instance.property3 = 10;
instance.property4 = 'NewValue';
console.log(instance.property3);