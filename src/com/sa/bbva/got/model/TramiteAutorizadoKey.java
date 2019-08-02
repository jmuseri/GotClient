package com.sa.bbva.got.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TramiteAutorizadoKey implements Serializable {
    private static final long serialVersionUID = 1L;

    Integer tramiteId;

    Integer autorizadoId;

    public TramiteAutorizadoKey() {
    }

    public TramiteAutorizadoKey(Integer tramiteId, Integer autorizadoId) {
        this.tramiteId = tramiteId;
        this.autorizadoId = autorizadoId;
    }

	public Integer getTramiteId() {
		return tramiteId;
	}

	public void setTramiteId(Integer tramiteId) {
		this.tramiteId = tramiteId;
	}

	public Integer getAutorizadoId() {
		return autorizadoId;
	}

	public void setAutorizadoId(Integer autorizadoId) {
		this.autorizadoId = autorizadoId;
	}
}
