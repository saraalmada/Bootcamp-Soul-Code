const nome = 'Sara';
let idade = 26;
var prof = 'Professor';


console.log(nome.toUpperCase)
console.log(idade)
console.log("Sua idade é " + idade + " anos")

// alert("Sua idade é " + idade + " anos");

// idade = prompt("Qual sua idade?");
// console.log(idade);

let valor1 = prompt("Digite o primeiro valor: ")
let valor2 = prompt("Digite o segundo valor: ")
let resultado = Number(valor1) + parseInt(valor2);

let resposta = confirm("Deseja salvar os dados?")

if(resposta == true) {
    alert("Dados Salvos")
} else {
    alert("Os dados não foram Salvos")
}