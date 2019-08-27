package com.sa.bbva.got.client.service.parametria.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.parametria.GotParametriaEnum;
import com.sa.bbva.got.model.Comision;
import com.sa.bbva.got.model.TipoTramite;
import com.sa.bbva.got.model.TipoTramiteCampo;

/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotTipoTramiteProxyService {

	private RestClientService gotClient;

	public GotTipoTramiteProxyService(String restUri) {
		gotClient = new RestClientService(restUri);
	}

	/**
	 * Add a Tipo Tramite
	 * 
	 * @param gotClient
	 * @param tramite
	 */
	public void tipoTramiteAdd(TipoTramite tipoTramite) throws GotClientException {

		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITE_ADD, tipoTramite);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Add a Tipo Tramite Campo
	 * 
	 * @param gotClient
	 * @param tramite
	 */
	public void tipoTramiteCampoAdd(TipoTramiteCampo tipoTramiteCampo) throws GotClientException {

		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECAMPO_ADD, tipoTramiteCampo);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete a Tipo Tramite Campo
	 * 
	 * @param gotClient
	 * @param lastId
	 */
	public void tipoTramiteCampoDelete(int tipoTramiteCampoId, int campoDisponibleId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id", Integer.toString(tipoTramiteCampoId));
		params.put("campoDisponibleId", Integer.toString(campoDisponibleId));
		try {
			Object obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECAMPO_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * View a list of available Tipo Tramite Campo
	 * 
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<TipoTramiteCampo> tipoTramiteCampoList() throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();

		TipoTramiteCampo[] trArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECAMPO_LIST, params);
			trArray = (TipoTramiteCampo[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(trArray);
	}

	/**
	 * View a list of available Tipo Tramite Campo
	 * 
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<TipoTramiteCampo> tipoTramiteCampoListById(int tipoTramiteCampoId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(tipoTramiteCampoId));
		TipoTramiteCampo[] tramiteCampoArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECAMPOID_LIST, params);
			tramiteCampoArray = (TipoTramiteCampo[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(tramiteCampoArray);
	}

	/**
	 * Update an Tipo Tramite Campo
	 * 
	 * @param gotClient
	 * @param tramiteDetalle
	 * @throws GotClientException
	 */
	public void tipoTramiteCampoUpdate(int tipoTramiteid, int campoDisponibleId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(tipoTramiteid));
		params.put("campoDisponibleId", Integer.toString(campoDisponibleId));
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECAMPO_UPDATE, params);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Add a Tipo Tramite Comision
	 * 
	 * @param gotClient
	 * @param tramite
	 */
	public void tipoTramiteComisionAdd(Comision comision) throws GotClientException {

		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECOMISION_ADD, comision);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete a Tipo Tramite Comision
	 * 
	 * @param gotClient
	 * @param lastId
	 */
	public void tipoTramiteComisionDelete(int tipoTramiteComisionId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id", Integer.toString(tipoTramiteComisionId));
		try {
			Object obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECOMISION_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Search an Tipo Tramite Comision with an ID
	 * 
	 * @param gotClient
	 * @param tipoTramiteComisionId
	 * @return The Comision found.
	 * @throws GotClientException
	 */
	public Comision tipoTramiteComisionShow(int tipoTramiteComisionId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(tipoTramiteComisionId));
		Comision comision = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITECOMISION_SHOW, params);
			comision = (Comision) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comision;
	}

	/**
	 * View a list of available Tipo Tramite
	 * 
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	public List<TipoTramite> tipoTramiteList() throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();

		TipoTramite[] tipoTramiteArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITE_LIST, params);
			tipoTramiteArray = (TipoTramite[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(tipoTramiteArray);
	}

	/**
	 * Search an TipoTramite with an ID
	 * 
	 * @param gotClient
	 * @param tipoTramiteId
	 * @return The TipoTramite found.
	 * @throws GotClientException
	 */
	public TipoTramite tipoTramiteShow(int tipoTramiteId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(tipoTramiteId));
		TipoTramite tipoTramiteDetalle = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITE_SHOW, params);
			tipoTramiteDetalle = (TipoTramite) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipoTramiteDetalle;
	}

	/**
	 * Update an TipoTramite
	 * 
	 * @param gotClient
	 * @param tipoTramiteDetalle
	 * @throws GotClientException
	 */
	public void tipoTramiteUpdate(TipoTramite tipoTramiteDetalle) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", tipoTramiteDetalle.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.TIPOTRAMITE_UPDATE, params, tipoTramiteDetalle);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
