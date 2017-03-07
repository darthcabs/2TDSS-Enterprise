package br.com.fiap.entity;

import java.util.Calendar;

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

@Entity
@Table(name="TB_EMPRESA")
@SequenceGenerator(name="seqEmpresa", sequenceName="SQ_TB_EMPRESA", allocationSize=1)
public class Empresa {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEmpresa")
	@Column(name="CD_EMPRESA")
	private int codigo;
	
	@Column(name="NM_EMPRESA", length=100, nullable=false)
	private String nome;
	
	@Column(name="NR_CNPJ", length=16, nullable=false)
	private String cnpj;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_FUNDACAO")
	private Calendar dataFundacao;
	
	@Column(name="DS_ENDERECO", length=300)
	private String endereco;
	
	@Column(name="VL_FATURAMENTO")
	private double faturamento;
	
	@Lob
	@Column(name="FL_LOGO")
	private byte[] logo;
	
	@Column(name="NR_TELEFONE")
	private String telefone;
	
	@Column(name="DS_STATUS")
	private Status status;

	public Empresa() {
		
	}

	public Empresa(int codigo, String nome, String cnpj, Calendar dataFundacao, String endereco, double faturamento,
			byte[] logo, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.endereco = endereco;
		this.faturamento = faturamento;
		this.logo = logo;
		this.telefone = telefone;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}