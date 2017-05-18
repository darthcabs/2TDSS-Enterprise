package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(ConsultaPK.class)
public class Consulta {
	@Id
	@Column(name = "DT_CONSULTA")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;

	@Id
	@JoinColumn(name = "CD_PACIENTE")
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Paciente paciente;
	
	@Id
	@ManyToOne
	@JoinColumn(name="CD_MEDICO")
	private Medico medico;

	@Column(name = "DS_SINTOMAS", nullable = false, length = 855)
	private String sintomas;
}