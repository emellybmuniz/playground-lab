
function random(min, max) {
	const r = Math.random() * (max - min) + min;
	return Math.floor(r);
}
const min = 1;
const max = 20;
let rand = (min, max);

while (rand !== 10) { // O laço de repetição de números randômicos só para quando for 10
    rand = random(min, max);
    console.log(rand)
}
/*
7
7
6
5
2
11
1
6
6
7
19
6
8
10
*/

