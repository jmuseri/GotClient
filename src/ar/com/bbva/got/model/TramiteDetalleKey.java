package ar.com.bbva.got.model;

import java.io.Serializable;

public class TramiteDetalleKey implements Serializable {
    public TramiteDetalleKey(Integer tramiteId, TipoTramiteCampoKey tipoTramiteCampoId) {
		super();
		this.tramiteId = tramiteId;
		this.tipoTramiteCampoId = tipoTramiteCampoId;
	}

	private static final long serialVersionUID = 1L;

    private Integer tramiteId;

    private TipoTramiteCampoKey tipoTramiteCampoId;

    public TramiteDetalleKey() {
    }

    public TramiteDetalleKey(Integer tramiteId, Integer tipoTramiteId, Integer campoDisponibleId) {
        this.tramiteId = tramiteId;
        this.tipoTramiteCampoId = new TipoTramiteCampoKey(tipoTramiteId, campoDisponibleId);
    }

	public Integer getTramiteId() {
		return tramiteId;
	}

	public void setTramiteId(Integer tramiteId) {
		this.tramiteId = tramiteId;
	}

	public TipoTramiteCampoKey getTipoTramiteCampoId() {
		return tipoTramiteCampoId;
	}

	public void setTipoTramiteCampoId(TipoTramiteCampoKey tipoTramiteCampoId) {
		this.tipoTramiteCampoId = tipoTramiteCampoId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
