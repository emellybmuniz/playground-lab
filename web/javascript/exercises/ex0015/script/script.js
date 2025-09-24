const numero = Number(prompt(`Digite um número:`))
const numeroTitulo = document.getElementById(`numero-titulo`)
const texto = document.getElementById(`texto`);
const texto2 = document.getElementById(`texto2`);
const eInteiro = Number.isInteger(numero);
const eNaN = Number.isNaN(numero);
const arredondandoBaixo = Math.floor(numero);
const arredondandoCima = Math.ceil(numero);
const duasCasasDecimais = numero.toFixed(2);

numeroTitulo.innerHTML = numero;
texto.innerHTML = ``;
texto.innerHTML += `<p>A raiz quadrada do seu número é: ${numero ** 0.5}</p>`;
texto2.innerHTML += `<p>${numero} é inteiro: ${eInteiro}</p>`;
texto3.innerHTML += `<p>É NaN: ${eNaN} </p>`;
texto4.innerHTML += `<p>Arredondando para baixo:${arredondandoBaixo}</p>`;
texto5.innerHTML += `<p>Arredondando para cima:${arredondandoCima}</p>`;
texto6.innerHTML += `<p>Com duas casas decimais: ${duasCasasDecimais}</p>`;
