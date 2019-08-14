package com.sa.bbva.got.client.service.parametria.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.parametria.GotParametriaEnum;
import com.sa.bbva.got.model.Comision;

/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotComisionProxyService {

	private RestClientService gotClient;

	/**
	 * Add a Comision
	 * 
	 * @param campo
	 * @throws GotClientException
	 */
	public void comisionAdd(Comision campo) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.COMISION_ADD, campo);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete a Comision
	 * 
	 * @param comisionId
	 * @throws GotClientException
	 */
	public void comisionDelete(int comisionId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id", Integer.toString(comisionId));
		try {
			Object obj = gotClient.ejecutarServicio(GotParametriaEnum.COMISION_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * List de Comision
	 * 
	 * @return
	 * @throws GotClientException
	 */
	public List<Comision> comisionList() throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();

		Comision[] trArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.COMISION_LIST, params);
			trArray = (Comision[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(trArray);
	}

	/**
	 * Show de Comision
	 * 
	 * @param comisionId
	 * @return
	 * @throws GotClientException
	 */
	public Comision comisionShow(int comisionId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(comisionId));
		Comision campo = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.COMISION_SHOW, params);
			campo = (Comision) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return campo;

	}

	/**
	 * Update de Comision
	 * 
	 * @param comision
	 * @throws GotClientException
	 */
	public void comisionUpdate(Comision comision) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", comision.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.COMISION_UPDATE, params, comision);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
