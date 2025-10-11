// 1. Declaração e Inicialização
let nome = "Sara";
let idade = 26;
let estaAprovado = true;
const TAXA_FIXA = 0.15;

// 2. Operações Simples
let anoAtual = 2025;
let anoNascimento = anoAtual - idade;

// 3. Verificação (Console)
console.log("Nome: " + nome + "\nIdade: " + idade + "\nAprovado: " + estaAprovado + "\nTaxa Fixa: " + TAXA_FIXA);

console.log("Ano de Nascimento: " + anoNascimento);

let mensagemBoasVindas = nome + " tem " + idade + " anos de idade.";
console.log(mensagemBoasVindas);

console.log(idade * TAXA_FIXA);

// 1. Condicional Simples (if/else)
let numero = 3;

if (numero % 2 === 0) {
    console.log("O número " + numero + " é par.");
} else {
    console.log("O número " + numero + " é ímpar.");
}

// 2. Condicional Múltipla (if/else if/else)
//let pontuacao = prompt("Digite algo:");

// if (pontuacao >= 90 && pontuacao <= 100) {
//     console.log("Nota: A (Excelente)");
// } else if (pontuacao > 80 && pontuacao < 89) {
//     console.log("Nota: B (Bom)");
// } else if (pontuacao > 70 && pontuacao < 79) {
//     console.log("Nota: C (Regular)");
// } else {
//     console.log("Nota: D (Reprovado)");
// }

// 3. Combinação de Lógica
let temperatura = 25;
let estaChovendo = false;

if (temperatura > 20 && !estaChovendo) {
    console.log("Dia perfeito para sair!");
} else {
    console.log("Melhor ficar em casa ou levar um guarda-chuva.");
}

// 1. Função Sem Parâmetros
function saudarUsuario() {
    console.log("Olá! Bem-vindo ao mundo das funções JavaScript.");
}

saudarUsuario();

// 2. Função Com Parâmetros
function calcularAreaRetangulo (largura, altura) {
    let area = largura * altura;
    console.log("A área do retângulo é: " + area);
}

calcularAreaRetangulo(5, 10);
calcularAreaRetangulo(8, 4);

// 3. Função Com Retorno (Aumentando a Dificuldade)
function verificarMaioridade (idade) {
    if (idade >= 18) {
        return true;
    } else {
        return false;
    }
}

let maior = verificarMaioridade(22);
let menor = verificarMaioridade(15);

console.log("Maior idade: " + maior + "\nMenor idade: " + menor);