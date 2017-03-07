package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Sexo;

public class TesteAlterar {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();

		Funcionario func = em.find(Funcionario.class, 1);
		
		func.setNome("João Feijão");
		func.setSexo(Sexo.FEMININO);
		
		em.merge(func);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		func = em.find(Funcionario.class, 1);
		
		em.close();
		
		System.out.println("Funcionário alterado.");
		System.out.println("\tNome: " + func.getNome());
		System.out.println("\tSexo: " + func.getSexo());
		System.exit(0);
	}
}