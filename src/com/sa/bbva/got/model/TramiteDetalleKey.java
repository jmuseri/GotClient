package com.sa.bbva.got.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TramiteDetalleKey implements Serializable {
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

}
