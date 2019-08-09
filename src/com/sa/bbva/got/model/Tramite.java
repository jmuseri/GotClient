package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tramite implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private TipoTramite tipoTramite;

    private Integer clienteId;

    private Set<TramiteAutorizado> autorizado;

    private Sector sectorInicio;

    private Sector sectorActual;

    private Set<TramiteDetalle> detalle;

    private String cuentaCobro;

    private EstadoTramite estado;

    private Date fechaFinalizacion;

    private Date fechaInicio;

    private Date fechaVencimiento;

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

	public TipoTramite getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(TipoTramite tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public Set<TramiteAutorizado> getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Set<TramiteAutorizado> autorizado) {
		this.autorizado = autorizado;
	}

	public Sector getSectorInicio() {
		return sectorInicio;
	}

	public void setSectorInicio(Sector sectorInicio) {
		this.sectorInicio = sectorInicio;
	}

	public Sector getSectorActual() {
		return sectorActual;
	}

	public void setSectorActual(Sector sectorActual) {
		this.sectorActual = sectorActual;
	}

	public Set<TramiteDetalle> getDetalle() {
		return detalle;
	}

	public void setDetalle(Set<TramiteDetalle> detalle) {
		this.detalle = detalle;
	}

	public String getCuentaCobro() {
		return cuentaCobro;
	}

	public void setCuentaCobro(String cuentaCobro) {
		this.cuentaCobro = cuentaCobro;
	}

	public EstadoTramite getEstado() {
		return estado;
	}

	public void setEstado(EstadoTramite estado) {
		this.estado = estado;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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
		builder.append("Tramite [id=");
		builder.append(id);
		builder.append(", tipoTramite=");
		builder.append(tipoTramite);
		builder.append(", clienteId=");
		builder.append(clienteId);
		builder.append(", autorizado=");
		builder.append(autorizado);
		builder.append(", sectorInicio=");
		builder.append(sectorInicio);
		builder.append(", sectorActual=");
		builder.append(sectorActual);
		builder.append(", detalle=");
		builder.append(detalle);
		builder.append(", cuentaCobro=");
		builder.append(cuentaCobro);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", fechaFinalizacion=");
		builder.append(fechaFinalizacion);
		builder.append(", fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaVencimiento=");
		builder.append(fechaVencimiento);
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
