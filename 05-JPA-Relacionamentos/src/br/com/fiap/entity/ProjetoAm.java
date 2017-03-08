package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="seqProjetoAm", sequenceName="SQ_TB_PROJETO_AM", allocationSize=1)
public class ProjetoAm {
	
	@Id
	@Column(name="cd_projeto")
	@GeneratedValue(generator="seqProjetoAm", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_projeto", nullable=false, length=100)
	private String nome;
	
	@Column(name="dt_entrega", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataEntrega;
	
	@Column(name="vl_nota", nullable=true)
	private double nota;
	
	@Column(name="ds_observacoes", nullable=true)
	private String observacoes;
	
	@OneToOne
	@JoinColumn(name="FK_PROJETO_GRUPO")
	private GrupoAm grupo;
	
	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}

	public ProjetoAm() {

	}

	public ProjetoAm(int codigo, String nome, Calendar dataEntrega, double nota, String observacoes, GrupoAm grupo) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataEntrega = dataEntrega;
		this.nota = nota;
		this.observacoes = observacoes;
		this.grupo = grupo;
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

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}