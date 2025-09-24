// Escreva uma função chamada ePaisagem que recebe dois argumentos, largura e altura
// de uma imagem (Number)
// Retorne true se a imagem estiver em modo paisagem
//Altura > Largura portrait
//Largura > Altura Landscape

let isLandscape = (width, height) => width > height ? 'Landscape' : 'Portrait' 

console.log(isLandscape(180,180))
// saída: Portrait
