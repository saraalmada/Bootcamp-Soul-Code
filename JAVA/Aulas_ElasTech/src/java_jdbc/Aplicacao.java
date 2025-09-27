package java_jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Aplicacao {

	public static void main(String[] args) {
		Connection conexao = (Connection) new FabricaConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAOImpl(conexao);
		
		Produto produto1 = new Produto("Blusa", 89.90);
		produtoDAO.inserir(produto1);
		Produto produto2 = new Produto("Calça", 159.90);
		produtoDAO.inserir(produto2);
		Produto produto3 = new Produto("Vestido", 219.90);
		produtoDAO.inserir(produto3);
		System.out.println("Produtos inseridos!");
		
		Produto buscado = produtoDAO.buscarPorId(2);
        System.out.println("Buscado: " + buscado);
		
        System.out.println("Lista de produtos:");
        produtoDAO.listarTodos().forEach(System.out::println);

        Produto pAtualizado = new Produto(2, "Calça jeans", 4500.0);
        produtoDAO.atualizar(pAtualizado);
        System.out.println("Produto atualizado!");
        
        produtoDAO.deletar(1);
        System.out.println("Produto deletado!");
        
        try {
        	if (conexao != null) conexao.close();
        } catch (SQLException e) {
        	e.printStackTrace();
        }

	}

}
