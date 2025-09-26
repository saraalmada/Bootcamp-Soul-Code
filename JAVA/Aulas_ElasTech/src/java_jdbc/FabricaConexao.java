package java_jdbc;

import java.sql.*;

public class FabricaConexao {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/lojinha";
		String user = "root";
		String senha = "";
		
		try {
			Connection conexao = DriverManager.getConnection(url, user, senha);
			Statement stmt = conexao.createStatement();
			
			
//			stmt.execute("CREATE DATABASE IF NOT EXISTS lojinha");
			
			String sql = "CREATE TABLE IF NOT EXISTS produtos ("
					+ "id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
					+ "nome VARCHAR(100) NOT NULL,"
					+ "preco DECIMAL(10,2) NOT NULL"
					+ ")";
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			pstmt.executeUpdate();
			
			System.out.println("Deu certo!");
			
			conexao.close();
		} catch (Exception e) {
			System.out.println("Deu errado pq: " + e);
		}
	}
}
