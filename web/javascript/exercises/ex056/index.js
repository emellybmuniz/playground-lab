function GenericObject(arg1, arg2, property3) {
    // Inicializa as propriedades do objeto
    this.property1 = arg1; 
    this.property2 = arg2; 
    
    // Variável privada para armazenar o valor de property3
    let property3Private = property3;

    // Define a propriedade 'property3' usando um getter e um setter
    Object.defineProperty(this, 'property3', {
        enumerable: true, // A propriedade será enumerável
        configurable: true, // A propriedade pode ser reconfigurada
        get: () => {
            // Retorna o valor da variável privada quando a propriedade é acessada
            return property3Private; 
        },
        set: (value) => { // Define o que fazer quando a propriedade é atribuída
            if (typeof value !== 'number') { 
                throw new TypeError('Valor inválido'); // Lança um erro se não for número
            } 
            property3Private = value; // Atualiza a variável privada
        }
    });
}
// Cria uma nova instância do GenericObject
const instance = new GenericObject('Value1', 'value2', 25);
console.log(instance.property3); // 25