package java_jdbc;

import java.util.List;

public interface ProdutoDAO {
	void inserir(Produto p);
	Produto buscarPorId(int id);
	List<Produto> listarTodos();
	void atualizar(Produto p);
	void deletar(int id);
}