// Exibindo a data com o dateStyle
const displayDate = document.querySelector('.getDate');
const date = new Date();
const getDate = { dateStyle: 'full' };
const getHours = { timeStyle: 'short' };

displayDate.innerHTML = date.toLocaleDateString('pt-BR', getDate) + ' ' + date.toLocaleTimeString('pt-BR', getHours);
