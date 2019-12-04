package com.sa.bbva.got.client.service.funcional;

import com.sa.bbva.got.client.service.RestOperation;

public enum GotFuncionalEnum implements RestOperation {

	FUNCIONAL_AUTORIZADOS("/funcional/autorizado/list","GET","[Lar.com.bbva.got.dto.AutorizadoDTO;"),
	FUNCIONAL_AUTORIZADOS_ADD("/funcional/autorizado/add","POST","java.lang.Object"),
	FUNCIONAL_AUTORIZADOS_DELETE("/funcional/autorizado/{autorizadoId}/delete/","POST","java.lang.Object"),
	FUNCIONAL_AUTORIZADOS_SHOW("/funcional/autorizados/show/{tipoDocumento}/{numeroDocumento}","GET","ar.com.bbva.got.dto.AutorizadoDTO"),
	
	
	FUNCIONAL_TRAMITES_FINALIZAR("/funcional/tramite/{id}/finalizar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_GESTIONAR("/funcional/tramite/{id}/gestionar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_RECHAZAR("/funcional/tramite/{id}/rechazar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_ACTIVAR("/funcional/tramite/{id}/activar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_CANCELAR("/funcional/tramite/{id}/cancelar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_ELIMINAR("/funcional/tramite/{id}/eliminar","POST","java.lang.Object"),

	
	FUNCIONAL_TRAMITES_SHOW("/funcional/tramite/{id}","GET","ar.com.bbva.got.dto.TramiteDTO"),
	FUNCIONAL_TRAMITE_ADD("/funcional/tramite/add","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_DETALLE_UPDATE("/funcional/tramite/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_DETALLE_DELETE("/funcional/tramite/detalle/delete/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_DETALLE_ADD("/funcional/tramite/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"),
	
	FUNCIONAL_TRAMITES_LIST_BYAUTORIZADO("/funcional/tramite/listByAutorizado/{tipoDocumento}/{numeroDocumento}","GET","[Lar.com.bbva.got.dto.TramiteDTO;"),
	FUNCIONAL_TRAMITES_LIST_BYNROCLIENTE("/funcional/tramite/list/{nroClienteEmpresa}","GET","[Lar.com.bbva.got.dto.TramiteDTO;"),
	FUNCIONAL_TRAMITES_LIST_BYCUIT("/funcional/tramite/listByCuit/{cuit}","GET","[Lar.com.bbva.got.dto.TramiteDTO;");

	
	
	
	
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

	private GotFuncionalEnum(String url,String requestMethod, String responseClass) {
		this.requestMethod = requestMethod;
		this.url = url;
		this.responseClass = responseClass;
		
	}
}
