package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "seqMedico", sequenceName = "SQ_T_MEDICO", allocationSize = 1)
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMedico")
	private int codigo;

	@Column(name = "NM_MEDICO", nullable = false, length = 100)
	private String nome;

	@Column(name = "DS_CRM", nullable = false)
	private String crm;

	@Lob
	@Column(name = "FL_FOTO")
	private byte[] foto;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO")
	private Calendar dataNascimento;

	@Column(name = "DS_SEXO")
	private Sexo sexo;

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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}