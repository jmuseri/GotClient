package com.sa.bbva.got.client.service.parametria.proxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.exception.RestClientException;
import com.sa.bbva.got.client.service.RestClientService;
import com.sa.bbva.got.client.service.parametria.GotParametriaEnum;
import com.sa.bbva.got.model.EstadoTramite;
import com.sa.bbva.got.model.Sector;

/*
 * 
 * TODO NO OLVIDAR DE ARROJAR LA GotClientException EN
 * 		TODOS LOS METODOS CACHEADOS !!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!
 * 
 * 		!!!!!!!!!!!!!!!!!!!!!
 */
public class GotSectorProxyService {

	private RestClientService gotClient;

	/**
	 * Add a Sector
	 * 
	 * @param estadoTramite
	 * @throws GotClientException
	 */
	public void sectorAdd(Sector sector) throws GotClientException {
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.SECTOR_ADD, sector);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Delete a Sector
	 * 
	 * @param sectorId
	 * @throws GotClientException
	 */
	public void sectorDelete(int sectorId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id", Integer.toString(sectorId));
		try {
			Object obj = gotClient.ejecutarServicio(GotParametriaEnum.SECTOR_DELETE, params);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * List de Sector
	 * 
	 * @return
	 * @throws GotClientException
	 */
	public List<Sector> sectorList() throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();

		Sector[] trArray = {};
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.SECTOR_LIST, params);
			trArray = (Sector[]) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(trArray);
	}

	/**
	 * Show de Sector
	 * 
	 * @param sectorId
	 * @return
	 * @throws GotClientException
	 */
	public Sector sectorShow(int sectorId) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", Integer.toString(sectorId));
		Sector campo = null;
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.SECTOR_SHOW, params);
			campo = (Sector) obj;
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return campo;

	}

	/**
	 * Update de Sector
	 * 
	 * @param sector
	 * @throws GotClientException
	 */
	public void sectorUpdate(Sector sector) throws GotClientException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("id", sector.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotParametriaEnum.SECTOR_UPDATE, params, sector);
			System.out.println(obj);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
