package com.sa.bbva.got.client.service.funcional.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.funcional.GotFuncionalEnum;

import ar.com.bbva.got.model.Tramite;
import ar.com.bbva.got.model.TramiteAutorizado;
import ar.com.bbva.got.model.TramiteAutorizadoKey;
import ar.com.bbva.got.model.TramiteDetalle;
import ar.com.bbva.got.model.TramiteDetalleKey;


public class GotTramiteProxyService {

	
	private RestClientService gotClient; 

	protected GotTramiteProxyService() {
		
	}
	
	
	public GotTramiteProxyService(String restUri) {
		gotClient= new RestClientService(restUri);
	}

	/**
	 * Add a Tramite

	 * @param tramite
	 */
	public void tramiteAdd(Tramite tramite) throws GotClientException {
		
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_ADD, null, tramite);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}

	/**
	 * 	Delete a tramite
	 * @param tramiteId
	 */
	public void tramiteDelete(int tramiteId) throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",Integer.toString(tramiteId));
		try {
			gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DELETE, params, null);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
//	/**
//	 * View a list of available tramite
//
//	 * @return
//	 * @throws GotClientException
//	 */
//	public List<Tramite> tramiteList() throws GotClientException{
//		HashMap<String,Object> params = new HashMap<String, Object>();
//		
//		Tramite[] trArray= {}; 
//		Object obj;
//		try {
//			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_LIST, params);
//			trArray = (Tramite[])obj;
//		} catch (RestClientException e) {
//			throw new GotClientException(e.getMessage());
//		}
//		return Arrays.asList(trArray);
//	}
	
	
	/**
	 * Search an tramite with an ID
	 * @param tramiteId
	 * @return The Tramite found.
	 * @throws GotClientException
	 */
	public Tramite tramiteShow(int tramiteId)  throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",Integer.toString(tramiteId));
		Tramite tramite = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_SHOW, params, null);
			tramite = (Tramite)obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return tramite;
		
	}
	/**
	 * Update an tramite
	 * @param tramite
	 * @param tramite
	 * @throws GotClientException
	 */
	public void tramiteUpdate(Tramite tramite)  throws GotClientException{
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",tramite.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_UPDATE,params, tramite);
			System.out.println(obj);      
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
	
	
	/**
	 * Add a TramiteAutorizado
	 * @param tramiteAutorizado
	 */
	public void tramiteAutorizadoAdd(TramiteAutorizado tramiteAutorizado) throws GotClientException {

		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_AUTORIZADO_ADD, null, tramiteAutorizado);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}

	/**
	 * 	Delete a tramiteAutorizado
	 * @param TramiteAutorizadoKey;
	 */
	public void tramiteAutorizadoDelete(TramiteAutorizadoKey key) throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("tramiteId",Integer.toString(key.getTramiteId()));
		params.put("autorizadoId",Integer.toString(key.getAutorizadoId()));
		try {
			gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_AUTORIZADO_DELETE, params, null);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		
	}
	
	/**
	 * View a list of available tramiteAutorizado for a given tramiteID
	 * @param tramiteId
	 * @return a list of TramiteAutorizado
	 * @throws GotClientException
	 */
	public List<TramiteAutorizado> tramiteAutorizadoList(int tramiteId) throws GotClientException{
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id", Integer.toString(tramiteId));
		TramiteAutorizado[] tramiteAutArray= {}; 
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_AUTORIZADO_LIST, params, null);
			tramiteAutArray = (TramiteAutorizado[])obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(tramiteAutArray);
	}
	
	/**
	 * Add a TramiteDetalle
	 * @param tramiteDetalle
	 */
	public void tramiteDetalleAdd(TramiteDetalle tramiteDetalle) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_ADD, null, tramiteDetalle);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}

	/**
	 * 	Delete a tramiteDetalle
	 * @param tramiteDetallekey
	 */
	public void tramiteDetalleDelete(TramiteDetalleKey tramiteDetallekey) throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		
		params.put("tramiteId",Integer.toString(tramiteDetallekey.getTramiteId()));
		params.put("tipoTramiteCampoId",Integer.toString(tramiteDetallekey.getTipoTramiteCampoId().getTipoTramiteId()));
		params.put("campoDisponibleId",Integer.toString(tramiteDetallekey.getTipoTramiteCampoId().getCampoDisponibleId()));
		try {
			gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_DELETE, params, null);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		
	}
	
	/**
	 * View a list of available tramiteDetalle
	 * @return
	 * @throws GotClientException
	 */
	public List<TramiteDetalle> tramiteDetalleList() throws GotClientException{
		HashMap<String,Object> params = new HashMap<String, Object>();
		
		TramiteDetalle[] autArray= {}; 
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_LIST, params, null);
			autArray = (TramiteDetalle[])obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
	}
	
	
	/**
	 * View a list of available tramiteDetalle
	 * @param tramiteId
	 * @return
	 * @throws GotClientException
	 */
	public List<TramiteDetalle> tramiteDetalleListById(int tramiteId) throws GotClientException{
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",Integer.toString(tramiteId));
		TramiteDetalle[] tramiteDetalleArray= {}; 
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_LIST_BYID, params, null);
			tramiteDetalleArray = (TramiteDetalle[])obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(tramiteDetalleArray);
	}
	
	
	
	
	
	
	/**
	 * Search an tramiteDetalle with an ID
	 * @param tramiteDetalleId
	 * @return The TramiteDetalle found.
	 * @throws GotClientException
	 */
	public TramiteDetalle tramiteDetalle(TramiteDetalleKey tramiteDetallekey) throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("tramiteId",Integer.toString(tramiteDetallekey.getTramiteId()));
		params.put("tipoTramiteCampoId",Integer.toString(tramiteDetallekey.getTipoTramiteCampoId().getTipoTramiteId()));
		params.put("campoDisponibleId",Integer.toString(tramiteDetallekey.getTipoTramiteCampoId().getCampoDisponibleId()));

		TramiteDetalle tramiteDetalle = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_SHOW, params, null);
			tramiteDetalle = (TramiteDetalle)obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return tramiteDetalle;
		
	}
	/**
	 * Update an tramiteDetalle

	 * @param tramiteDetalle
	 * @throws GotClientException
	 */
	public void tramiteDetalleUpdate(TramiteDetalle tramiteDetalle)  throws GotClientException{
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("tramiteId",Integer.toString(tramiteDetalle.getId().getTramiteId()));
		params.put("tipoTramiteCampoId",Integer.toString(tramiteDetalle.getId().getTipoTramiteCampoId().getTipoTramiteId()));
		params.put("campoDisponibleId",Integer.toString(tramiteDetalle.getId().getTipoTramiteCampoId().getCampoDisponibleId()));
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_UPDATE,params, tramiteDetalle);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		} 
	}
	
}
