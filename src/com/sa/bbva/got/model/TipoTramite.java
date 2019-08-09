package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TipoTramite implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer id;


    private String descripcion;


    private boolean cobraComision;

    private Comision comision;


    private boolean requiereDocumentacion;


    private boolean activo;


    private boolean autorizado;

    private Sector sectorInicial;

    private Set<TipoTramiteCampo> campos;

    private Long horasResolucion;

    private Long horasVencimiento;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCobraComision() {
		return cobraComision;
	}

	public void setCobraComision(boolean cobraComision) {
		this.cobraComision = cobraComision;
	}

	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public boolean isRequiereDocumentacion() {
		return requiereDocumentacion;
	}

	public void setRequiereDocumentacion(boolean requiereDocumentacion) {
		this.requiereDocumentacion = requiereDocumentacion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isAutorizado() {
		return autorizado;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	public Sector getSectorInicial() {
		return sectorInicial;
	}

	public void setSectorInicial(Sector sectorInicial) {
		this.sectorInicial = sectorInicial;
	}

	public Set<TipoTramiteCampo> getCampos() {
		return campos;
	}

	public void setCampos(Set<TipoTramiteCampo> campos) {
		this.campos = campos;
	}

	public Long getHorasResolucion() {
		return horasResolucion;
	}

	public void setHorasResolucion(Long horasResolucion) {
		this.horasResolucion = horasResolucion;
	}

	public Long getHorasVencimiento() {
		return horasVencimiento;
	}

	public void setHorasVencimiento(Long horasVencimiento) {
		this.horasVencimiento = horasVencimiento;
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
		builder.append("TipoTramite [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", cobraComision=");
		builder.append(cobraComision);
		builder.append(", comision=");
		builder.append(comision);
		builder.append(", requiereDocumentacion=");
		builder.append(requiereDocumentacion);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", autorizado=");
		builder.append(autorizado);
		builder.append(", sectorInicial=");
		builder.append(sectorInicial);
		builder.append(", campos=");
		builder.append(campos);
		builder.append(", horasResolucion=");
		builder.append(horasResolucion);
		builder.append(", horasVencimiento=");
		builder.append(horasVencimiento);
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
