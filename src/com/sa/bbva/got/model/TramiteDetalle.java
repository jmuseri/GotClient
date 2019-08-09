package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TramiteDetalle implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private TramiteDetalleKey id;


    private String valor;


    private String usuAlta;


    private Date fechaAlta;

    private String usuModif;

    private Date fechaModif;

	public TramiteDetalleKey getId() {
		return id;
	}

	public void setId(TramiteDetalleKey id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
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
		builder.append("TramiteDetalle [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
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
