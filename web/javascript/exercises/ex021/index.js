pontuacaoUsuario = 1000
const nivelUsuario = pontuacaoUsuario >=1000 ? 'Usuário VIP' : 'Usuário Normal';
console.log(nivelUsuario)
//saída: Usuário VIP

// Cor  de Usuário
const corUsuario = 'Branca';
const corPadrao = corUsuario || 'Preta';
// saída: Branca
console.log(corPadrao)