package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqJogador", sequenceName="SQ_TB_JOGADOR")
@Table(name="TB_JOGADOR")
public class Jogador {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqJogador")
	@Column(name="cd_jogador")
	private int codigo;
	
	@Column(name="nm_jogador")
	private String nome;

	@Column(name="nr_jogador")
	private int numero;
	
	@Column(name="vl_altura")
	private float altura;
	
	@Column(name="ds_sexo")
	private Sexo sexo;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	public Jogador() {
	
	}

	public Jogador(String nome, int numero, float altura, Sexo sexo, Calendar dataNascimento) {
		this.nome = nome;
		this.numero = numero;
		this.altura = altura;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
	
	public Jogador(int codigo, String nome, int numero, float altura, Sexo sexo, Calendar dataNascimento) {
		this.codigo = codigo;
		this.nome = nome;
		this.numero = numero;
		this.altura = altura;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
