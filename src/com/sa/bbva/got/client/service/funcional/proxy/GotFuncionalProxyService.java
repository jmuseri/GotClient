package com.sa.bbva.got.client.service.funcional.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.funcional.GotFuncionalFuncionalEnum;

import ar.com.bbva.got.bean.StatusResponse;
import ar.com.bbva.got.dto.AltaTramiteDTO;
import ar.com.bbva.got.dto.AutorizadoDTO;
import ar.com.bbva.got.dto.CampoDisponibleDTO;
import ar.com.bbva.got.dto.TipoTramiteDTO;
import ar.com.bbva.got.dto.TramiteDTO;
import ar.com.bbva.got.model.EstadoTramite;
import ar.com.bbva.got.model.TipoTramite;

public class GotFuncionalProxyService {

	private RestClientService gotClient;

	protected GotFuncionalProxyService() {
	}

	public GotFuncionalProxyService(String restUri) {
		gotClient = new RestClientService(restUri);
	}
	
	
	
	/**
	 * View a list of available autorizado
	 * 
	 * @param gotClient
	 * @return
	 * @throws GotClientException
	 */
	//FUNCIONAL_AUTORIZADOS
	public List<AutorizadoDTO> autorizadoList(String cuitEmpresa, int nroClienteEmpresa) throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("nroClienteEmpresa", Integer.toString(nroClienteEmpresa));
		params.put("cuitEmpresa", cuitEmpresa);
		AutorizadoDTO[] autArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_AUTORIZADOS, params, null);
			autArray = (AutorizadoDTO[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
	}
	
	/**
	 * Add an Autorizado's List.
	 * @param autorizados
	 * @throws GotClientException
	 */
	public void autorizadoAdd(List<AutorizadoDTO> autorizados) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_AUTORIZADOS_ADD, null, autorizados);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
	
	
	/**
	 * View a list of available TipoTramite
	 * @param activo
	 * @param idCanal
	 * @param idSector
	 * @return List<TipoTramiteDTO>
	 * @throws GotClientException
	 */
	public List<TipoTramiteDTO> tipoTramiteList(boolean activo, String idCanal, String idSector)
			throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("activo", Boolean.toString(activo));
		params.put("canal", idCanal);
		params.put("sector", idSector);
		TipoTramiteDTO[] autArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TIPO_TRAMITES, params, null);
			autArray = (TipoTramiteDTO[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
	}	
	
	
	
	/**
	 * DEvuelve los campos disponibles para el tramite.
	 * @param tramiteId
	 * 
	 * @return TipoTramiteDTO
	 * @throws GotClientException
	 */
	public List<CampoDisponibleDTO> camposDisponiblesList(int tipoTramiteId)  throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",Integer.toString(tipoTramiteId));
		CampoDisponibleDTO[] autArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TIPO_TRAMITES_SHOW, params, null);
			autArray = (CampoDisponibleDTO[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
		
	}
	
	
	
	public TramiteDTO tramiteShow(int tramiteId)  throws GotClientException {
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",Integer.toString(tramiteId));
		TramiteDTO tramite = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITES_SHOW, params, null);
			tramite = (TramiteDTO)obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return tramite;
		
	}
	
	/**
	 * Finaliza un tramite.
	 * @param id
	 * @param usuario
	 * @throws GotClientException
	 */
	public void finalizarTramite(Integer id, String usuario) throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id.toString());
		params.put("usuario", usuario);
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITES_FINALIZAR, params, null);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
	
	
	/**
	 * Pone un tramite en estado EN_GESTION. 
	 * @param id
	 * @param usuario
	 * @throws GotClientException
	 */
	public void gestionarTramite(Integer id, String usuario) throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id.toString());
		params.put("usuario", usuario);
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITES_GESTIONAR, params, null);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
		
		
	/**
	 * Rechaza un tramite.
	 * @param id
	 * @param usuario
	 * @throws GotClientException
	 */
	public void rechazarTramite(Integer id, String usuario) throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id.toString());
		params.put("usuario", usuario);
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITES_RECHAZAR, params, null);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
	
	
	/**
	 * Rechaza un tramite.
	 * @param id
	 * @param usuario
	 * @throws GotClientException
	 */
	public void activarTramite(Integer id, String usuario) throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("id", id.toString());
		params.put("usuario", usuario);
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITES_ACTIVAR, params, null);
			System.out.println(obj);
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
	
	/**
	 * Add a tramite.
	 * @param tramite
	 * @throws GotClientException
	 */
	public int tramiteAdd(AltaTramiteDTO tramite) throws GotClientException {
		
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITE_ADD, null, tramite);
			System.out.println(obj);
			return Integer.parseInt(((LinkedHashMap<String, String>)obj).get("description"));
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
	}
	
	
	
	/**
	 * 
	 * @param nroClienteEmpresa
	 * @param estado
	 * @param tipoTramite
	 * @return
	 * @throws GotClientException
	 */
	public List<TramiteDTO> tramiteList(Integer nroClienteEmpresa, String estado , Integer idTipoTramite )
			throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("nroClienteEmpresa", nroClienteEmpresa.toString());
		if (estado !=null && !estado.equals("")) params.put("estadoTramite", estado);
		if (idTipoTramite !=null) params.put("idTipoTramite", idTipoTramite);
		TramiteDTO[] autArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotFuncionalFuncionalEnum.FUNCIONAL_TRAMITES, params, null);
			autArray = (TramiteDTO[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
	}	
	

}
