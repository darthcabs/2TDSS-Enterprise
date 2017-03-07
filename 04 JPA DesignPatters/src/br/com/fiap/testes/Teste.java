package br.com.fiap.testes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		TimeDAO dao = new TimeDAOImpl(em);
		
		Time time = new Time();
		time.setNome("São Paulo Futebol Clube");
		time.setDataFundacao(new GregorianCalendar(1910, Calendar.APRIL, 6));
		time.setEstadio("Morumbi");
		
		dao.insert(time);
		em.close();
		System.exit(0);
	}
}
