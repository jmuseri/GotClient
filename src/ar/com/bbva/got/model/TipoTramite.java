package ar.com.bbva.got.model;

import java.util.Date;
import java.util.Set;

public class TipoTramite {
    public TipoTramite(Integer id, String descripcion, boolean cobraComision, Comision comision,
			boolean requiereDocumentacion, boolean activo, boolean autorizado, Sector sectorInicial,
			Set<TipoTramiteCampo> campos, Long horasResolucion, Long horasVencimiento, String usuAlta, Date fechaAlta,
			String usuModif, Date fechaModif) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cobraComision = cobraComision;
		this.comision = comision;
		this.requiereDocumentacion = requiereDocumentacion;
		this.activo = activo;
		this.autorizado = autorizado;
		this.sectorInicial = sectorInicial;
		this.campos = campos;
		this.horasResolucion = horasResolucion;
		this.horasVencimiento = horasVencimiento;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
		this.usuModif = usuModif;
		this.fechaModif = fechaModif;
	}

	public TipoTramite() {
		// TODO Auto-generated constructor stub
	}

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

}
