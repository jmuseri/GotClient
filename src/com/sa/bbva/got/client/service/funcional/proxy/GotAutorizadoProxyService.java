package com.sa.bbva.got.client.service.funcional.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.funcional.GotFuncionalEnum;
import com.sa.bbva.got.model.Autorizado;
/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotAutorizadoProxyService {

	
	
	private RestClientService gotClient; 
	
	/**
	 * Add an autorizado
	 * @param gotClient
	 * @param autorizado
	 */
	public void autorizadoAdd(Autorizado autorizado) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_ADD, autorizado);
			System.out.println(obj);
		} catch (RestClientException e) {
			e.printStackTrace();
		}
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
		try {
			Object obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_DELETE, params);
		} catch (RestClientException e) {
			e.printStackTrace();
		}
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_LIST, params);
			autArray = (Autorizado[])obj;
		} catch (RestClientException e) {
			e.printStackTrace();
		}
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
		Autorizado autorizado = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_SHOW, params);
			autorizado = (Autorizado)obj;
		} catch (RestClientException e) {
			e.printStackTrace();
		}
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
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_UPDATE,params, autorizado);
			System.out.println(obj);
		} catch (RestClientException e) {
			e.printStackTrace();
		}
	}
}
