const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
/*
for (let value of numbers) {
    if (value === 8) { 
        console.log(value) // exiba o número antes de quebrar
        break
    }
    console.log(value)
}
*/
let i = 0; // variável de controle
while (i < numbers.length) {
    let number = numbers[i];
    
    if (number === 2) {
        console.log('Pulado')
        i++ //não esquecer do incremento para não cair em looping
        continue
    };

    console.log(number)
    i++
}