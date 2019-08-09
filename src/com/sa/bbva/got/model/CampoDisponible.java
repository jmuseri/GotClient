package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CampoDisponible implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
    private String nombre;
    private String descripcion;
    private String tipoDato;
    private boolean activo;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CampoDisponible [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", tipoDato=");
		builder.append(tipoDato);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", usuAlta=");
		builder.append(usuAlta);
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		builder.append(", usuModif=");
		builder.append(usuModif);
		builder.append(", fechaModif=");
		builder.append(fechaModif);
		builder.append("]");
		return builder.toString();
	}
}
