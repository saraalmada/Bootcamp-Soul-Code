package aulas_java;

import java.util.Scanner;

public class Aula_03_switch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// 1 - Validação de Mês
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
//				default:
//					System.out.println("Opção inválida");
//					break;
//			}
//		} else {
//			System.out.println("Mês inválido");
//		}
		
		
		// 2 - Cardápio com Opções Vegetarianas
//		System.out.print("IF FIADO NOT FOOD "
//				+ "\n------------------ "
//				+ "\n1-Hambúrguer "
//				+ "\n2-Pizza "
//				+ "\n3-Salada "
//				+ "\n4-Sair "
//				+ "\n------------------ "
//				+ "\nEscolha uma opção: ");
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
//              break;
//		}
//		
//		System.out.println("--------------------------- \nPedido recebido! \n1x " + tipoDeComida + "\nObrigado pela preferência! \n---------------------------");
		
		
		// 3 - Tarifa de Transporte
//		System.out.print("CATRACA DE POBRE "
//				+ "\n------------------ "
//				+ "\nE-Estudante "
//				+ "\nA-Aposentado "
//				+ "\nR-Regular "
//				+ "\n------------------ "
//				+ "\nEscolha uma opção: ");
//		char tipo = leitor.next().toUpperCase().charAt(0);
//		
//		boolean horarioPico = false;
//		double tarifa = 5.5;
//		
//		if (!horarioPico) {
//			switch (tipo) {
//				case 'E': 
//					tarifa = tarifa / 2;
//					break;
//					
//				case 'A':
//					tarifa = 0;
//					break;
//					
//				case 'R':
//					tarifa = 4.4;
//					break;	
//					
//				default:
//					System.out.println("Opção inválida.");
//	                break;
//			}
//		}
		
//		System.out.println("Tarifa: R$" + tarifa);
		
		
		// 4 - Sistema de Notas com Conceito
//		System.out.println("Digite uma nota de 0 a 10: ");
//		double nota = leitor.nextDouble();
//		String status;
//		
//		if (nota < 5) {
//			status = "Reprovado";
//		} else if (nota >= 5 && nota <= 7) {
//			status = "Recuperação";
//		} else {
//			status = "Aprovado";
//			
//			switch (status) {
//			case "Aprovado":
//				System.out.println("Parabéns pela nota!");
//				break;
//			}
//			
//		}
//		
//		System.out.print(status);
		
		
		// 5 - Operações Bancárias
//		System.out.print("PAG BANK "
//				+ "\n------------------ "
//				+ "\nS - Saque \nD - Depósito "
//				+ "\n------------------ "
//				+ "\nEscolha uma opção: ");
//		char transicao = leitor.next().toUpperCase().charAt(0);
//		double saldo = 500.0;
//		
//		switch(transicao) {
//		case 'S':
//			System.out.print("------------------ "
//					+ "\nDigite o valor deseja sacar: ");
//			double valorSaque = leitor.nextDouble();
//			if (valorSaque <= saldo) {
//				System.out.print("------------------ "
//						+ "\nSaque realizado! "
//						+ "\nSaldo restante disponível: R$" + (saldo - valorSaque) 
//						+ " \nObrigada por utilizar o PAG BANK!");
//			} else {
//				System.out.print("------------------ "
//						+ "\nSaldo insuficiente! "
//						+ "\nSeu saldo é de: R$" + (saldo)
//						+ "\nVerifique sua conta PAG BANK para maiores informações!");
//			}
//			break;
//			
//		case 'D':
//			System.out.print("------------------ "
//					+ "\nDigite o valor que deseja depositar: ");
//			double deposito = leitor.nextDouble();
//			System.out.print("------------------ "
//					+ "\nDepósito realizado! "
//					+ "\nNovo saldo: R$" + (saldo + deposito)
//					+ "\nObrigada por utilizar o PAG BANK!");
//			break;
//			
//		default:
//			System.out.println("Opção inválida.");
//          break;
//		}
		
		
		// 6 - Tipo de Veículo e Pedágio
//		System.out.println("Qual seu tipo de veículo? (carro, moto ou caminhao)");
//		String tipoVeiculo = leitor.next().toLowerCase();
//		double pedagio = 0.0;
//		
//		switch (tipoVeiculo) {
//		case "carro":
//			pedagio = 15.0;
//			break;
//			
//		case "moto":
//			pedagio = 5.0;
//			break;
//			
//		case "caminhao":
//			pedagio = 30.0;
//			System.out.println("O veículo possui eixo extra? (true/false)");
//	        boolean eixoExtra = leitor.nextBoolean();
//	        
//			if (eixoExtra) {
//				pedagio = pedagio * 1.2;
//			}
//			break;
//			
//		default:
//			System.out.println("Opção inválida.");
//			break;
//		}
//		
//		
//		System.out.println("O valor do pedágio para seu veículo é de: R$ " + pedagio);
		
		
		
		// 7 - Login com Nível de Acesso
//		String usuarioCorreto = "sara";
//		String senhaCorreta = "s123";
//		String nivelDeAcesso = "usuario";
//		
//		System.out.print("Usuário: ");
//		String usuario = leitor.next();
//		
//		System.out.print("Senha: ");
//		String senha = leitor.next();
//		
//		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
//			switch (nivelDeAcesso) {
//			case "admin":
//				System.out.println("Permissão: Administrador");
//				break;
//			case "usuario":
//				System.out.println("Permissão: Usuário");
//				break;
//			case "guest":
//				System.out.println("Permissão: Convidado");
//				break;
//			default:
//				System.out.println("Acesso não autorizado.");
//				break;
//			}
//		} else {
//			System.out.println("Usuário ou senha inválidos."); 
//		}
		
		
		
		// 8 - Estações do Ano
//		System.out.println("Digite o mês de 1 a 12: ");
//		int mesDoAno = leitor.nextInt();
//		
//		boolean inverno = false;
//		
//		switch (mesDoAno) {
//		case 12, 1, 2:
//			System.out.println("Verão");
//			break;
//		case 3, 4, 5:
//			System.out.println("Outuno");
//			break;
//		case 6, 7, 8:
//			System.out.println("Inverno");
//			break;
//		case 9, 10, 11:
//			inverno = true;
//			System.out.println("Primavera");
//			break;
//		default:
//			System.out.println("Opção inválida.");
//			break;
//		}
//		
//		if (inverno) {
//			System.out.println("Época de chocolate quente!");
//		}
		
		
		
		// 9 - Calculadora Inteligente
		System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();

        double resultado;

        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultado);
                break;

            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }

		
		
		leitor.close();
	}
}

