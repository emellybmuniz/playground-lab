// Objetivos:
// colocar o fundo do parágrafo na mesma cor do body
// colocar fonte branca
const paragraphs = document.querySelector('.paragraphs');
const p = paragraphs.querySelectorAll('p'); // Apanha todos os '<p>' da classe paragraphs

const styleBody = getComputedStyle(document.body); // Pega o estilo do body
const backgroundColorBody = styleBody.backgroundColor; // Pegando a cor de fundo

for (let value of p) { // a cada laço de repetição o estilo do <p> é redefinido
   value.style.backgroundColor = backgroundColorBody;
   value.style.color = 'white';
}



