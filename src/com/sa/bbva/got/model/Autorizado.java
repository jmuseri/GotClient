package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Autorizado implements Serializable {
    @Override
	public String toString() {
		return "Autorizado [id=" + id + ", clienteId=" + clienteId + ", tipoDocumento=" + tipoDocumento
				+ ", nroDocumento=" + nroDocumento + ", nombre=" + nombre + ", apellido=" + apellido + ", usuAlta="
				+ usuAlta + ", fechaAlta=" + fechaAlta + ", usuModif=" + usuModif + ", fechaModif=" + fechaModif + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer clienteId;

    private String tipoDocumento;

    private String nroDocumento;

    private String nombre;

    private String apellido;

    private String usuAlta;

    private Date fechaAlta;

    private String usuModif;

    private Date fechaModif;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
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

	public String getUsuAlta() {
		return usuAlta;
	}

	public void setUsuAlta(String usuAlta) {
		this.usuAlta = usuAlta;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getUsuModif() {
		return usuModif;
	}

	public void setUsuModif(String usuModif) {
		this.usuModif = usuModif;
	}

	public Date getFechaModif() {
		return fechaModif;
	}

	public void setFechaModif(Date fechaModif) {
		this.fechaModif = fechaModif;
	}
}
