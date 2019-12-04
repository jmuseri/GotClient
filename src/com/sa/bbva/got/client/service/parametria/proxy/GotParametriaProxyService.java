package com.sa.bbva.got.client.service.parametria.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.parametria.GotParametriaEnum;

import ar.com.bbva.got.dto.CampoDisponibleDTO;
import ar.com.bbva.got.dto.MotivoRechazoDTO;
import ar.com.bbva.got.dto.TipoTramiteDTO;

public class GotParametriaProxyService {

	private RestClientService gotClient;

	protected GotParametriaProxyService() {
	}

	public GotParametriaProxyService(String restUri) {
		gotClient = new RestClientService(restUri);
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
			obj = gotClient.ejecutarServicio(GotParametriaEnum.PARAMETRIA_TIPO_TRAMITES, params, null);
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
			obj = gotClient.ejecutarServicio(GotParametriaEnum.PARAMETRIA_TIPO_TRAMITES_SHOW, params, null);
			autArray = (CampoDisponibleDTO[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
		
	}
	
	
	
	
	
	/**
	 * 
	 * @param nroClienteEmpresa
	 * @param estado
	 * @param tipoTramite
	 * @return
	 * @throws GotClientException
	 */
	public List<MotivoRechazoDTO> motivoRechazoList(Integer tipoTramiteId )
			throws GotClientException {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tipoTramiteId",Integer.toString(tipoTramiteId));
		MotivoRechazoDTO[] autArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.PARAMETRIA_MOTIVOS_RECHAZO, params, null);
			autArray = (MotivoRechazoDTO[]) obj;
		} catch (RestClientException e) {
			throw new GotClientException(e.getMessage());
		}
		return Arrays.asList(autArray);
	}	
	
	

}
