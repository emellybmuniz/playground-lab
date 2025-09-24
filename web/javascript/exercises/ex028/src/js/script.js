const creatorElements = document.querySelector('.create-container')

const elements = [
    {tag: 'p', texto: 'Isso é uma parágrafo'}, //0
    {tag: 'div', texto: 'Isso é uma Div'}, //1
    {tag: 'footer', texto: 'Isso é um footer'}, //2
    {tag: 'section', texto: 'isso é uma section'}, //3
    {tag: 'p', texto: 'Isso é um parágrafo'}
]

const [ 
    { tag: tag1, texto: texto1 },
    { tag: tag2, texto: texto2 },
    { tag: tag3, texto: texto3 },
    { tag: tag4, texto: texto4 }
] = elements;

// Literarando elements
for (let i = 0; i < elements.length; i++) {
    const { tag, texto } = elements[i];
    creatorElements.innerHTML += `<${tag}>${texto}</${tag}>`;
}
