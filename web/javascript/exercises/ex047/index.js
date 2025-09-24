// Concatenando arrays
//const a1 = [1, 2, 3];
//const a2 = [4, 5, 6];
//const a3 = [...a1, ...a2] // ...rest -> ... spread
//console.log(a3) // [ 1, 2, 3, 4, 5, 6 ]

// Filter, map, reduce
const numeros = [1, 10, 30, 40, 1, 5, 80, 30, 5, 60]
const numsFiltrados = numeros.filter(valor => valor > 10);
console.log(numsFiltrados)