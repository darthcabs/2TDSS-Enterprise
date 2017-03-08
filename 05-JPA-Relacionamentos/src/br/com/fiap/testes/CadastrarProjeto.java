package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastrarProjeto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("CADASTRAR GRUPO");
		System.out.print("\tNome do grupo: ");
		String nomeGrupo = sc.next() + sc.nextLine();
		System.out.println("\nCADASTRAR PROJETO");
		System.out.print("\tNome do projeto: ");
		String nomeProjeto = sc.next() + sc.nextLine();
		Calendar dataEntrega = new GregorianCalendar(2017, 11, 20);
		System.out.print("\tNota: ");
		double notaProjeto = sc.nextDouble();
		System.out.print("\tObservações: ");
		String obsProjeto = sc.next() + sc.nextLine();

		GrupoAm grupo = new GrupoAm(0, nomeGrupo);
		ProjetoAm proj = new ProjetoAm(0, nomeProjeto, dataEntrega, notaProjeto, obsProjeto, grupo);

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ProjetoAmDAOImpl daoP = new ProjetoAmDAOImpl(em);
		GrupoAmDAOImpl daoG = new GrupoAmDAOImpl(em);
		
		try {
			daoG.insert(grupo);
			daoG.save();
			daoP.insert(proj);
			daoP.save();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}