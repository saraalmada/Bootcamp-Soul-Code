const produtos = [
    { nome: "Headphone", preco: 119.99, emEstoque: true },
    { nome: "Teclado", preco: 209.90, emEstoque: true },
    { nome: "Mouse", preco: 166.60, emEstoque: false },
    { nome: "MousePad", preco: 29.90, emEstoque: false }
];

// Exibir todos os produtos no console como tabela
console.table(produtos);

// Calcular o valor total de itens em estoque (filter + reduce)
const totalEstoque = produtos
    .filter(produto => produto.emEstoque)
    .reduce((soma, produto) => soma + produto.preco, 0);

console.log("Valor total dos itens em estoque: R$", totalEstoque.toFixed(2));

// Criar novo array com 10% de desconto (map)
const produtosComDesconto = produtos.map(produto => {
    return {
        nome: produto.nome,
        preco: (produto.preco * 0.9).toFixed(2), 
        emEstoque: produto.emEstoque
    };
});
console.log("Produtos com 10% de desconto:", produtosComDesconto);

// Filtrar apenas os produtos disponíveis (filter)
const disponiveis = produtos.filter(produto => produto.emEstoque);
console.log("Produtos disponíveis:", disponiveis);

// for...of para imprimir nome de cada produto
console.log("Lista de produtos:");
for (let produto of produtos) {
    console.log(produto.nome);
}

// while para percorrer o array e exibir nomes
console.log("Lista de produtos (while):");
let i = 0;
while (i < produtos.length) {
    console.log(produtos[i].nome);
    i++;
}

// do...while para contagem regressiva de quantos faltam processar
console.log("Contagem regressiva de produtos:");
let restante = produtos.length;
do {
    console.log(`Faltam processar ${restante} produto(s)...`);
    restante--;
} while (restante > 0);
