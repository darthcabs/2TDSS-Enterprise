package br.com.fiap.bean;

import br.com.fiap.annotations.Tabela;

@Tabela(nome="T_AVESTRUZ")
public class Avestruz extends Animal {
	@Override
	public void andar(){
		System.out.println("Andando diferente...");
	}
}
