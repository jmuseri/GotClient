

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
public class GotRestClientFuncionalTest {
	
	
	 private static final String REST_URI = "http://localhost:8180";
	
	public static void main(String[] args) {
		GotAutorizadoProxyService autorizadoProxy = new GotAutorizadoProxyService(REST_URI);
		GotTramiteProxyService tramiteProxy = new GotTramiteProxyService(REST_URI);
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
			try {
				autorizadoProxy.autorizadoAdd(autorizado);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			List<Autorizado> autorizados = null;
			try {
				autorizados = autorizadoProxy.autorizadoList(3534520);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			int lastId= autorizados.get(autorizados.size()-1).getId();
			
			Autorizado autorizadoShow= null; 

					
			try {
				autorizadoShow = autorizadoProxy.autorizadoShow(lastId);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			
			
			
			
			autorizado.setId(lastId);
			autorizado.setApellido("MM");
			autorizado.setNombre("Juan");
			autorizado.setFechaModif(new Date(System.currentTimeMillis()));
			
			try {
				autorizadoProxy.autorizadoUpdate(autorizadoShow);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				autorizadoProxy.autorizadoDelete(lastId);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			
			////////////////////////////////////////////////////////////////////////
			///////TRAMITES/////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////
			
			
			List<Tramite> tramites = null;
					
					
			try {
				tramites = tramiteProxy.tramiteList();
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			
			Tramite ultTramite= tramites.get(tramites.size()-1);// Para agregar copio el ultimo.
			try {
				tramiteProxy.tramiteAdd(ultTramite);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			try {
				tramiteProxy.tramiteUpdate(ultTramite);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			try {
				tramiteProxy.tramiteShow(ultTramite.getId());
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}

		
			
		    List<TramiteAutorizado>tramiteAutorizados = null;
		    		
    		try {
				tramiteAutorizados =	tramiteProxy.tramiteAutorizadoList(ultTramite.getId());
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
    		
			TramiteAutorizado trAut= tramiteAutorizados.get(tramites.size()-1);// Para agregar copio el ultimo.
			
			try {
				tramiteProxy.tramiteAutorizadoAdd(trAut);
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			try {
				tramiteProxy.tramiteAutorizadoDelete(trAut.getId());
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			
			try {
			tramiteProxy.tramiteDelete(ultTramite.getId());
			} catch (GotClientException e) {
				System.out.println(e.getMessage());
			}
			
	}

}	