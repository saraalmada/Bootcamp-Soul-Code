package aulas_elas;
import java.time.LocalDate;

import javax.persistence.*;

public class Aplicacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		AutorDAOJPAImpl autorDAO = new AutorDAOJPAImpl(em);
		
		// 1. Criar e salvar autor
//		Autor novoAutor = new Autor("Keylla", LocalDate.of(2010, 10, 30));
//		autorDAO.salvar(novoAutor);
//		System.out.println("Autor salvo: " + novoAutor.getNome());

		// 2. Buscar por ID
        Autor autor = new Autor();
        Autor autorBuscado = autorDAO.buscarPorID(autor.getId());
        System.out.println("Autor buscado: " + autorBuscado.getNome());

//		autorDAO.buscarPorID(4);
//		
//		autorDAO.ListarTodos();
//		
//		autorDAO.atualizar("Sara");
//		
//		autorDAO.deletarPorID(4);
		
		
	}

}
