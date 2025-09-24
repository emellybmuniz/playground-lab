// Exibindo horário em tela
const date = new Date()
const convertNumberToString = ['domingo', 'segunda-feira', 'terça-feira', 'quarta-feira', 'quinta-feira', 'sexta-feira', 'sábado'];
const convertMonthToString = ['janeiro', 'fevereiro', 'março', 'abril', 'maio', 'junho', 'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro']
let getDate = document.querySelector('.getDate')

const displayDate = {
    dayString: convertNumberToString[date.getDay()],
    dayNumber: date.getDay(),
    month: date.getMonth() + 1,
    monthString: convertMonthToString[date.getMonth()],
    year: date.getFullYear(),
    hours: date.getHours(),
    minutes: date.getMinutes()
};

function zeroLeft(value) {
    return value >= 10 ? value : `0${value}`;
}

getDate.innerHTML += `${displayDate.dayString}, ${displayDate.month} de ${displayDate.monthString} de ${displayDate.year} ${zeroLeft(displayDate.hours)}:${zeroLeft(displayDate.minutes)}` 

console.log(displayDate);
