package java_jdbc;

import java.sql.*;

public class Teste {

	public static void main(String[] args) throws SQLException {
			String url = "jdbc:mysql://localhost:3306/biblioteca";
			String user = "root";
			String senha = "";
			
			try {
				Connection conexao = DriverManager.getConnection(url, user, senha);
				
				Statement stmt = conexao.createStatement();
//				stmt.execute("CREATE DATABASE if not exists biblioteca");
//				System.out.println("Banco criado!");
				
//				String sql = "CREATE TABLE if not exists editoras (id INT PRIMARY KEY AUTO_INCREMENT,"
//						+ "  nome VARCHAR(100) NOT NULL,"
//						+ "  endereco VARCHAR(255)"
//						+ ")";
//				String sql = "CREATE TABLE if not exists autores (id INT PRIMARY KEY AUTO_INCREMENT,"
//						+ "  nome VARCHAR(100) NOT NULL,"
//						+ "  data_nascimento DATE"
//						+ ")";
//				String sql = "CREATE TABLE if not exists generos_literarios (id INT PRIMARY KEY AUTO_INCREMENT,"
//						+ "  nome VARCHAR(100) NOT NULL"
//						+ ")";
//				String sql = "CREATE TABLE if not exists livros (id INT PRIMARY KEY AUTO_INCREMENT,"
//						+ " titulo VARCHAR(200) NOT NULL,"
//						+ "  ano_publicacao INT,"
//						+ "  editora_id INT,"
//						+ "  autor_id INT,"
//						+ "  genero_id INT,"
//						+ "  FOREIGN KEY (editora_id) REFERENCES editoras(id),"
//						+ "  FOREIGN KEY (autor_id) REFERENCES autores(id),"
//						+ "  FOREIGN KEY (genero_id) REFERENCES generos_literarios(id)"
//						+ ")";
				
//				PreparedStatement pstmt = conexao.prepareStatement();
				// PERGUNTAR
//				String sql = "DELETE FROM autores WHERE id = 1"; 
//				String sql = "SELECT l.titulo, a.nome AS autor, e.nome AS editora, g.nome AS genero "
//						+ "FROM livros l "
//						+ "INNER JOIN autores a ON l.autor_id = a.id "
//						+ "INNER JOIN editoras e ON l.editora_id = e.id "
//						+ "INNER JOIN generos_literarios g ON l.genero_id = g.id";
//				
//				ResultSet rs = stmt.executeQuery(sql);
//				
//				while (rs.next()) {
//					System.out.println(
//							rs.getString("titulo") + " | " +
//					        rs.getString("autor") + " | " +
//					        rs.getString("editora") + " | " +
//					        rs.getString("genero")
//					);
//				}
				
//				String sql = "SELECT nome, data_nascimento "
//						+ "FROM autores "
//						+ "WHERE YEAR(data_nascimento) < 1990";
//				
//				ResultSet rs = stmt.executeQuery(sql);
//				
//				while (rs.next()) {
//					System.out.println(
//							rs.getString("nome") + " | " +
//					        rs.getString("data_nascimento")
//					);
//				}
				
				String sql = "SELECT titulo, ano_publicacao, e.nome "
						+ "FROM livros l "
						+ "INNER JOIN editoras e ON l.editora_id = e.id";
				
				ResultSet rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.println(
							rs.getString("titulo") + " | " +
					        rs.getString("ano_publicacao") + " | " +
					        rs.getString("nome")
					);
				}
				

//				stmt.execute(sql);
//				System.out.println("Tabela criada!");
				
				conexao.close();
				
			} catch (Exception e) {
				System.out.println("Deu errado pq? " + e);
			}
			
			
		}

}
