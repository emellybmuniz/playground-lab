// Ex 1
// Crie um protótipo para o tipo Array que adicione um método chamado last(). Esse método deve retornar o último elemento do array. Caso o array esteja vazio, ele deve retornar undefined.
Array.prototype.last = function() {
    return (this.length > 0) ? this[this.length - 1] : 'Array Vazio' ;
};

const arrayA = [1, 2, 3, 4, 5];
console.log(arrayA.last());

// Ex 2
// Crie um protótipo para o tipo String chamado reverse() que inverta o texto da string.
String.prototype.reverse = function() {
    return this.split('').reverse().join('');
};

console.log('Banana'.reverse())

// Ex 3
// Implemente um protótipo para o tipo Number chamado isPrime(). Esse método deve retornar true se o número for primo, e false caso contrário. Por exemplo:

Number.prototype.isPrime = function() {
    return (this > 2 && this % Number > this === 1) ? "É Primo" : 'Não é Primo'
}

console.log(3 .isPrime())

