package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteRemove {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		Funcionario func = em.find(Funcionario.class, 1);
		
		em.remove(func);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		System.out.println("Usuário removido");
		
		System.exit(0);
	}
}
