package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_GRUPO_AM")
@SequenceGenerator(name="seqGrupoAm", sequenceName="SQ_GRUPO_AM", allocationSize=1)
public class GrupoAm {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqGrupoAm")
	@Column(name="cd_grupo")
	private int codigo;
	
	@Column(name="nm_grupo", nullable=false, length=50)
	private String nome;
	
	public GrupoAm() {

	}

	public GrupoAm(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
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
}