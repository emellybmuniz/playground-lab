// Parâmetros
/*
function func() {
    console.log(arguments[0] +arguments[1]) // 5
    console.log(arguments[1]) // 4
}
func(1, 4)


function Soma(a= 0, b = 0, c= 0) { 
    console.log(a + b + c)
}
Soma(5,undefined,5) // única forma de fazer um parâmetro assumir o valor padrão
// saída: 10


function funcao([valor1, valor2, valor3]) {
    console.log(valor1,valor2,valor3);
}
funcao(['valor 1', 'valor 2', 'valor 3']) // Enviando valores literais ao array como parâmetro de função
// saída: valor 1 valor 2 valor 3
*/
// Operador rest `...`
const conta = (operador, acumulador, ...numeros) => {
    for(let nValor of numeros) {
        if(operador === '+') acumulador += nValor; 
        if(operador === '/') acumulador /= nValor;
        if(operador === '*') acumulador *= nValor;
    };
    console.log(acumulador) 
} // depois do argumento 'acumulador', todos os demais seram assumidos pelo parâmetro 'numeros'
conta('*', 1, 30, 40, 50, 60)
// saída: + 0 30 40 50 60