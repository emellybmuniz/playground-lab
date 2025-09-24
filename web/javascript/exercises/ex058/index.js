const objectA = {
    keyA: 'A'
// __proto__: Object.prototype
};

// Object.prototype é o último proto da cadeia

const objectB = {
    keyB: 'B'
// __proto__: ObjectA.prototype
};

Object.setPrototypeOf(objectB, objectA); 
// definindo _proto_ do objetcB para objectA
// output: A

console.log(objectB.keyA)
// __proto A acessível ao B