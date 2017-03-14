package br.com.fiap.testes;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscaGrupoTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Buscar grupo por código: ");
		int codGrupo = sc.nextInt();
		sc.close();
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		GrupoAmDAOImpl daoG = new GrupoAmDAOImpl(em);
		
		GrupoAm grupo = daoG.findById(codGrupo);
		em.close();
		
		System.out.println("Nome do grupo: " + grupo.getNome());
		System.out.println("\nNome do projeto: " + grupo.getProjeto().getNome());
		System.out.println("Data de entrega do projeto: " + grupo.getProjeto().getDataEntrega().getTime());
		System.exit(0);
	}
}
