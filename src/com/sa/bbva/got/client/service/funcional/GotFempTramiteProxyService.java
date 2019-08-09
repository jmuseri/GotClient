package com.sa.bbva.got.client.service.funcional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.service.GotOperationsEnum;
import com.sa.bbva.got.client.service.GotRestClientService;
import com.sa.bbva.got.model.Tramite;
import com.sa.bbva.got.model.TramiteAutorizado;
import com.sa.bbva.got.model.TramiteDetalle;


public class GotFempTramiteProxyService {

	
	private GotRestClientService gotClient; 
	
	/**
	 * Add a Tramite
	 * @param gotClient
	 * @param tramite
	 */
	public void tramiteAdd(Tramite tramite) throws GotClientException {

		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_ADD, tramite);
		System.out.println(obj);
	}

	/**
	 * 	Delete a tramite
	 * @param gotClient
	 * @param lastId
	 */
	public void tramiteDelete(int tramiteId) throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteId));
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DELETE, params);
	}
	
	/**
	 * View a list of available tramite
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<Tramite> tramiteList() throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		
		Tramite[] trArray= {}; 
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_LIST, params);
		trArray = (Tramite[])obj;
		return Arrays.asList(trArray);
	}
	
	
	/**
	 * Search an tramite with an ID
	 * @param gotClient
	 * @param tramiteId
	 * @return The Tramite found.
	 * @throws GotClientException
	 */
	public Tramite tramiteShow(int tramiteId)  throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteId));
		Tramite tramite;
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_SHOW, params);
		tramite = (Tramite)obj;
		return tramite;
		
	}
	/**
	 * Update an tramite
	 * @param gotClient
	 * @param tramite
	 * @throws GotClientException
	 */
	public void tramiteUpdate(Tramite tramite)  throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",tramite.getId().toString());
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_UPDATE,params, tramite);
		System.out.println(obj);
	}
	
	
	
	/**
	 * Add a TramiteAutorizado
	 * @param gotClient
	 * @param tramite
	 */
	public void tramiteAutorizadoAdd(TramiteAutorizado tramiteAutorizado) throws GotClientException {

		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_AUTORIZADO_ADD, tramiteAutorizado);
		System.out.println(obj);
	}

	/**
	 * 	Delete a tramiteAutorizado
	 * @param gotClient
	 * @param lastId
	 */
	public void tramiteAutorizadoDelete(int tramiteAutorizadoId) throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteAutorizadoId));
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_AUTORIZADO_DELETE, params);
		
	}
	
	/**
	 * View a list of available tramiteAutorizado
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<TramiteAutorizado> tramiteAutorizadoList() throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();

		TramiteAutorizado[] tramiteAutArray= {}; 
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_AUTORIZADO_LIST, params);
		tramiteAutArray = (TramiteAutorizado[])obj;
		return Arrays.asList(tramiteAutArray);
	}
	
	/**
	 * Add a TramiteDetalle
	 * @param gotClient
	 * @param tramite
	 */
	public void tramiteDetalleAdd(TramiteDetalle tramiteDetalle) throws GotClientException {
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DETALLE_ADD, tramiteDetalle);
		System.out.println(obj);
	}

	/**
	 * 	Delete a tramiteDetalle
	 * @param gotClient
	 * @param lastId
	 */
	public void tramiteDetalleDelete(int tramiteDetalleId) throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteDetalleId));
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DETALLE_DELETE, params);
		
	}
	
	/**
	 * View a list of available tramiteDetalle
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<TramiteDetalle> tramiteDetalleList() throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		
		TramiteDetalle[] autArray= {}; 
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DETALLE_LIST, params);
		autArray = (TramiteDetalle[])obj;
		return Arrays.asList(autArray);
	}
	
	
	/**
	 * View a list of available tramiteDetalle
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<TramiteDetalle> tramiteDetalleListById(int tramiteId) throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteId));
		TramiteDetalle[] tramiteDetalleArray= {}; 
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DETALLE_LIST_BYID, params);
		tramiteDetalleArray = (TramiteDetalle[])obj;
		return Arrays.asList(tramiteDetalleArray);
	}
	
	
	
	
	
	
	/**
	 * Search an tramiteDetalle with an ID
	 * @param gotClient
	 * @param tramiteDetalleId
	 * @return The TramiteDetalle found.
	 * @throws GotClientException
	 */
	public TramiteDetalle tramiteDetalleShow(int tramiteDetalleId)  throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteDetalleId));
		TramiteDetalle tramiteDetalle;
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DETALLE_SHOW, params);
		tramiteDetalle = (TramiteDetalle)obj;
		return tramiteDetalle;
		
	}
	/**
	 * Update an tramiteDetalle
	 * @param gotClient
	 * @param tramiteDetalle
	 * @throws GotClientException
	 */
	public void tramiteDetalleUpdate(TramiteDetalle tramiteDetalle)  throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",tramiteDetalle.getId().toString());
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DETALLE_UPDATE,params, tramiteDetalle);
		System.out.println(obj);
	  
	}
	
	
	
	
}
