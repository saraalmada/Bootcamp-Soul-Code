// Exercício 1 – Saudação com nome
const nome = prompt('Qual é o seu nome?');
console.log('Olá, ' + nome + '! Seja bem-vindo(a).');

// Exercício 2 – Soma de dois números
let valor1 = prompt("Digite o primeiro valor: ");
let valor2 = prompt("Digite o segundo valor: ");
let soma = Number(valor1) + Number(valor2);
console.log('A soma dos números é igual a ' + soma);

// Exercício 4 – Cálculo do dobro
let valor3 = prompt("Digite um valor: ");
let dobro = Number(valor3) * 2;
console.log('O dobro de ' + valor3 + ' é ' + dobro);

// Exercício 5 – Área de um retângulo
let base = prompt("Qual a base do retângulo?");
let altura = prompt("Qual a altura do retângulo?");
let area = Number(base) * Number(altura);
console.log('A área do retângulo é ' + area);

// Exercício 6 – Desconto em produto
let preco = prompt('Digite o preço do produto: ');
let desconto = prompt('Digite o desconto em %: ');
let valorDesconto = Number(preco) * Number(desconto) / 100;
let precoComDesconto = Number(preco) - valorDesconto;
console.log(`Preço original: R$ ${Number(preco).toFixed(2)}
Desconto: ${desconto}% 
Preço com desconto: R$ ${Number(precoComDesconto).toFixed(2)}`);

// Exercício 7 – Nome completo
const primeiroNome = prompt('Digite seu nome: ');
const sobrenome = prompt('Digite seu sobrenome: ');
console.log('Seu nome completo é: ' + primeiroNome + ' ' + sobrenome);

// Exercício 8 – Confirmação de cadastro
let cadastro = confirm("Deseja se cadastrar no site?")

if (cadastro == true) {
    const nomeCompleto = prompt('Qual seu nome completo? ')
    let idade = prompt('Qual sua idade? ')
    console.log(`Cadastro realizado com sucesso!\nNome: ${nomeCompleto}\nIdade: ${idade}`);
} else {
    console.log('Cadastro cancelado pelo usuário.')
}