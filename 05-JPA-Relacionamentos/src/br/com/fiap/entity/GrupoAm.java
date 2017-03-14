package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GRUPO_AM")
@SequenceGenerator(name = "seqGrupoAm", sequenceName = "SQ_GRUPO_AM", allocationSize = 1)
public class GrupoAm {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGrupoAm")
	@Column(name = "cd_grupo")
	private int codigo;

	@Column(name = "nm_grupo", nullable = false, length = 50)
	private String nome;

	//Nome do atributo que mapeia o relacionamento, na classe ProjetoAm
	@OneToOne(mappedBy = "grupo", fetch = FetchType.LAZY) 
	private ProjetoAm projeto;
	
	@OneToMany(mappedBy="grupo")
	private List<Aluno> alunos;

	public GrupoAm() {

	}

	public GrupoAm(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public GrupoAm(int codigo, String nome, ProjetoAm projeto) {
		this.codigo = codigo;
		this.nome = nome;
		this.projeto = projeto;
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

	public ProjetoAm getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoAm projeto) {
		this.projeto = projeto;
	}
}