package ar.com.bbva.got.model;

import java.util.Date;

public class Sector {
    
    public Sector(SectorKey id, String descripcion, boolean activo, String usuAlta, Date fechaAlta, String usuModif,
			Date fechaModif) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.activo = activo;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
		this.usuModif = usuModif;
		this.fechaModif = fechaModif;
	}
	public Sector() {

	}
	
	private SectorKey id;
    private String descripcion;
    private boolean activo;
    private String usuAlta;
    private Date fechaAlta;
    private String usuModif;
    private Date fechaModif;
	public SectorKey getId() {
		return id;
	}
	public void setId(SectorKey id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

}
