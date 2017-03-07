package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;

public class TesteRefresh {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();

		Funcionario func = em.find(Funcionario.class, 1);
		
		System.out.println("Nome: " + func.getNome());
		func.setNome("Kevin");
		System.out.println("Nome alterado: " + func.getNome());
		
		em.refresh(func);
		System.out.println("Nome refreshed: " + func.getNome());
		
		em.close();
		System.exit(0);
	}
}
