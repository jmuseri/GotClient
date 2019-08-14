package com.sa.bbva.got.client.service.parametria.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.parametria.GotParametriaEnum;
import com.sa.bbva.got.model.EstadoTramite;

/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotEstadoTramiteProxyService {

	private RestClientService gotClient;

	/**
	 * Add a Estado Tramite
	 * 
	 * @param estadoTramite
	 * @throws GotClientException
	 */
	public void estadoTramiteAdd(EstadoTramite estadoTramite) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.ESTADOTRAMITE_ADD, estadoTramite);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete a Estado Tramite
	 * 
	 * @param estadoTramiteId
	 * @throws GotClientException
	 */
	public void estadoTramiteDelete(int estadoTramiteId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id", Integer.toString(estadoTramiteId));
		try {
			Object obj = gotClient.ejecutarServicio(GotParametriaEnum.ESTADOTRAMITE_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * List de Estado Tramite
	 * 
	 * @return
	 * @throws GotClientException
	 */
	public List<EstadoTramite> estadoTramiteList() throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();

		EstadoTramite[] trArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.ESTADOTRAMITE_LIST, params);
			trArray = (EstadoTramite[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(trArray);
	}

	/**
	 * Show de Estado Tramite
	 * 
	 * @param estadoTramiteId
	 * @return
	 * @throws GotClientException
	 */
	public EstadoTramite estadoTramiteShow(int estadoTramiteId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(estadoTramiteId));
		EstadoTramite campo = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.ESTADOTRAMITE_SHOW, params);
			campo = (EstadoTramite) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return campo;

	}

	/**
	 * Update de EstadoTramite
	 * 
	 * @param estadoTramite
	 * @throws GotClientException
	 */
	public void estadoTramiteUpdate(EstadoTramite estadoTramite) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", estadoTramite.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.ESTADOTRAMITE_UPDATE, params, estadoTramite);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
