sayHello()
function sayHello() {
    console.log("Hello")
}
// Saída: Hello

const souUmDado = function() {
    console.log('Sou um dado')
}

function exeFunction(func) {
    func();
}
exeFunction(souUmDado) // saída: Sou um dado

const arrowFunction = () => {
    console.log('Sou uma arrow function')
} 
arrowFunction() // saída: Sou uma arrow function

const obj = {
    say() {
        console.log('Eu sou um objeto')
    }
}

obj.say() // saída: Eu sou um objeto

function executarAposDelay(callback, delay) {
    setTimeout(callback, delay);
  }
  
  function saudacao() {
    console.log("Olá, mundo!");
  }
  
  executarAposDelay(saudacao, 2000); // "Olá, mundo!" será exibido após 2 segundos