// 1- VERIFICAR MAIORIDADE
let idade = Number(prompt('Digite sua idade: '))
if (idade >= 18) {
    console.log('Você é maior de idade!')
} else {
    console.log('Você é menor de idade!')
}

// 2- PAR OU ÍMPAR
let valor = Number(prompt('Digite um número: '))
let resultado = valor %2 ===0 ? valor + ' é par' : valor + ' é ímpar'
console.log(resultado)

// 3- VERIFICAR SENHA
let senha = prompt('Digite uma senha: ')
let verificar = senha === "JAVASCRIPT123" ? "ACESSO PERMITIDO" : "ACESSO NEGADO"
console.log(verificar)

// 4 – APROVADO, RECUPERAÇÃO OU REPROVADO (COM ELSE IF)
let nota = Number(prompt('Digite um número: '))
if (nota >= 7) {
    console.log("APROVADO")
} else if (nota >= 5) {
    console.log("RECUPERAÇÃO")
} else {
    console.log("REPROVADO")
}