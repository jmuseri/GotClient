package ar.com.bbva.got.model;

import java.io.Serializable;

public class TipoTramiteCampoKey implements Serializable {
    private static final long serialVersionUID = 1L;

    Integer tipoTramiteId;

    Integer campoDisponibleId;

    public TipoTramiteCampoKey() {
    }

    public TipoTramiteCampoKey(Integer tipoTramiteId, Integer campoDisponibleId) {
        this.tipoTramiteId = tipoTramiteId;
        this.campoDisponibleId = campoDisponibleId;
    }

	public Integer getTipoTramiteId() {
		return tipoTramiteId;
	}

	public void setTipoTramiteId(Integer tipoTramiteId) {
		this.tipoTramiteId = tipoTramiteId;
	}

	public Integer getCampoDisponibleId() {
		return campoDisponibleId;
	}

	public void setCampoDisponibleId(Integer campoDisponibleId) {
		this.campoDisponibleId = campoDisponibleId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
