package com.sa.bbva.got.client.service;

public enum GotOperationsEnum {

	AUTORIZADO_ADD("/funcional/autorizado/add","POST","java.lang.Object"),
	AUTORIZADO_DELETE("/funcional/autorizado/delete/{id}","POST","java.lang.Object"),
	AUTORIZADO_LIST("/funcional/autorizado/list","GET","[Lcom.sa.bbva.got.model.Autorizado;"),
	AUTORIZADO_SHOW("/funcional/autorizado/show/{id}","GET","com.sa.bbva.got.model.Autorizado"),
	AUTORIZADO_UPDATE("/funcional/autorizado/update/{id}","POST","java.lang.Object"),
	
	TRAMITE_ADD("/funcional/tramite/add","POST","java.lang.Object"), //Add a tramite
	TRAMITE_AUTORIZADO_ADD("/funcional/tramite/autorizado/add","POST","java.lang.Object"), //Add a tramiteAutorizado
	TRAMITE_AUTORIZADO_DELETE ("/funcional/tramite/autorizado/delete/{tramiteId}/{autorizadoId}","POST","java.lang.Object"),//Delete a tramiteAutorizado
	TRAMITE_AUTORIZADO_LIST("/funcional/tramite/autorizado/list/{id}","GET","[Lcom.sa.bbva.got.model.TramiteAutorizado;"), //Search a tramiteAutorizado with a Tramite ID
	TRAMITE_DELETE ("/funcional/tramite/delete/{id}","POST","java.lang.Object"), //Delete a tramite
	TRAMITE_DETALLE_ADD("/funcional/tramite/detalle/add","POST","java.lang.Object"), //Add a tramiteDetalle
	TRAMITE_DETALLE_DELETE ("/funcional/tramite/detalle/delete/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"), //Delete a tramiteDetalle
	TRAMITE_DETALLE_LIST("/funcional/tramite/detalle/list","GET","[Lcom.sa.bbva.got.model.TramiteDetalle;"), //View a list of available tramiteDetalle
	TRAMITE_DETALLE_LIST_BYID ("/funcional/tramite/detalle/list/{id}","GET","[Lcom.sa.bbva.got.model.TramiteDetalle;"), //Search a tramiteDetalle with a Tramite ID
	TRAMITE_DETALLE_SHOW ("/funcional/tramite/detalle/show/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","com.sa.bbva.got.model.TramiteDetalle"), //Search a tramiteDetalle with an ID
	TRAMITE_DETALLE_UPDATE("/funcional/tramite/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"), //Update a tramiteDetalle
	TRAMITE_LIST("/funcional/tramite/list","GET","[Lcom.sa.bbva.got.model.Tramite;"), //View a list of available tramite
	TRAMITE_SHOW("/funcional/tramite/show/{id}","GET","com.sa.bbva.got.model.Tramite"), //Search a tramite with an ID
	TRAMITE_UPDATE("/funcional/tramite/update/{id}","POST","java.lang.Object"); //Update a tramite

	
	
	
	private String requestMethod;
	private String url;
	private String responseClass;
	
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getResponseClass() {
		return responseClass;
	}
	public void setResponseClass(String responseClass) {
		this.responseClass = responseClass;
	}

	private GotOperationsEnum(String url,String requestMethod, String responseClass) {
		this.requestMethod = requestMethod;
		this.url = url;
		this.responseClass = responseClass;
		
	}
}
