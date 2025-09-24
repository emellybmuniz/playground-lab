// Apenas pares
for (let i = 0; i <= 20; i++) {
	if (i % 2 === 0)console.log(`${i} - PAR`);
}
/* saída:
0 - PAR
2 - PAR
4 - PAR
6 - PAR
8 - PAR
10 - PAR
12 - PAR
14 - PAR
16 - PAR
18 - PAR
20 - PAR
*/

for (let i= 0; i <= 20; i++) {
	const evenOrOdd = i % 2 === 0 ? "PAR" : "IMPAR"; 
	console.log(i, evenOrOdd)
}
/*saída
0 PAR
1 IMPAR
2 PAR
3 IMPAR
4 PAR
5 IMPAR
6 PAR
7 IMPAR
8 PAR
9 IMPAR
10 PAR
11 IMPAR
12 PAR
13 IMPAR
14 PAR
15 IMPAR
16 PAR
17 IMPAR
18 PAR
19 IMPAR
20 PAR
*/ 