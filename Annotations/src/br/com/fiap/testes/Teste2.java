package br.com.fiap.testes;

import br.com.fiap.annotations.Tabela;
import br.com.fiap.bean.Avestruz;

public class Teste2 {
	public static void main(String[] args) {
		Avestruz avestruz = new Avestruz();
		Tabela anotacao = avestruz.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + anotacao.nome());
	}
}
