function meuFormulario () { // Guardando os dados em uma função
    const form = document.querySelector('.form');
    const resultado = document.querySelector('.resultado')
    const pessoas = [];
    
    function recebeEventoForm(evento) {
        evento.preventDefault(); //não deixa a página dar reload
        const nome = form.querySelector('.nome').value;
        const sobrenome = form.querySelector('.sobrenome').value;
        const peso = form.querySelector('.peso').value;
        const altura = form.querySelector('.altura').value;
        
        pessoas.push = { // adicionando elementos ao array `pessoas[]´
            nome, sobrenome, peso, altura
        }
        
        console.log(pessoas) // exibindo elementos no console

        resultado.innerHTML += ` 
          <p>nome: ${nome}
           sobrenome: ${sobrenome}
           peso: ${peso.value}
           altura ${altura}</p>` // Exibindo resultado no documento HTML
    }
    form.addEventListener('submit', recebeEventoForm) // Evento que excuta uma ação quando o botão submit é clicado
}

meuFormulario()
