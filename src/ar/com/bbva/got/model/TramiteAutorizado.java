package ar.com.bbva.got.model;

import java.util.Date;

public class TramiteAutorizado {
    public TramiteAutorizado(TramiteAutorizadoKey id, Autorizado autorizado, String usuAlta, Date fechaAlta) {
		super();
		this.id = id;
		this.autorizado = autorizado;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
	}

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

}
