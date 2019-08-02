package com.museri;

public enum GotOperationsEnum {

	AUTORIZADO_ADD("/funcional/autorizado/add","POST"),
	AUTORIZADO_DELETE("/funcional/autorizado/delete/{id}","POST"),
	AUTORIZADO_LIST("/funcional/autorizado/list","GET"),
	AUTORIZADO_SHOW("/funcional/autorizado/show/{id}","GET"),
	AUTORIZADO_UPDATE("/funcional/autorizado/update/{id}","POST"),
	
	TRAMITE_ADD("/funcional/tramite/add","POST"), //Add a tramite
	TRAMITE_AUTORIZADO_ADD("/funcional/tramite/autorizado/add","POST"), //Add a tramiteAutorizado
	TRAMITE_AUTORIZADO_DELETE ("/funcional/tramite/autorizado/delete/{tramiteId}/{autorizadoId}}","POST"),//Delete a tramiteAutorizado
	TRAMITE_AUTORIZADO_LIST("/funcional/tramite/autorizado/list/{id}","GET"), //Search a tramiteAutorizado with a Tramite ID
	TRAMITE_DELETE ("/funcional/tramite/delete/{id}","POST"), //Delete a tramite
	TRAMITE_DETALLE_ADD("/funcional/tramite/detalle/add","POST"), //Add a tramiteDetalle
	TRAMITE_DETALLE_DELETE ("/funcional/tramite/detalle/delete/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST"), //Delete a tramiteDetalle
	TRAMITE_DETALLE_LIST("/funcional/tramite/detalle/list","GET"), //View a list of available tramiteDetalle
	TRAMITE_DETALLE_LIST_BYID ("/funcional/tramite/detalle/list/{id}","GET"), //Search a tramiteDetalle with a Tramite ID
	TRAMITE_DETALLE_SHOW ("/funcional/tramite/detalle/show/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST"), //Search a tramiteDetalle with an ID
	TRAMITE_DETALLE_UPDATE("/funcional/tramite/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST"), //Update a tramiteDetalle
	TRAMITE_LIST("/funcional/tramite/list","GET"), //View a list of available tramite
	TRAMITE_SHOW("/funcional/tramite/show/{id}","GET"), //Search a tramite with an ID
	TRAMITE_UPDATE("/funcional/tramite/update/{id}","POST"); //Update a tramite

	
	
	
	private String requestMethod;
	private String url;
	
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
	
	private GotOperationsEnum(String url,String requestMethod) {
		this.requestMethod = requestMethod;
		this.url = url;
	}
}
