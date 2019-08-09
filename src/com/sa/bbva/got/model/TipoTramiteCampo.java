package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TipoTramiteCampo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TipoTramiteCampoKey id;

    private CampoDisponible campoDisponible;

    private boolean obligatorio;

    private boolean activo;

    private String nombre;

    private String leyenda;

    private String usuAlta;

    private Date fechaAlta;

    private String usuModif;

    private Date fechaModif;

	public TipoTramiteCampoKey getId() {
		return id;
	}

	public void setId(TipoTramiteCampoKey id) {
		this.id = id;
	}

	public CampoDisponible getCampoDisponible() {
		return campoDisponible;
	}

	public void setCampoDisponible(CampoDisponible campoDisponible) {
		this.campoDisponible = campoDisponible;
	}

	public boolean isObligatorio() {
		return obligatorio;
	}

	public void setObligatorio(boolean obligatorio) {
		this.obligatorio = obligatorio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
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
		builder.append("TipoTramiteCampo [id=");
		builder.append(id);
		builder.append(", campoDisponible=");
		builder.append(campoDisponible);
		builder.append(", obligatorio=");
		builder.append(obligatorio);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", leyenda=");
		builder.append(leyenda);
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
