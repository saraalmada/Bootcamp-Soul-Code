// Declaração da constante produtos que seja um array de objetos.
const produtos = [
    {
        nome: "Prato de Cerâmica",
        preco: 29.90,
        emEstoque: true,
        imagem: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSudijtNatlKKpVwOg0Y3naCkmGOnrtJ-Av1w&s"
    },
    {
        nome: "Vaso de Vidro",
        preco: 69.90,
        emEstoque: true,
        imagem: "https://m.media-amazon.com/images/I/713tLwj9YrL._UF894,1000_QL80_.jpg"
    },
    {
        nome: "Cesta de Palha",
        preco: 49.90,
        emEstoque: false,
        imagem: "https://cdn.awsli.com.br/800x800/2728/2728453/produto/259971861/cesto-redondo-de-palha-de-taboa-38x20-1-ahptcj6gxu.jpg"
    },
    {
        nome: "Cadeira de Madeira",
        preco: 189.90,
        emEstoque: true,
        imagem: "https://cdn.awsli.com.br/1664/1664922/produto/1604040863d45576806.jpg"
    }
];


//Utilização do evento DOMContentLoaded para garantir que o script só seja executado após a página ser totalmente carregada.
document.addEventListener("DOMContentLoaded", () => {

    // Renderiza a lista inicial de produtos.
    renderizarProdutos(produtos);

    // Calcula e exibe o valor total do estoque.
    atualizarValorTotal();

    // Adiciona event listeners para cada um dos botões
    document.getElementById("btn-desconto").addEventListener("click", aplicarDesconto);
    document.getElementById("btn-filtrar").addEventListener("click", mostrarApenasDisponiveis);
    document.getElementById("btn-mostrar-todos").addEventListener("click", () => renderizarProdutos(produtos));
});


function renderizarProdutos(listaDeProdutos) {
    const grid = document.getElementById("product-grid");

    // Limpa qualquer conteúdo existente dentro da section
    grid.innerHTML = "";

    listaDeProdutos.forEach(produto => {

        // Cria o card que exibe as informações do produto
        const card = document.createElement("div");
        card.classList.add("card");

        // Cria a imagem do produto
        const img = document.createElement("img");
        img.src = produto.imagem;
        img.alt = produto.nome;

        // Cria o título do produto
        const nome = document.createElement("h3");
        nome.textContent = produto.nome;

        // Cria o preço do produto
        const preco = document.createElement("p");
        preco.textContent = "R$ " + produto.preco.toFixed(2).replace(".", ",");

        // Cria o status do produto
        const status = document.createElement("p");
        status.textContent = produto.emEstoque ? "Disponível" : "Esgotado";
        // Adiciona condicionalmente a classe .out-of-stock ao parágrafo de status se produto.emEstoque for false.
        if (!produto.emEstoque) {
            status.classList.add("out-of-stock");
        } else {
            status.classList.add("in-stock");
        }

        // Coloca os elementos dentro do card e na ordem que eu quero que os elementos apareçam
        card.appendChild(img);
        card.appendChild(nome);
        card.appendChild(preco);
        card.appendChild(status);
        
        // Adiciona o card pronto no grid
        grid.appendChild(card);

        atualizarValorTotal(listaDeProdutos);
    });
}


function aplicarDesconto() {
    const produtosComDesconto = produtos.map(function(produto) {
        const precoComDesconto = Number((produto.preco * 0.9).toFixed(2));
        return {
            ...produto, // spread operator, para copiar todas as propriedades do produto e sobrescrever apenas preco abaixo.
            preco: precoComDesconto
        };
    });
    renderizarProdutos(produtosComDesconto);
}


function mostrarApenasDisponiveis() {
    const disponiveis = produtos.filter(function(produto) {
        return produto.emEstoque == true;
    });
    renderizarProdutos(disponiveis);
}


function atualizarValorTotal() {
    let total = 0;

    produtos.forEach(function(produto) {
        if (produto.emEstoque) {
            total += produto.preco;
        } 
    });

    document.getElementById("valor-total-estoque").textContent = "R$ " + total.toFixed(2).replace(".", ",");
}