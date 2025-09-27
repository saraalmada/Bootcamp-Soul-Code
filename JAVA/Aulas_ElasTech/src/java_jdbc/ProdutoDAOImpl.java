package java_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProdutoDAOImpl implements ProdutoDAO {
	private Connection conexao;
	
	public ProdutoDAOImpl (Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void inserir(Produto p) {
		String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, p.getNome());
            pstmt.setDouble(2, p.getPreco());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Produto buscarPorId(int id) {
		String sql = "SELECT nome, preco FROM produtos WHERE id = ?" ;
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDouble("preco")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return null;
	}

	@Override
	public List<Produto> listarTodos() {
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM produtos";
		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
                produtos.add(new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDouble("preco")
                ));
            }
			
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return produtos;
	}

	@Override
	public void atualizar(Produto p) {
		String sql = "UPDATE produtos SET nome = ?, preco = ? WHERE id = ?" ;
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, p.getNome());
            pstmt.setDouble(2, p.getPreco());
            pstmt.setInt(3, p.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void deletar(int id) {
		String sql = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	
	
}
