package com.sa.bbva.got.client.service.funcional;

import com.sa.bbva.got.client.service.RestOperation;

public enum GotFuncionalFuncionalEnum implements RestOperation {

	FUNCIONAL_AUTORIZADOS("/funcional/autorizados","GET","[Lar.com.bbva.got.dto.AutorizadoDTO;"),
	FUNCIONAL_MOTIVOS_RECHAZO("/funcional/motivosRechazo","GET","[Lar.com.bbva.got.dto.MotivoRechazoDTO;"),
	FUNCIONAL_AUTORIZADOS_ADD("/funcional/autorizados/add","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_AUTORIZADOS_DELETE("/funcional/tramite/{tramiteId}/autorizado/{autorizadoId}/delete/","POST","java.lang.Object"),
	FUNCIONAL_TIPO_TRAMITES("/funcional/tipoTramites","GET","[Lar.com.bbva.got.dto.TipoTramiteDTO;"),
	FUNCIONAL_TIPO_TRAMITES_SHOW("/funcional/tipoTramites/{id}/camposDisponibles","GET","[Lar.com.bbva.got.dto.CampoDisponibleDTO;"),
	FUNCIONAL_TRAMITES_SHOW("/funcional/tramites/{id}","GET","ar.com.bbva.got.dto.TramiteDTO"),
	FUNCIONAL_TRAMITES_FINALIZAR("/funcional/tramites/{id}/finalizar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_GESTIONAR("/funcional/tramites/{id}/gestionar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_RECHAZAR("/funcional/tramites/{id}/rechazar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_ACTIVAR("/funcional/tramites/{id}/activar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITE_ADD("/funcional/tramites/add","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_LISTAR("/funcional/tramites/listar","GET","[Lar.com.bbva.got.dto.TramiteDTO;"),
	FUNCIONAL_TRAMITES_LIST_BYNROCLIENTE("/funcional/tramites/list/{nroClienteEmpresa}","GET","[Lar.com.bbva.got.dto.TramiteDTO;"),
	FUNCIONAL_TRAMITES_LIST_BYCUIT("/funcional/tramites/listByCuit/{cuit}","GET","[Lar.com.bbva.got.dto.TramiteDTO;"),
	FUNCIONAL_TRAMITES_ELIMINAR("/funcional/tramites/{id}/eliminar","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_DETALLE_UPDATE("/funcional/tramites/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_DETALLE_DELETE("/funcional/tramites/detalle/delete/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"),
	FUNCIONAL_TRAMITES_DETALLE_ADD("/funcional/tramites/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object")
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

	private GotFuncionalFuncionalEnum(String url,String requestMethod, String responseClass) {
		this.requestMethod = requestMethod;
		this.url = url;
		this.responseClass = responseClass;
		
	}
}
