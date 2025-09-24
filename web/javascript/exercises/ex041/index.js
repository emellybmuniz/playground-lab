function f1(callback) { 
    console.log('f1')
    if (callback) { // Se callback existir, execute
        callback()
    }
}

function f2(callback) {
    console.log('f2')
    if (callback) { 
        callback()
    }
}

function f3(callback) {
    console.log('f3')
    if (callback) {
        callback()
    }
}

f1(function() {
    f2(function() {
        f3(function() {
            console.log('Fiz uma função callback')
        })
    })
})
/* Saída:
f1
f2
f3
Fiz uma função callback
*/