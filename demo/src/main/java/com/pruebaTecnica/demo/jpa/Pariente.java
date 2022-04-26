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
@Table(name = "PARIENTE")
@XmlRootElement
public class Pariente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "ID")
    @GeneratedValue(generator="seqPariente") 
    @SequenceGenerator(name="seqPariente",sequenceName="SEQ_PARIENTE", allocationSize=1)
	private long id;
	
	@JoinColumn(name = "EMPLEADO_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
	private Empleado idEmpleado;
	
	private String nombre;
	
	private String apellido;
	
	private String telefono;
	
	private String correo;
	
	private Date fechaNacimiento;
	
	private String tipoDocumento;
	
	private String documento;
	
	private String direccion;

	public Pariente() {
	}

	public Pariente(long id) {
		this.id = id;
	}

	public Pariente(long id, Empleado idEmpleado, String nombre, String apellido, String telefono, String correo,
			Date fechaNacimiento, String tipoDocumento, String documento, String direccion) {
		this.id = id;
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.direccion = direccion;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
