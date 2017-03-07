package br.com.fiap.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)				 // Anota��o estar� presente at� a execu��o
@Target({ElementType.FIELD, ElementType.METHOD}) // Anota��o somente para atributos ou m�todos
public @interface Coluna {
	String nome();
}
