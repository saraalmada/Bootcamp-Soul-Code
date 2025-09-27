package aulas_elas;

import javax.persistence.EntityManager;
import java.util.List;

public class AutorDAOJPAImpl implements AutorDAO {
	
	private EntityManager em;
	
	public AutorDAOJPAImpl(EntityManager em ) {
		this.em = em;
	}

	@Override
	public void salvar(Autor autor) {
		em.getTransaction().begin();
		em.persist(autor);
		em.getTransaction().commit();

	}

	@Override
	public Autor buscarPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autor> ListarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Autor autor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarPorID(int id) {
		// TODO Auto-generated method stub

	}

}
