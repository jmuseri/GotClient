package com.sa.bbva.got.client.service.parametria;

import com.sa.bbva.got.client.service.RestOperation;

public enum GotParametriaEnum implements RestOperation {


	PARAMETRIA_MOTIVOS_RECHAZO("/parametria/motivoRechazo/list","GET","[Lar.com.bbva.got.dto.MotivoRechazoDTO;"),
	PARAMETRIA_TIPO_TRAMITES("/parametria/tipoTramite/list","GET","[Lar.com.bbva.got.dto.TipoTramiteDTO;"),

	PARAMETRIA_TIPO_TRAMITES_SHOW("/parametria/campoDisponible/listByTipoTramite/{tipoTramiteId}","GET","[Lar.com.bbva.got.dto.CampoDisponibleDTO;"),

	
;

	private String requestMethod;
	private String url;
	private String responseClass;

	public String getRequestMethod() {
		return requestMethod;
	}

	public String getUrl() {
		return url;
	}

	public String getResponseClass() {
		return responseClass;
	}

	private GotParametriaEnum(String url, String requestMethod, String responseClass) {
		this.requestMethod = requestMethod;
		this.url = url;
		this.responseClass = responseClass;

	}
}
