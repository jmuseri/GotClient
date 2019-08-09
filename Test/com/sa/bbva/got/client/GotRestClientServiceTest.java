package com.sa.bbva.got.client;

import java.util.Date;
import java.util.HashMap;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.service.GotOperationsEnum;
import com.sa.bbva.got.client.service.GotRestClientService;
import com.sa.bbva.got.model.Autorizado;
import com.sa.bbva.got.model.Tramite;
import com.sa.bbva.got.model.TramiteAutorizado;
//
public class GotRestClientServiceTest {
	
	public static void main(String[] args) {
		GotRestClientService gotClient = new GotRestClientService();

	////////////////////////////////////////////////////////////////////////
	///////AUTORIZADO///////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////

		
		Autorizado autorizado = new Autorizado();
		autorizado.setApellido("Lopez");
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
		
		
////////////////////////////////////////////////////////////////////////
///////TRAMITES/////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
		
		
	Tramite[] tramites = pruebaTramiteList(gotClient);
	
	Tramite ultTramite= tramites[tramites.length-1];// Para agregar copio el ultimo.
	
	pruebaTramiteAdd(gotClient,ultTramite);
	pruebaTramiteUpdate(gotClient,ultTramite);
	pruebaTramiteShow(gotClient,ultTramite.getId());
	pruebaTramiteDelete(gotClient,ultTramite.getId());

	
	TramiteAutorizado[] tramiteAutorizados= pruebaTramiteAutorizadoList(gotClient, 3);
	TramiteAutorizado trAut= tramiteAutorizados[tramiteAutorizados.length-1];
	pruebaTramiteAutorizadoAdd(gotClient,trAut);
	pruebaTramiteAutorizadoDelete(gotClient,trAut);//Modificada la url de de AutorizadoDelete.

	
//			TRAMITE_DETALLE_ADD("/funcional/tramite/detalle/add","POST","java.lang.Object"), //Add a tramiteDetalle
//			TRAMITE_DETALLE_DELETE ("/funcional/tramite/detalle/delete/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"), //Delete a tramiteDetalle
//			TRAMITE_DETALLE_LIST("/funcional/tramite/detalle/list","GET","[Lcom.sa.bbva.got.model.TramiteDetalle;"), //View a list of available tramiteDetalle
//			TRAMITE_DETALLE_LIST_BYID ("/funcional/tramite/detalle/list/{id}","GET","[Lcom.sa.bbva.got.model.TramiteDetalle;"), //Search a tramiteDetalle with a Tramite ID
//			TRAMITE_DETALLE_SHOW ("/funcional/tramite/detalle/show/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","com.sa.bbva.got.model.TramiteDetalle"), //Search a tramiteDetalle with an ID
//			TRAMITE_DETALLE_UPDATE("/funcional/tramite/detalle/update/{tramiteId}/{tipoTramiteCampoId}/{campoDisponibleId}","POST","java.lang.Object"), //Update a tramiteDetalle

		
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

	
	
	private static Tramite[] pruebaTramiteList(GotRestClientService gotClient) {
		HashMap<String,String> params = new HashMap<String, String>();
		Object obj;
		
		Tramite[] autArray = {};
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_LIST, params);
			System.out.println(obj.getClass().getName());
			autArray = (Tramite[])obj;
			
			for (int i = 0; i < autArray.length; i++) {
				System.out.println(autArray[i]);
			}
			
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return autArray;
		
		
	}
	
	private static void pruebaTramiteAdd(GotRestClientService gotClient, Tramite tramite) {

		try {
			Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_ADD, tramite);
			 System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	private static void pruebaTramiteUpdate(GotRestClientService gotClient, Tramite tramite) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",tramite.getId().toString());

		try {
			Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_UPDATE,params,  tramite);
			 System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void pruebaTramiteDelete(GotRestClientService gotClient, int tramiteId) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteId));
		Object obj;
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_DELETE, params);
			System.out.println(obj.getClass().getName());
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static Tramite pruebaTramiteShow(GotRestClientService gotClient, int tramiteId) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteId));
		Object obj;
		Tramite tramite = null;
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_SHOW, params);
			tramite = (Tramite)obj;
			System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tramite;
		
	}

	private static TramiteAutorizado[] pruebaTramiteAutorizadoList(GotRestClientService gotClient, int tramiteId) {
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("id",Integer.toString(tramiteId));
		Object obj;
		TramiteAutorizado[] autArray = {};
		try {
			obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_AUTORIZADO_LIST, params);
			autArray = (TramiteAutorizado[])obj;
			if (autArray!=null) {
				for (int i = 0; i < autArray.length; i++) {
					System.out.println(autArray[i]);
				}
				
			}
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return autArray;
		
		
	}

	
	private static void pruebaTramiteAutorizadoAdd(GotRestClientService gotClient, TramiteAutorizado autorizado) {

		try {
			Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_AUTORIZADO_ADD, autorizado);
			 System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void pruebaTramiteAutorizadoDelete(GotRestClientService gotClient, TramiteAutorizado trAut) {
		HashMap<String,String> params = new HashMap<String, String>();
		params = new HashMap<String, String>();
		params.put("tramiteId",Integer.toString(trAut.getId().getTramiteId()));
		params.put("autorizadoId",Integer.toString(trAut.getId().getAutorizadoId()));
		try {
			Object obj = gotClient.ejecutarServicio(GotOperationsEnum.TRAMITE_AUTORIZADO_DELETE, params);
			 System.out.println(obj);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	