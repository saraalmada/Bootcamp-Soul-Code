package aulas_elas;
import java.time.LocalDate;

import javax.persistence.*;

public class Aplicacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		AutorDAOJPAImpl autorDAO = new AutorDAOJPAImpl(em);
		
		Autor novoAutor = new Autor("Machado de Assis", LocalDate.of(1940, 6, 10));
		autorDAO.salvar(novoAutor);

	}

}
