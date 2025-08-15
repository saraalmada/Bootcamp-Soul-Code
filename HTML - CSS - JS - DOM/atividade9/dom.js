// Exercício 1 — Mudar Texto ao Clicar
// Crie uma página com um parágrafo de texto e um botão. Quando o botão for clicado, o texto do parágrafo deve mudar para "Texto alterado com sucesso!".

function mudarTexto() {
    document.querySelector('p').innerText = "Texto alterado com sucesso!";
}


// Exercício 2 — Mudar Cor de um Elemento
// Crie uma página com um título (<h1>) e um botão. Ao clicar no botão, a cor do título deve mudar para vermelho.

function mudarCor() {
    document.getElementsByTagName('h1')[0].style.color = "red";
}


// Exercício 3 — Adicionar Item à Lista
// Crie uma página com uma lista (<ul>), um campo de texto e um botão. Ao clicar no botão, o texto digitado no campo deve ser adicionado como um novo item (<li>) na lista.

function adicionarItem() {
    const inputLista = document.getElementById('texto');
    const textoDaTarefa = inputLista.value.trim();

    if (textoDaTarefa === "") {
        alert("Por favor, insira um texto válido.");
        return;
    }

    const novoItem = document.createElement('li');
    novoItem.textContent = textoDaTarefa;

    document.getElementsByTagName('ul')[0].appendChild(novoItem);
    inputLista.value = "";
    inputLista.focus();
}