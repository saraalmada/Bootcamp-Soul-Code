

// 6. FILTRAR COM FILTER DADO UM ARRAY DE TEMPERATURAS, USE FILTER PARA RETORNAR APENAS AS TEMPERATURAS ACIMA DE 30 GRAUS

// const temperaturas = [15, 32, 4, -2, 30, 36, 12];

// const acimaDe30 = temperaturas.filter(temperatura => temperatura > 30);
// console.log(acimaDe30);


// 7. Contar elementos com reduce. Dado um array com letras repetidas, use  para contar quantas vezes cada letra aparece

// let letras = ['S', 'W', 'A', 'M', 'A', 'W', 'W', 'S', 'M', 'M']

// let contagem = letras.reduce((acumulador, letra) => {
//   acumulador[letra] = (acumulador[letra] || 0) + 1;
//   return acumulador;
// }, {});

// console.log(contagem);




// 8. CALCULAR MÉDIA COM REDUCE CRIE UM ARRAY COM NOTAS DE ALUNOS. USE REDUCE PARA CALCULAR A MÉDIA DAS NOTAS. CONST NOTAS = [8, 7.5, 9, 6];

// const notas = [8, 7.5, 9, 6];

// let contador = 0;
// const media = notas.reduce((soma, nota) => soma + nota, contador) / notas.length;

// console.log(media.toFixed(2));


// 9. FILTRAR E TRANSFORMAR COM FILTER + MAP DADO UM ARRAY DE NÚMEROS, FILTRE OS PARES E DEPOIS MULTIPLIQUE CADA UM POR 2

// const numeros = [5, 6, 8, 9, 1, 3, 7, 4, 2, 10];
// console.log(numeros);

// const pares = numeros.filter(par => par % 2 == 0);
// console.log(pares);

// const dobro = pares.map(dobro => dobro * 2);
// console.log(dobro);


// 10. Criar frases com map Crie um array com nomes de pessoas. Use map para gerar frases como: "Olá, [nome]!". const nomes = ["Carlos", "Ana", "João"]; // Resultado esperado: ["Olá, Carlos!", "Olá, Ana!", "Olá, João!"]

// const nomes = ["Carlos", "Ana", "João"];

// const frases = nomes.map(frase => `Olá, ${frase}!`)
// console.log(frases);










// Imprimir todos os elementos de um array usando for e .length:
// const frutas = ["maçã", "banana", "laranja", "manga"];
// for(let i = 0; i < frutas.length; i++) {
//     console.log(frutas[i]);
// }


// // Imprimir cada letra de uma palavra:
// const palavra = "javascript";
// for(let i = 0; i < palavra.length; i++) {
//     console.log(palavra[i])
// }



// Imprima todos os números de um array multiplicados por 2
// const numeros = [2, 4, 6, 8, 10];
// for(let i = 0; i < numeros.length; i++) {
//     // let dobro = numeros[i] * 2
//     console.log(numeros[i] * 2)
// }



