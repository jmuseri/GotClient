package com.sa.bbva.got.client.service.funcional.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.funcional.GotFuncionalEnum;

import ar.com.bbva.got.model.Autorizado;

public class GotAutorizadoProxyService {

	private RestClientService gotClient;

	protected GotAutorizadoProxyService() {
	}

	public GotAutorizadoProxyService(String restUri) {
		gotClient = new RestClientService(restUri);
	}

	/**
	 * Add an autorizado
	 * 
	 * @param gotClient
	 * @param autorizado
	 */
	public void autorizadoAdd(Autorizado autorizado) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_ADD, autorizado);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}

	/**
	 * Delete an autorizado
	 * 
	 * @param gotClient
	 * @param lastId
	 */
	public void autorizadoDelete(int tramiteId, int autorizadoId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(tramiteId));
		params.put("autorizadoId", Integer.toString(autorizadoId));
		try {
			gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_DELETE, params);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}

	/**
	 * View a list of available autorizado
	 * 
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<Autorizado> autorizadoList(int clienteId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("cliente", Integer.toString(clienteId));
		Autorizado[] autArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_LIST, params);
			autArray = (Autorizado[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
	}

	/**
	 * Search an autorizado with an ID
	 * 
	 * @param gotClient
	 * @param autorizadoId
	 * @return The Autorizado found.
	 * @throws GotClientException
	 */
	public Autorizado autorizadoShow(int autorizadoId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(autorizadoId));
		Autorizado autorizado = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_SHOW, params);
			autorizado = (Autorizado) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return autorizado;

	}

	/**
	 * Update an autorizado
	 * 
	 * @param gotClient
	 * @param autorizado
	 * @throws GotClientException
	 */
	public void autorizadoUpdate(Autorizado autorizado) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", autorizado.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalEnum.AUTORIZADO_UPDATE, params, autorizado);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
}
