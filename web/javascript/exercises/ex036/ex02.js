const showDate=() => {
  let date = new Date();
  return date.toLocaleTimeString("pt-BR", {
    hour12: false,
  });
}; // func que exibe horário atual

// Definindo tempo d/execução do showDate()
const timer = setInterval(function() {
   console.log(showDate());
}, 1000); // 1s de intervalo

// Definindo fim do Intervalo
setTimeout(function() {
    clearInterval(timer);
}, 10000); // 10 seg
/* saída:
12:25:54 
12:25:55
12:25:56
12:25:57
12:25:58
12:25:59
12:26:00
12:26:01
12:26:02
*/

const msg = () => {
    console.log(':)');
};

setTimeout(() => {
    console.log('Esta mensagem será exibida após 3 segundos');
    msg();
}, 3000);
/* saída
Esta mensagem será exibida após 3 segundos
:)
*/
