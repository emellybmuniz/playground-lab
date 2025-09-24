//função recursiva
function recursive(max) {
    if (max >= 10) return; 
    console.log(max);
    max ++;
    recursive(max); // A função se chama de volta
}

// função geradora
recursive(1); // retorna 1 à 10

function* generate() {
    // código...
    yield 'valor 1'
    // código...
    yield 'valor 2'
    // código...
    yield 'valor 3'
}
const g1 = generate()
console.log(g1.next()) // acessando chave do primeiro valor, saída: { value: 'valor 1', done: false }
console.log(g1.next().value) // acessando valor do segundo valor da função geradora, saída: valor 2
console.log(g1.next().value) // terceiro valor, saída: valor 3

function* generate1() {
    yield 0;
    yield 1;
    yield 2;
}

function* generate2() {
    yield* generate1(); // chamando a geradora 1
    yield 3;
    yield 4;
    yield 5;
}

const g2 = generate2()
for (let g2Display of g2) {
    console.log(g2Display)
}


const arrayName = new Array('Value1', 'Value2', 
'Value3')
const newArray = [...ArrayName] // copiando

newArray.pop() // provando que um não altera o outro retirando um elemento
console.log(arrayName)
console.log(newArray)
/* saída
[ 'Value1', 'Value2', 'Value3' ] <- arrayName
[ 'Value1', 'Value2' ] <- newArray
*/


