// if, else if and else

/*
Entre 0 - 11 - Bom dia;
Entre 12 - 17 - Boa tarde;
Entre 18 - 23 - Boa noite;
*/

const hora = 50;

if (hora >= 0 && hora <= 11) {
    console.log('Bom dia!');
} else if (hora >= 12 && hora <= 17) {
    console.log('Boa tarde!');
 } else if (hora >=18 && hora<=23) {
    console.log('Boa noite!')
 } else {
    console.log('horário invalido')
 }
//saída: Boa noite!