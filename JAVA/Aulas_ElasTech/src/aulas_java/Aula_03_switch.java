package aulas_java;

import java.util.Scanner;

public class Aula_03_switch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Validação de Mês
//		System.out.print("Digite um número de 1 a 12 para selecionar o mês: ");
//		int mes = leitor.nextInt();
//		String nomeDoMes;
//		
//		if (mes >= 1 && mes <= 12) {
//			switch (mes) {
//				case 1:
//					nomeDoMes = "Janeiro";
//					System.out.println(nomeDoMes);
//					break;
//				case 2:
//					nomeDoMes = "Fevereiro";
//					System.out.println(nomeDoMes);
//					break;
//				case 3:
//					nomeDoMes = "Março";
//					System.out.println(nomeDoMes);
//					break;
//				case 4:
//					nomeDoMes = "Abril";
//					System.out.println(nomeDoMes);
//					break;
//				case 5:
//					nomeDoMes = "Maio";
//					System.out.println(nomeDoMes);
//					break;
//				case 6:
//					nomeDoMes = "Junho";
//					System.out.println(nomeDoMes);
//					break;
//				case 7:
//					nomeDoMes = "Julho";
//					System.out.println(nomeDoMes);
//					break;
//				case 8:
//					nomeDoMes = "Agosto";
//					System.out.println(nomeDoMes);
//					break;
//				case 9:
//					nomeDoMes = "Setembro";
//					System.out.println(nomeDoMes);
//					break;
//				case 10:
//					nomeDoMes = "Outubro";
//					System.out.println(nomeDoMes);
//					break;
//				case 11:
//					nomeDoMes = "Novembro";
//					System.out.println(nomeDoMes);
//					break;
//				case 12:
//					nomeDoMes = "Dezembro";
//					System.out.println(nomeDoMes);
//					break;
//			}
//		} else {
//			System.out.println("Mês inválido");
//		}
		
		
		//Cardápio com Opções Vegetarianas
//		System.out.print("IF FIADO NOT FOOD \n------------------ \n1-Hambúrguer \n2-Pizza \n3-Salada \n4-Sair \n------------------ \nEscolha uma opção: ");
//		
//		int comida = leitor.nextInt();
//		String tipoDeComida;
//		
//		switch (comida) {
//			case 1:
//				tipoDeComida = "Hambúrguer";
//				break;
//				
//			case 2:
//				System.out.print("Se deseja pizza vegetariana, tecle 1. Caso contrário, tecle outro número: ");
//				int pizzaVeg = leitor.nextInt();
//				
//				if (pizzaVeg == 1) {
//					tipoDeComida = "Pizza Vegetariana";
//				} else {
//					tipoDeComida = "Pizza Comum";
//				}
//				break;
//				
//			case 3:
//				tipoDeComida = "Salada";
//				break;
//				
//			case 4:
//				System.out.println("Saindo... Obrigado!");
//                return;
//				
//			default:
//				System.out.println("Opção inválida!");
//                return;
//		}
//		
//		System.out.println("--------------------------- \nPedido recebido! \n1x " + tipoDeComida + "\nObrigado pela preferência! \n---------------------------");
		
		
		//Tarifa de Transporte
		System.out.print("CATRACA DE POBRE \n------------------ \nE-Estudante \nA-Aposentado \nR-Regular \n------------------ \nEscolha uma opção: ");
		char tipo = leitor.next().charAt(0);
		
		boolean horarioPico = false;
		double tarifa = 5.5;
		
		if (!horarioPico) {
			switch (tipo) {
				case 'E': 
					tarifa = tarifa / 2;
					break;
					
				case 'A':
					tarifa = 0;
					break;
					
				case 'R':
					tarifa = 4.4;
					break;	
					
				default:
					System.out.println("Opção inválida.");
	                return;
			}
		}
		
		System.out.println("Tarifa: R$" + tarifa);
		
		
		// Sistema de Notas com Conceito
		
		
		
		
		
		
		leitor.close();
	}
}

