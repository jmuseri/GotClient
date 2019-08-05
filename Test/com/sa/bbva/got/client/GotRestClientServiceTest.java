package com.sa.bbva.got.client;

import java.util.Date;
import java.util.HashMap;

import com.sa.bbva.got.client.GotOperationsEnum;
import com.sa.bbva.got.client.GotRestClientService;
import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.model.Autorizado;
//
public class GotRestClientServiceTest {
	
	public static void main(String[] args) {
		GotRestClientService gotClient = new GotRestClientService();
		Autorizado autorizado = new Autorizado();
		autorizado.setApellido("Museri");
		autorizado.setClienteId(0);
		//autorizado.setId(9);
		autorizado.setNombre("Jony");
		autorizado.setNroDocumento("28169773");
		autorizado.setTipoDocumento("DNI");
		autorizado.setFechaAlta(new Date(System.currentTimeMillis()));
		pruebaAutorizadoAdd(gotClient, autorizado);
		int lastId= pruebaAutorizadoList(gotClient);
		pruebaAutorizadoShow(gotClient,lastId);
		autorizado.setId(lastId);
		autorizado.setApellido("MM");
		autorizado.setNombre("Juan");
		autorizado.setFechaModif(new Date(System.currentTimeMillis()));
		pruebaAutorizadoUpdate(gotClient, autorizado);
		
		pruebaAutorizadoDelete(gotClient,lastId);
		
	}
	
	
	private static void pruebaAutorizadoAdd(GotRestClientService gotClient, Autorizado autorizado) {

		try {
			Object obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_ADD, autorizado);
			 System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
		
	}
	
	private static void pruebaAutorizadoDelete(GotRestClientService gotClient, int lastId) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(lastId));
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_DELETE, params);
			System.out.println(obj.getClass().getName());
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static int pruebaAutorizadoList(GotRestClientService gotClient) {
		HashMap<String,String> params = new HashMap<String, String>();
		Object obj;
		int ultId= 0;
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_LIST, params);
			System.out.println(obj.getClass().getName());
			Autorizado[] autArray = (Autorizado[])obj;
			
			for (int i = 0; i < autArray.length; i++) {
				System.out.println(autArray[i]);
			}
			ultId= autArray[autArray.length-1].getId();
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ultId;
		
		
	}
	
	private static void pruebaAutorizadoShow(GotRestClientService gotClient, int ultId) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(ultId));
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_SHOW, params);
			System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void pruebaAutorizadoUpdate(GotRestClientService gotClient, Autorizado autorizado) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",autorizado.getId().toString());
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.AUTORIZADO_UPDATE,params, autorizado);
			System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}


}	