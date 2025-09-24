// IIFE -> Immediately invoked fucntion expression
(function () {
    const criaNome = ['Emelly'];
    
    function falaNome(nome, sobrenome) {
        console.log(nome, sobrenome);
    }
    
    const sobrenome = "Beatriz";
    
    criaNome.forEach((nome) => {
        falaNome(nome, sobrenome);
    });
})(); // Saída: Emelly Beatriz