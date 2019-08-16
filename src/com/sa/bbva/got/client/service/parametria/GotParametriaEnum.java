package com.sa.bbva.got.client.service.parametria;

import com.sa.bbva.got.client.service.RestOperation;

public enum GotParametriaEnum implements RestOperation {

	CAMPODISPONIBLE_ADD("/parametria/campoDisponible/add", "POST", "java.lang.Object"),
	CAMPODISPONIBLE_DELETE("/parametria/campoDisponible/delete/{id}", "POST", "java.lang.Object"),
	CAMPODISPONIBLE_LIST("/parametria/campoDisponible/list", "GET", "[Lcom.sa.bbva.got.model.CampoDisponible;"),
	CAMPODISPONIBLE_SHOW("/parametria/campoDisponible/show/{id}", "GET", "com.sa.bbva.got.model.CampoDisponible"),
	CAMPODISPONIBLE_UPDATE("/parametria/campoDisponible/update/{id}", "POST", "java.lang.Object"),

	COMISION_ADD("/parametria/comision/add", "POST", "java.lang.Object"),
	COMISION_DELETE("/parametria/comision/delete/{id}", "POST", "java.lang.Object"),
	COMISION_LIST("/parametria/comision/list", "GET", "[Lcom.sa.bbva.got.model.Comision;"),
	COMISION_SHOW("/parametria/comision/show/{id}", "GET", "com.sa.bbva.got.model.Comision"),
	COMISION_UPDATE("/parametria/comision/update/{id}", "POST", "java.lang.Object"),

	ESTADOTRAMITE_ADD("/parametria/estadoTramite/add", "POST", "java.lang.Object"),
	ESTADOTRAMITE_DELETE("/parametria/estadoTramite/delete/{id}", "POST", "java.lang.Object"),
	ESTADOTRAMITE_LIST("/parametria/estadoTramite/list", "GET", "[Lcom.sa.bbva.got.model.EstadoTramite;"),
	ESTADOTRAMITE_SHOW("/parametria/estadoTramite/show/{id}", "GET", "com.sa.bbva.got.model.EstadoTramite"),
	ESTADOTRAMITE_UPDATE("/parametria/estadoTramite/update/{id}", "POST", "java.lang.Object"),

	SECTOR_ADD("/parametria/sector/add", "POST", "java.lang.Object"),
	SECTOR_DELETE("/parametria/sector/delete/{id}", "POST", "java.lang.Object"),
	SECTOR_LIST("/parametria/sector/list", "GET", "[Lcom.sa.bbva.got.model.Sector;"),
	SECTOR_SHOW("/parametria/sector/show/{id}", "GET", "com.sa.bbva.got.model.Sector"),
	SECTOR_UPDATE("/parametria/sector/update/{id}", "POST", "java.lang.Object"),

	TIPOTRAMITE_ADD("/parametria/tipoTramite/add", "POST", "java.lang.Object"),
	TIPOTRAMITECAMPO_ADD("/parametria/tipoTramite/campoDisponible/add", "POST", "java.lang.Object"),
	TIPOTRAMITECAMPO_DELETE("/parametria/tipoTramite/campoDisponible/delete/{tipoTramiteid}/{campoDisponible}", "POST", "java.lang.Object"),
	TIPOTRAMITECAMPO_LIST("/parametria/tipoTramite/campoDisponible/list", "GET", "[Lcom.sa.bbva.got.model.TipoTramiteCampo;"),
	TIPOTRAMITECAMPOID_LIST("/parametria/tipoTramite/campoDisponible/list/{id}", "GET", "[Lcom.sa.bbva.got.model.TipoTramiteCampo;"),
	TIPOTRAMITECAMPO_UPDATE("/parametria/tipoTramite/campoDisponible/update/{tipoTramiteid}/{campoDisponibleId}", "POST", "java.lang.Object"),
	TIPOTRAMITECOMISION_ADD("/parametria/tipoTramite/comision/update", "POST", "java.lang.Object"),
	TIPOTRAMITECOMISION_DELETE("/parametria/tipoTramite/comision/delete/{id}", "POST", "java.lang.Object"),
	TIPOTRAMITECOMISION_SHOW("/parametria/tipoTramite/comision/show/{id}", "GET", "com.sa.bbva.got.model.Comision"),
	TIPOTRAMITE_DELETE("/parametria/tipoTramite/delete/{id}", "POST", "java.lang.Object"),
	TIPOTRAMITE_LIST("/parametria/tipoTramite/list", "GET", "[Lcom.sa.bbva.got.model.TipoTramite;"),
	TIPOTRAMITE_SHOW("/parametria/tipoTramite/show/{id}", "GET", "com.sa.bbva.got.model.TipoTramite"),
	TIPOTRAMITE_UPDATE("/parametria/tipoTramite/update/{id}", "POST", "java.lang.Object");

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
