package br.com.fiap.testes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotations.Coluna;
import br.com.fiap.bean.Animal;

public class Teste {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		//Recuperar atributos da classe Animal
		Field[] atributos = animal.getClass().getDeclaredFields();
		
		for (Field field : atributos) {
			Coluna anotacao = field.getAnnotation(Coluna.class);
			System.out.println("\nAtributo: " + field.getName() + "\nColuna: " + anotacao.nome());
		}
		
		System.out.println();

		//Recuperar m�todos da classe Animal
		Method[] metodos = animal.getClass().getDeclaredMethods();
		
		for (Method method : metodos) {
			System.out.println("Método: " + method.getName());
		}
	}
}
