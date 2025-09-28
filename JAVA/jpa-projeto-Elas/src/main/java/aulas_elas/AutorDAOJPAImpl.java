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
		return em.find(Autor.class, id);
	}

	@Override
	public List<Autor> ListarTodos() {
		return em.createQuery("SELECT a FROM Autor a", Autor.class)
                .getResultList();
	}

	@Override
	public void atualizar(Autor autor) {
		em.getTransaction().begin();
		em.merge(autor); 
		em.getTransaction().commit();

	}

	@Override
	public void deletarPorID(int id) {
		Autor autor = em.find(Autor.class, id);
		if (autor != null) {
			em.getTransaction().begin();
			em.remove(autor);
			em.getTransaction().commit();
		}
	}

}
