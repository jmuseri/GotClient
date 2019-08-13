package com.sa.bbva.got.client.service.funcional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.service.GotOperationsEnum;
import com.sa.bbva.got.client.service.GotRestClientService;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.model.Autorizado;



public class GotAutorizadoProxyService {

	
	
	private RestClientService gotClient; 
	
	/**
	 * Add an autorizado
	 * @param gotClient
	 * @param autorizado
	 */
	public void autorizadoAdd(Autorizado autorizado) throws GotClientException {
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_ADD, autorizado);
		System.out.println(obj);
	}

	/**
	 * 	Delete an autorizado
	 * @param gotClient
	 * @param lastId
	 */
	public void autorizadoDelete(int autorizadoId) throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(autorizadoId));
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_DELETE, params);
	}
	
	/**
	 * View a list of available autorizado
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<Autorizado> autorizadoList() throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		
		Autorizado[] autArray= {}; 
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_LIST, params);
		autArray = (Autorizado[])obj;
		return Arrays.asList(autArray);
	}
	
	
	/**
	 * Search an autorizado with an ID
	 * @param gotClient
	 * @param autorizadoId
	 * @return The Autorizado found.
	 * @throws GotClientException
	 */
	public Autorizado autorizadoShow(int autorizadoId)  throws GotClientException {
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",Integer.toString(autorizadoId));
		Autorizado autorizado;
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_SHOW, params);
		autorizado = (Autorizado)obj;
		return autorizado;
		
	}
	/**
	 * Update an autorizado
	 * @param gotClient
	 * @param autorizado
	 * @throws GotClientException
	 */
	public void autorizadoUpdate(Autorizado autorizado)  throws GotClientException{
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",autorizado.getId().toString());
		Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_UPDATE,params, autorizado);
		System.out.println(obj);
	}
}
