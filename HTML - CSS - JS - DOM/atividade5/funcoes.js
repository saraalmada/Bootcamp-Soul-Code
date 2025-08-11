// 1- Escreva uma Função que retorna "Olá, Mundo!"

const saudacao = function() {
    return 'Olá, Imundo!';
};

console.log(saudacao());

// 2- Função que soma dois números

const soma = function(a, b) {
    return a + b;
};

console.log(soma(5, 8));


// 3- Função que verifica se um número é par

const par = function(a) {
    return a % 2 == 0;
};

console.log(par(4));

// 4- Função que converte Celsius para Fahrenheit

const fahrenheitToCelsius = function(a) {
    return 1.8 * a + 32
}

console.log(fahrenheitToCelsius(30) + '°F');


// 5- Função que retorna o maior entre dois números

const maior = function(a, b) {
    if (a > b) {
        return a
    } else {
        return b
    };
};

console.log(maior(-5, 5));


// 6-Arrow function que retorna "Bom dia!"

const bomDia = () => 'Bom dia';

const nome = prompt('Digite seu nome: ');

console.log(bomDia() + ', ' + nome + '!');


// 7- Arrow function que multiplica dois números

const multiplicacao = (a, b) => a * b

let a = Number(prompt('Digite o primeiro valor: '))
let b = Number(prompt('Digite o segundo valor: '))

console.log(multiplicacao(a, b));

console.log(soma(1, 2))



// 8- Arrow function que calcula o quadrado de um número

let raizQuadrada = (a) => a * a;

console.log(raizQuadrada(10));



// 9- Arrow function que retorna o comprimento de uma string

const lengthString = (texto) => texto.length;

console.log(lengthString('Bootcamp'));



// 10- Crie uma função calculaIdade que receba o ano de nascimento e o ano atual e retorne a idade da pess

const calculaIdade = (a, b) => b - a;

console.log(calculaIdade(1999, 2025));