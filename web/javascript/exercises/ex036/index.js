const createData = (data) => {
    data = new Date()
    return data.toLocaleTimeString('pt-BR', {
    hour: '2-digit',
    minute: '2-digit',
    second: '2-digit',
    hour12: false
    });
};
console.log(createData())
// saída: 18:24:06

const data = new Date('07-23-2024 11:57:00')
// saída: 2024-07-23T14:57:00.000Z
console.log(data)