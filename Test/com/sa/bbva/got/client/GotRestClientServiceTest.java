package com.sa.bbva.got.client;

import java.util.Date;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.service.funcional.proxy.GotAutorizadoProxyService;
import com.sa.bbva.got.client.service.funcional.proxy.GotTramiteProxyService;
import com.sa.bbva.got.model.Autorizado;
import com.sa.bbva.got.model.Tramite;
import com.sa.bbva.got.model.TramiteAutorizado;


/**
 * Prueba Manual de Servicios GOT.
 * @author jmuseri
 *
 */
public class GotRestClientServiceTest {
	
	public static void main(String[] args) {
		GotAutorizadoProxyService autorizadoProxy = new GotAutorizadoProxyService();
		GotTramiteProxyService tramiteProxy = new GotTramiteProxyService();
		try{
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
			autorizadoProxy.autorizadoAdd(autorizado);
			List<Autorizado> autorizados = autorizadoProxy.autorizadoList();
			int lastId= autorizados.get(autorizados.size()-1).getId();
			Autorizado autorizadoShow= autorizadoProxy.autorizadoShow(lastId);
			
			autorizado.setId(lastId);
			autorizado.setApellido("MM");
			autorizado.setNombre("Juan");
			autorizado.setFechaModif(new Date(System.currentTimeMillis()));
			autorizadoProxy.autorizadoUpdate(autorizadoShow);
			autorizadoProxy.autorizadoDelete(lastId);
			
			////////////////////////////////////////////////////////////////////////
			///////TRAMITES/////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////
			
			
			List<Tramite> tramites = tramiteProxy.tramiteList();
			
			Tramite ultTramite= tramites.get(tramites.size()-1);// Para agregar copio el ultimo.
			tramiteProxy.tramiteAdd(ultTramite);
			tramiteProxy.tramiteUpdate(ultTramite);
			tramiteProxy.tramiteShow(ultTramite.getId());
			tramiteProxy.tramiteDelete(ultTramite.getId());
		
			
		    List<TramiteAutorizado>tramiteAutorizados =tramiteProxy.tramiteAutorizadoList();
			TramiteAutorizado trAut= tramiteAutorizados.get(tramites.size()-1);// Para agregar copio el ultimo.
			tramiteProxy.tramiteAutorizadoAdd(trAut);
			tramiteProxy.tramiteAutorizadoDelete(trAut.getId());
		}catch (GotClientException e){
			e.printStackTrace();
		}
	}

}	