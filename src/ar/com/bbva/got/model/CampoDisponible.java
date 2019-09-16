package ar.com.bbva.got.model;

import java.util.Date;

public class CampoDisponible {
    public CampoDisponible(Integer id, String nombre, String descripcion, String tipoDato, boolean activo,
			String usuAlta, Date fechaAlta, String usuModif, Date fechaModif) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoDato = tipoDato;
		this.activo = activo;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
		this.usuModif = usuModif;
		this.fechaModif = fechaModif;
	}
	public CampoDisponible() {
		// TODO Auto-generated constructor stub
	}
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
}
