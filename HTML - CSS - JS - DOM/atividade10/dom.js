// Mudar a Cor de Fundo
// Enunciado: Crie um div com um texto qualquer. Crie uma função que seja chamada quando o mouse passar por cima do div, alterando sua cor de fundo para "lightblue". Crie uma segunda função para que, quando o mouse sair, a cor de fundo volte para "white".

const div = document.getElementById('container');

div.addEventListener('mouseover', function() {
    div.style.backgroundColor = "lightblue";
});

div.addEventListener('mouseout', function() {
    div.style.backgroundColor = "moccasin";
});


//  Esconder e Mostrar um Elemento
// Enunciado: Crie um parágrafo e um botão. Crie uma função que, ao ser clicada, verifique se o parágrafo está visível. Se estiver, a função deve escondê-lo. Se estiver escondido, a função deve mostrá-lo.

const paragrafo = document.querySelector('p');
const botao = document.querySelector('button');

botao.addEventListener('click', function() {
    paragrafo.style.visibility = (paragrafo.style.visibility == 'visible' ? 'hidden' : 'visible');
})


// Contar Cliques
// Enunciado: Crie um botão e um <span> para exibir um número. Crie uma função que incremente uma variável de contagem toda vez que o botão for clicado e atualize o texto do <span> para mostrar o número atual de cliques.

const numero = document.querySelector('span');
const botaoContador = document.querySelector('#contador');

botaoContador.addEventListener('click', function() {
    numero.textContent = parseInt(numero.textContent) + 1;
})


// Crie um botão "Abrir Modal" e um div que servirá como uma janela modal (inicialmente oculta). O modal deve ter um botão "Fechar" (um "X") no canto superior direito. Crie duas funções: abrirModal() e fecharModal(). A primeira torna o modal visível e a segunda o oculta. Use classes CSS para controlar a visibilidade e o estilo do modal.

const botaoAbrir = document.getElementById("abrir");
const botaoFechar = document.getElementById("fechar");
const modal = document.querySelector('h2');

function abrirModal() {
    modal.style.visibility = "visible";
}

function fecharModal() {
    modal.style.visibility = "hidden";
}

botaoAbrir.addEventListener('click', abrirModal);

botaoFechar.addEventListener('click', fecharModal);