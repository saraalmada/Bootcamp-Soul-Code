// 1- Crie um array chamado frutas com três frutas. Crie um codigo para  adicionar mais duas frutas ao final

let frutas = ['pera', 'uva', 'maçã'];
console.log(frutas);

frutas.push('banana', 'goiaba');
console.log(frutas);


// 2- Crie um array chamado filmes com dois títulos. Crie um codigo para  adicionar um filme no início

let filmes = ['Esqueceram de mim', 'Matilda']
console.log(filmes)

filmes.unshift('Meninas malvadas')
console.log(filmes)


// 3- Crie um array vazio chamado compras. Adicione três itens no inicio e dois no final.

let compras = [];
console.log(compras)

compras.unshift('Café', 'Leite', 'Pão')
console.log(compras)

compras.unshift('Ovo', 'Queijo')
console.log(compras)


// 4- Crie um array chamado jogos. Adicione um novo jogo na terceira posição 

let jogos = ['Stardew Valley', 'Minecraft', 'Super Mario Bros', 'Donkey Kong', 'Pac-Man']
console.log(jogos)

jogos.splice(2, 0, 'Pokémon')
console.log(jogos)


// 5- Crie um array com os dias da semana. Adicione “Fim de semana” entre “sexta” e “sábado”.

let diasDaSemana = ['Segunda-feira', 'Terça-feira', 'Quarta-feira', 'Quinta-feira', 'Sexta-feira', 'Sábado', 'Domingo']
console.log(diasDaSemana)

diasDaSemana.splice(5, 0, 'Fim de semana')
console.log(diasDaSemana)


// 6- Crie um array chamado animais com cinco elementos. Crie um codigo para  remover o ultimo.

let animais = ['gato', 'cachorro', 'vaca', 'porco', 'ovelha']
console.log(animais)

let ultimo = animais.shift()
console.log(ultimo)
console.log(animais)


// 7- Crie um array com números de 1 a 5. remova o elemento no indice 3 

let numeros = [1, 2, 3, 4, 5]
console.log(numeros)

let rem = numeros.splice(3, 1)
console.log(rem)
console.log(numeros)


// 8- Crie um array com três elementos. Crie um codigo para remover o primeiro e o último.

let remover = ['A', 'B', 'C']
console.log(remover)

remover.pop()
remover.shift()

console.log(remover)


// 9- Crie um array chamado ingredientes. Remova dois ingredientes do meio.

let ingredientes = ['Açúcar', 'Ovo', 'Leite', 'Chocolate', 'Farinha', 'Fermento']
console.log(ingredientes)

ingredientes.splice(2, 2)
console.log(ingredientes)


// 10-Crie um array com cinco palavras.Remova a terceira e substituí-la por outra.
let palavras = ['pedra', 'papel', 'tesoura', 'lápis', 'borracha']
console.log(palavras)

palavras.splice(2, 1, 'caneta')
console.log(palavras)