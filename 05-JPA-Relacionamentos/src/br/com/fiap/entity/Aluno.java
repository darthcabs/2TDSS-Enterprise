package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name = "seqAluno", sequenceName = "SQ_TB_ALUNO", allocationSize = 1)
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAluno")
	@Column(name="nr_rm")
	private int rm;
	
	@Column(name="nm_aluno", nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="cd_grupo")
	private GrupoAm grupo;
	
	public Aluno() {

	}

	public Aluno(int rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}
	
	public int getRm() {
		return rm;
	}
	
	public void setRm(int rm) {
		this.rm = rm;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}
}