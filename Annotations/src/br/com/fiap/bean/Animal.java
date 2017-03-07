package br.com.fiap.bean;

import br.com.fiap.annotations.Coluna;

public class Animal {
	
	@Coluna(nome="NM_ANIMAL")
	private String nome;
	
	@Coluna(nome="DS_ESPECIE")
	private String especie;
	
	public void andar(){
		System.out.println("Andando...");
	}
}
