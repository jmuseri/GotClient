package com.sa.bbva.got.client.service.funcional.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.funcional.GotFuncionalEnum;
import com.sa.bbva.got.model.Tramite;
import com.sa.bbva.got.model.TramiteAutorizado;
import com.sa.bbva.got.model.TramiteDetalle;


/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotTramiteProxyService {

	
	private RestClientService gotClient; 
	
	/**
	 * Add a Tramite
	 * @param gotClient
	 * @param tramite
	 */
	public void tramiteAdd(Tramite tramite) throws GotClientException {
		
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_ADD, tramite);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			Object obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_LIST, params);
			trArray = (Tramite[])obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Tramite tramite = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_SHOW, params);
			tramite = (Tramite)obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_UPDATE,params, tramite);
			System.out.println(obj);      
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * Add a TramiteAutorizado
	 * @param gotClient
	 * @param tramite
	 */
	public void tramiteAutorizadoAdd(TramiteAutorizado tramiteAutorizado) throws GotClientException {

		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_AUTORIZADO_ADD, tramiteAutorizado);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			Object obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_AUTORIZADO_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_AUTORIZADO_LIST, params);
			tramiteAutArray = (TramiteAutorizado[])obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(tramiteAutArray);
	}
	
	/**
	 * Add a TramiteDetalle
	 * @param gotClient
	 * @param tramite
	 */
	public void tramiteDetalleAdd(TramiteDetalle tramiteDetalle) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_ADD, tramiteDetalle);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			Object obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_LIST, params);
			autArray = (TramiteDetalle[])obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_LIST_BYID, params);
			tramiteDetalleArray = (TramiteDetalle[])obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		TramiteDetalle tramiteDetalle = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_SHOW, params);
			tramiteDetalle = (TramiteDetalle)obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.TRAMITE_DETALLE_UPDATE,params, tramiteDetalle);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
