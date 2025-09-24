// Exemplo de saída esperada:
// const carro1 = criarCarro('Fusca', 'Volkswagen', 1975);
// console.log(carro1.descrever()); // "Este é um Fusca Volkswagen de 1975."
// Ex1 Resolvido
function criaCarro(marca, modelo, ano) {
    return {
        descrever() {
            return (`Este é um ${marca} ${modelo} de ${ano}`);
        },

        marcaModelo() {
            return `${marca} ${modelo}`
        }
    }
    
};

function criarConcessionaria() {
    const listaCarros = [];
    
    return {
        adicionarCarro(carro) {
            listaCarros.push(carro)
        },

        listarCarros() {
            return listaCarros.map(carro => carro.marcaModelo()).join('\n');
        }
    }
};

function criarBicicleta(marca, modelo) {
    const listaBicicleta = [];

    return {

        AdicionandoBicicletasLista() {
            listaBicicleta.push(marca, modelo)
        },

        descrever() {
            for(let value of listaBicicleta) {
                return value
            }
        },


    }
}
const carro1 = criaCarro('Fusca', 'Volkswagen', '1975')
const carro2 = criaCarro('Mustang', 'Ford', '1967')
const carro3 = criaCarro('Civic', 'Honda', '2005')
console.log('')
console.log(`Modelo ${carro2.marcaModelo()}:`)
console.log(carro2.descrever());

const concessionaria = criarConcessionaria();
concessionaria.adicionarCarro(carro1)
concessionaria.adicionarCarro(carro2)
concessionaria.adicionarCarro(carro3)
console.log('')
console.log('Concessionaria:')
console.log(concessionaria.listarCarros());

console.log('')
console.log('Bicicletas:')
const bicicleta1 = criarBicicleta('Mountain', 'Trek')
const bicicleta2 = criarBicicleta('Road', 'Giant')
const bicicleta3 = criarBicicleta('Hybrid', 'Specialized')

const lojaBicicletas = criarBicicleta();
lojaBicicletas.AdicionandoBicicletasLista(bicicleta1)
lojaBicicletas.AdicionandoBicicletasLista(bicicleta2)
lojaBicicletas.AdicionandoBicicletasLista(bicicleta3)
console.log(bicicleta1.descrever())
