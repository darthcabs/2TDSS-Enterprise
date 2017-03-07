package br.com.fiap.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)				 // Anotação estará presente até a execução
@Target({ElementType.FIELD, ElementType.METHOD}) // Anotação somente para atributos ou métodos
public @interface Coluna {
	String nome();
}
