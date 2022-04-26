package com.pruebaTecnica.demo.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "HORARIOENSA")
@XmlRootElement
public class HorarioEnSa implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "ID")
    @GeneratedValue(generator="seqHorEnSa") 
    @SequenceGenerator(name="seqHorEnSa",sequenceName="SEQ_HORARIOENSA", allocationSize=1)
	private long id;
	
	@JoinColumn(name = "EMPLEADO_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
	private Empleado idEmpleado;
	
	private Date fecha;
	
	private String horaSalida;
	
	private String horaEntrada;
	
	public HorarioEnSa() {}

	public HorarioEnSa(long id) {
		this.id = id;
	}

	public HorarioEnSa(long id, Empleado idEmpleado, Date fecha, String horaSalida, String horaEntrada) {
		this.id = id;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaEntrada = horaEntrada;
	}
	
	public long getId() {
		return id;
	}
    
	public void setId(long id) {
		this.id = id;
	}

	public Empleado getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Empleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
}
