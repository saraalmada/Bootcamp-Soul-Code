// 1. Crie uma variável para armazenar a idade do usuário e exiba "Você tem X anos".

// let idade = Number(prompt('Digite sua idade: '))

// console.log('Você tem ' + idade + ' anos')

// console.log(`Você tem ${idade} anos`)


// 2. Tendo o seguinte array:

// let frutas = ["Maçã", "Banana", "Laranja", "Limão", "Mamão", "Kiwi", "Pêra"];

// // a) exiba o segundo elemento.
// console.log(frutas[1])

// b) Descubra qual índice da fruta "Kiwi" dentro do array.

// c) Adicione "Morango" no início.

// d) Remova o último elemento.

// e) Remova o primeiro elemento.

// f) Remova o terceiro elemento.

// g) Adicione "Uva" na segunda posição.

// h) Adicione "Manga" no final.

// i) Use o operador spread (...) para criar um novo array chamado maisFrutas que contenha todos os elementos de frutas e mais duas frutas à sua escolha no final.



// Peça a idade e se a pessoa tem CNH (true ou false). Exiba "Pode dirigir" somente se tiver 18 anos ou mais e possuir CNH.
// let idade = parseInt(prompt("Qual sua idade?"))
// let temCnh = prompt("Você tem CNH? (sim/não)")
// if (idade >= 18 && temCnh == 'sim') {
//     console.log("Pode dirigir");
// } else {
//     console.log("Não pode dirigir");
// }





// 8. Utilizando o do...while, conte de 1 a 5 e exiba cada número.

// let i = 0;
// do {
//     i++                       // i += 3 // i = i + 1 // i-- 
//     console.log(i)
// } while (i <= 4)


// 9. Usando while, exiba apenas os múltiplos de 5 entre 0 e 50.

// let i = 0;
// while (i <= 50) {
//     if (i % 5 == 0) {
//         console.log(i);
//     }
//     i++;
// }

console.log('Sara')

// 10. Refaça a questão anterior utilizando o for.

for (let i = 0; i <= 50; i++) {
    if (i % 5 == 0) {
        console.log(i);
    }
}