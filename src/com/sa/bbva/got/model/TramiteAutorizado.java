package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TramiteAutorizado implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TramiteAutorizadoKey id;

    private Autorizado autorizado;

    private String usuAlta;

    private Date fechaAlta;

	public TramiteAutorizadoKey getId() {
		return id;
	}

	public void setId(TramiteAutorizadoKey id) {
		this.id = id;
	}

	public Autorizado getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Autorizado autorizado) {
		this.autorizado = autorizado;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TramiteAutorizado [id=");
		builder.append(id);
		builder.append(", autorizado=");
		builder.append(autorizado);
		builder.append(", usuAlta=");
		builder.append(usuAlta);
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		builder.append("]");
		return builder.toString();
	}

}
