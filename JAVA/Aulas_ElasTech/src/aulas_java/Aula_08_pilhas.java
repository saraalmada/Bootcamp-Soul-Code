package aulas_java;

import java.util.Stack;

public class Aula_08_pilhas {

	public static void main(String[] args) {
		// 1. Organizando uma Pilha de Livros
//		Stack<String> livros = new Stack<>();
//		
//		livros.push("O Senhor dos Anéis");
//		livros.push("O Hobbit");
//		livros.push("Silmarillion");
//		
//		System.out.println("Lista de livros: " + livros);
//		
//		while(!livros.isEmpty()) {
//			System.out.println("Livro retirado: " + livros.pop());
//		}
		
		
		// 2. Invertendo uma Palavra
//		Stack<Character> letras = new Stack<>();
//		String palavra = "Java";
//		
//		for (char c: palavra.toCharArray()) {
//            letras.push(c);
//        }
//		
//		System.out.println(letras);
//		
//		String palavraInvertida = "";
//        while (!letras.isEmpty()) {
//            palavraInvertida += letras.pop();
//        }
//        
//        System.out.println(palavra);
//        System.out.println(palavraInvertida);
		
		
		// 3. Simples Histórico de Navegação
		Stack<String> historicoNav = new Stack<>();
		
		String google = "https://www.google.com/search?q=google.com";
		String oracle = "oracle.com";
		String github = "github.com";
				
		historicoNav.push(google);
		historicoNav.push(oracle);
		historicoNav.push(github);
		
		System.out.println("Página atual: " + historicoNav.peek());
		
		historicoNav.pop(); 
		System.out.println("Página atual: " + historicoNav.peek());
		
		historicoNav.pop();
		System.out.println("Página atual: " + historicoNav.peek());
		
		
		// 4. Desempilhando Pratos
		Stack<Integer> pratos = new Stack<>();
		pratos.push(10);
		pratos.push(20);
		pratos.push(30);
		pratos.push(40);
		pratos.push(50);
		
		System.out.println("Prato retirado: " + pratos.pop());
		System.out.println("Prato retirado: " + pratos.pop());

		System.out.println("Prato no topo: " + pratos.peek());



	}

}
