package br.com.fiap.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_FUNCIONARIO")
@SequenceGenerator(name="seqFunc", sequenceName="SQ_TB_FUNCIONARIO", allocationSize=1)
public class Funcionario {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqFunc")
	@Column(name="CD_FUNCIONARIO")
	private int codigo;
	
	@Column(name="NM_FUNCIONARIO", nullable=false, length=150)
	private String nome;
	
	@Column(name="DT_NASC", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataNasc;
	
	@Column(name="DT_ADMISSAO", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataAdm;
	
	@Transient // Não será mapeado para o banco
	private int chaveAcesso;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	private Sexo sexo;
	
	public Funcionario() {

	}

	public Funcionario(String nome, Sexo sexo, Calendar dataNasc, Calendar dataAdm) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.dataAdm = dataAdm;
		this.sexo = sexo;
	}
	
	public Funcionario(int codigo, String nome, Calendar dataNasc, Calendar dataAdm, int chaveAcesso, byte[] foto,
			Sexo sexo) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.dataAdm = dataAdm;
		this.chaveAcesso = chaveAcesso;
		this.foto = foto;
		this.sexo = sexo;
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

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Calendar getDataAdm() {
		return dataAdm;
	}

	public void setDataAdm(Calendar dataAdm) {
		this.dataAdm = dataAdm;
	}

	public int getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(int chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
