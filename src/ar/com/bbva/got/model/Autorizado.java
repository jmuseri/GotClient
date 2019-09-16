package ar.com.bbva.got.model;

import java.util.Date;

public class Autorizado {
    public Autorizado(Integer id, Integer nroClienteEmpresa, String cuitEmpresa, String tipoDocumento,
			String nroDocumento, String nombre, String apellido, String usuAlta, Date fechaAlta, String usuModif,
			Date fechaModif) {
		super();
		this.id = id;
		this.nroClienteEmpresa = nroClienteEmpresa;
		this.cuitEmpresa = cuitEmpresa;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
		this.usuModif = usuModif;
		this.fechaModif = fechaModif;
	}

	public Autorizado() {
	}

	private Integer id;

    private Integer nroClienteEmpresa;
    
    private String cuitEmpresa;

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

	public Integer getNroClienteEmpresa() {
		return nroClienteEmpresa;
	}

	public void setNroClienteEmpresa(Integer nroClienteEmpresa) {
		this.nroClienteEmpresa = nroClienteEmpresa;
	}

	public String getCuitEmpresa() {
		return cuitEmpresa;
	}

	public void setCuitEmpresa(String cuitEmpresa) {
		this.cuitEmpresa = cuitEmpresa;
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
