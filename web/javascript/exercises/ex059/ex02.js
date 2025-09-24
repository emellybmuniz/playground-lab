// Controle de estoque
let caneca = {
    material: 'plástico',
    _estoque: 13 // "_" variável privada.
}

Object.defineProperty(caneca, 'estoque', {
    enumerable: true,
    configurable: true,
    get: function() {
        return this._estoque; 
    },
    set: function(value) {
        // Verifica se o valor é um número
        if (typeof value !== 'number') return;
        this._estoque = value; // Definindo a propriedade privada.
    }
});

console.log(caneca);
caneca.estoque = '20'; 
console.log(caneca.estoque); //13









