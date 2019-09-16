package com.sa.bbva.got.client.service.parametria.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.parametria.GotParametriaEnum;

import ar.com.bbva.got.model.CampoDisponible;

/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotCampoDisponibleProxyService {

	private RestClientService gotClient;

	public GotCampoDisponibleProxyService(String restUri) {
		gotClient = new RestClientService(restUri);
	}

	/**
	 * Add a Campo Disponible
	 * 
	 * @param campo
	 * @throws GotClientException
	 */
	public void campoDisponibleAdd(CampoDisponible campo) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.CAMPODISPONIBLE_ADD, campo);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete a Campo Disponible
	 * 
	 * @param tramiteId
	 * @throws GotClientException
	 */
	public void campoDisponibleDelete(int campoDisponibleId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id", Integer.toString(campoDisponibleId));
		try {
			gotClient.ejecutarServicio(GotParametriaEnum.CAMPODISPONIBLE_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * List de Campo Disponible
	 * 
	 * @return
	 * @throws GotClientException
	 */
	public List<CampoDisponible> campoDisponibleList() throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();

		CampoDisponible[] trArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.CAMPODISPONIBLE_LIST, params);
			trArray = (CampoDisponible[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(trArray);
	}

	/**
	 * Show de Campo Disponible
	 * 
	 * @param campoDisponibleId
	 * @return
	 * @throws GotClientException
	 */
	public CampoDisponible campoDisponibleShow(int campoDisponibleId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(campoDisponibleId));
		CampoDisponible campo = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.CAMPODISPONIBLE_SHOW, params);
			campo = (CampoDisponible) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return campo;

	}

	/**
	 * Update de Campo Disponible
	 * 
	 * @param campoDisponible
	 * @throws GotClientException
	 */
	public void campoDisponibleUpdate(CampoDisponible campo) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", campo.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.CAMPODISPONIBLE_UPDATE, params, campo);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
