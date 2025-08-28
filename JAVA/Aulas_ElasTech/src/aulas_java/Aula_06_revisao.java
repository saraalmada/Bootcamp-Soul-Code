package aulas_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aula_06_revisao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Exercício 1 – Declaração e uso de variáveis 
//		String nome = "Sara";
//		int idade = 26;
//		double altura = 1.60;
		
		// Exercício 2 – Operações Aritméticas 
//		System.out.println("Digite o primeiro número inteiro: ");
//		int n1 = leitor.nextInt();
//		
//		System.out.println("Digite o segundo número inteiro: ");
//		int n2 = leitor.nextInt();
//		
//		int soma = n1 + n2;
//		int subtracao = n1 - n2;
//		int multiplicacao = n1 * n2;
//		int divisao = n1 / n2;
//		
//		System.out.println("Soma = " + soma + "; "
//						+ "Subtração = " + subtracao + "; "
//						+ "Multiplicação = " + multiplicacao + "; "
//						+ "Divisão = " + divisao + ";");
		
		// Exercício 3 – Condicional IF/ELSE
//		System.out.println("Digite sua idade: ");
//		int suaIdade = leitor.nextInt();
//		
//		if (suaIdade >= 18) {
//			System.out.println("Você é maior de idade");
//		} else {
//			System.out.println("Você é menor de idade");
//		}
		
		// Exercício 4 – Switch 
//		System.out.println("Digite um número de 1 a 7: ");
//		int diaDaSemana = leitor.nextInt();
//		
//		switch (diaDaSemana){
//		case 1:
//			System.out.println("Domingo");
//			break;
//		case 2:
//			System.out.println("Segunda-feira");
//			break;
//		case 3:
//			System.out.println("Terça-feira");
//			break;
//		case 4:
//			System.out.println("Quarta-feira");
//			break;
//		case 5:
//			System.out.println("Quinta-feira");
//			break;
//		case 6:
//			System.out.println("Sexta-feira");
//			break;
//		case 7:
//			System.out.println("Sábado");
//			break;
//		}
		
		// Exercício 5 – Loop FOR 
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + " = par");
//			} else {
//				System.out.println(i + " = ímpar");
//			}
//		}
		
		// Exercício 6 – Loop WHILE 
//		int soma = 0;
//		int num = 1;
//		
//		while (num != 0) {
//			System.out.println("0 para finalizar "
//					+ "\nDigite um número para somar:");
//			num = leitor.nextInt();
//			soma += num;
//		}
//		
//		System.out.println("Resultado = " + soma);
		
		// Exercício 7 – Arrays 
		
//		int[] arrayNum = new int[5];
//		int somaTotal = 0;
//		
//		for (int i = 0; i < arrayNum.length; i++) {
//			System.out.print("Digite um número: ");
//			arrayNum[i] = leitor.nextInt();
//			somaTotal += arrayNum[i];
//		}
//		
//		System.out.print("\nNúmeros digitados: ");
//		for (int numeros: arrayNum) {
//			System.out.print(numeros + ", ");
//		}
//		
//		System.out.println("a soma total = " + somaTotal);
		
		// Exercício 8 – ArrayList 
//		ArrayList<String> nomes = new ArrayList<>();
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print("Digite um nome: ");
//			String nome = leitor.next();
//			nomes.add(nome);
//		}
//		
//		System.out.print("\nLista de nomes: ");
//        System.out.println(nomes);
//	
//        System.out.print("\nDigite um nome para buscar: ");
//        String busca = leitor.next();
//        
//        if (nomes.contains(busca)) {
//        	System.out.println(busca + " está na lista de nomes.");
//        } else {
//        	System.out.println(busca + " NÃO está na lista de nomes.");
//        }
		
		// Exercício 9 – IF + LOOP + ARRAY 
//		int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        
//        System.out.println("Números maiores que 50: ");
//        
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] > 50) { 
//                System.out.println(numeros[i]);
//            }
//        }
		
		
		
		// Atividade 10 – Sistema de Conta Bancária 
        ArrayList<Integer> numerosConta = new ArrayList<>();
		ArrayList<String> titulares = new ArrayList<>();
        ArrayList<Double> saldos = new ArrayList<>();
		
        int menu;
		do {
			System.out.println("----- Seja bem-vindo ao Pag Bank! -----" 
					+"\n 1 - Criar nova conta "
					+ "\n 2 - Depositar" 
					+ "\n 3 - Sacar "
					+ "\n 4 - Ver saldo de uma conta "
					+ "\n 5 - Listar todas as contas "
					+ "\n 6 - Sair"
					+ "\n---------------------------------------");
			System.out.print("Escolha a opção desejada: ");
			
			menu = leitor.nextInt();
			
			switch(menu) {
			case 1: {
			    System.out.print("Digite o número da nova conta: ");
			    int novaConta = leitor.nextInt();

			    if (numerosConta.contains(novaConta)) {
			        System.out.println("\nConta já existente!"
			        		+ "\n---------------------------------------");
			    } else {
			        numerosConta.add(novaConta);

			        System.out.print("\nDigite o nome do titular: ");
			        leitor.nextLine();
			        String titular = leitor.nextLine();
			        titulares.add(titular);
			        saldos.add(0.0);

			        System.out.println("\nConta criada com sucesso!"
			        		+ "\n---------------------------------------");
			    }
			    break;
			}
				
			case 2: {
				System.out.print("Digite o número da sua conta: ");
				int contaDeposito = leitor.nextInt();
				
				int iContaCliente = numerosConta.indexOf(contaDeposito);
				
				if (iContaCliente != -1) {
					System.out.print("Qual valor desejar depositar? ");
					double valorDeposito = leitor.nextDouble();
					
					if (valorDeposito > 0) {
					saldos.set(iContaCliente, saldos.get(iContaCliente) + valorDeposito);
					System.out.println("\nDepósito realizado com sucesso!"
							+ "\n---------------------------------------");
					} else {
						System.out.println("Valor inválido."
								+ "\n---------------------------------------");
					}
					
				} else {
					System.out.println("\nConta não encontrada! Confira o número da conta ou crie uma conta!"
							+ "\n---------------------------------------");
				}
				break;
			}
			
			case 3: {
				System.out.print("Digite o número da sua conta: ");
				int contaSaque = leitor.nextInt();
				
				int iContaCliente = numerosConta.indexOf(contaSaque);
				
				if (iContaCliente != -1) {
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = leitor.nextDouble();
                    
                    if (valorSaque > 0 && valorSaque <= saldos.get(iContaCliente)) {
                        saldos.set(iContaCliente, saldos.get(iContaCliente) - valorSaque);
                        System.out.println("\nSaque realizado com sucesso!"
                        		+ "\n---------------------------------------");
                        
                    } else {
                        System.out.println("\nSaldo insuficiente ou valor inválido!"
                        		+ "\n---------------------------------------");
                    }
                    
                } else {
                    System.out.println("\nConta não encontrada!"
                    		+ "\n---------------------------------------");
                }
				break;
			}
			
			case 4: {
				System.out.print("Digite o número da conta: ");
                int contaSaldo = leitor.nextInt();
                
                int iContaCliente = numerosConta.indexOf(contaSaldo);

                if (iContaCliente != -1) {
                    System.out.println("\n---------------------------------------"
                    		+ "\nTitular: " + titulares.get(iContaCliente));
                    System.out.println("Saldo: R$ " + saldos.get(iContaCliente)
                    		+ "\n---------------------------------------");
                } else {
                    System.out.println("\nConta não encontrada!"
                    		+ "\n---------------------------------------");
                }
                break;
			}
			
			case 5: {
                if (numerosConta.isEmpty()) {
                    System.out.println("\nNenhuma conta cadastrada ainda."
                    		+ "\n---------------------------------------");
                } else {
                    for (int i = 0; i < numerosConta.size(); i++) {
                    	System.out.println("\n---------------------------------");
                        System.out.println("Conta: " + numerosConta.get(i)
                                + " | Titular: " + titulares.get(i)
                                + " | Saldo: R$ " + saldos.get(i)
                                + "\n");
                    }
                }
                break;
			}
			
			case 6: {
				System.out.println("\nSaindo ... Muito obrigada por utilizar o Pag Bank!");
				break;
			}
			
			default: {
				System.out.println("\nOpção inválida! Tente novamente!"
						+ "\n---------------------------------------");
			}
			}
			
		} while (menu != 6); 		
		
		
		
		
		leitor.close();
	}

}
