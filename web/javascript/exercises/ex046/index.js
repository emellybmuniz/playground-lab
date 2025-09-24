// Método Splice
// índice         -4       -3      -2         -1
// índice         0        1        2          3  
const names = ['Maria', 'João', 'Eduardo', 'Gabriel']


// splice sintaxe
// array.splice(start, deleteCount, item1, item2, ...)
names.splice(2, 2, 'Emelly')
console.log(names)
// [ 'Maria', 'João', 'Emelly' ]

