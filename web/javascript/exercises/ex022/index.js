const now = new Date();
const date = new Date(
    now.getFullYear(),
    now.getMonth(), // 0- janeiro, 11- dezembro
    now.getDate(),
    now.getHours(),
    now.getMinutes(),
    now.getSeconds(),
    now.getMilliseconds() // 0- Domingo, 6- sábado
);
console.log(date.toString)
//saída: 2024-07-03T20:29:04.195Z

const data = new Date('2024-06-20 20:20:59');
//2024-06-20T23:20:59.000Z
//toString: Thu Jun 20 2024 20:20:59 GMT-0300 (Horário Padrão de Brasília)
console.log(data.toString())


console.log(Date.now());
// 1720038544202ms
// (época unix até data atual em ms)

