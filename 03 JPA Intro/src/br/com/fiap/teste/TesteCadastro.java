package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Sexo;

public class TesteCadastro {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("David Cardoso", Sexo.MASCULINO, new GregorianCalendar(1986,Calendar.APRIL,6), Calendar.getInstance());
		func.setChaveAcesso(1234);
		
		// Obter uma instância de entityManager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		em.persist(func);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Funcionário cadastrado");
		System.exit(0);
	}
}