let car = {
    marca: "Volkswagen",
    modelo: "Golf",
    ano: 2018,
    cor: "Branco",
    preco: 45000
  }

for(let key in car) {
    console.log(`${key}: ${car[key]}`)
}
console.log(car['marca']) //Volkswagen
/* Saida:

*/
