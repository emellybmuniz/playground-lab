// Literando e destructor

const produto  = { nome: 'Caneca', preco: 1.60, material: 'Porcelana'};
for (let [key, value] of Object.entries(produto)) {
    console.log(`${key}: ${value}`);
}

const produto2  = { nome: 'Copo', preco: 1.20, material: 'Plástico'};
Object.defineProperty(produto2, 'nome', {
    writable: false,
    configurable: false
});


// nome: Caneca
// preco: 1.6
// material: Porcelana


// Função construtora
function Car(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
}

// Adicionando um método ao prototype de Car
Car.prototype.getCarInfo = function() {
    return `${this.year} ${this.make} ${this.model}`;
};

// Criando instâncias do objeto Car
const car1 = new Car("Toyota", "Corolla", 2020);
const car2 = new Car("Honda", "Civic", 2022);

// Usando o método do prototype
console.log(car1.getCarInfo()); // "2020 Toyota Corolla"
console.log(car2.getCarInfo()); // "2022 Honda Civic"