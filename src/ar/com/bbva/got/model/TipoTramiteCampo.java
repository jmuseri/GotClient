package ar.com.bbva.got.model;

import java.util.Date;

public class TipoTramiteCampo {

    public TipoTramiteCampo(TipoTramiteCampoKey id, CampoDisponible campoDisponible, boolean obligatorio,
			boolean activo, String nombre, String leyenda, String usuAlta, Date fechaAlta, String usuModif,
			Date fechaModif) {
		super();
		this.id = id;
		this.campoDisponible = campoDisponible;
		this.obligatorio = obligatorio;
		this.activo = activo;
		this.nombre = nombre;
		this.leyenda = leyenda;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
		this.usuModif = usuModif;
		this.fechaModif = fechaModif;
	}

	public TipoTramiteCampo() {
		// TODO Auto-generated constructor stub
	}

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

}
