package ar.com.bbva.got.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.service.funcional.proxy.GotFuncionalProxyService;
import com.sa.bbva.got.client.service.parametria.proxy.GotParametriaProxyService;

import ar.com.bbva.got.dto.AltaTramiteDTO;
import ar.com.bbva.got.dto.AutorizadoDTO;
import ar.com.bbva.got.dto.SectorDTO;
import ar.com.bbva.got.dto.TramiteDTO;

/**
 * Prueba Manual de Servicios GOT.
 * 
 * @author jmuseri
 *
 */
public class GotRestClientFuncionalTest {

	private static final String REST_URI = "http://localhost:8080";
	
	
	public static void main(String[] args) {

		GotParametriaProxyService parametriaProxy = new GotParametriaProxyService(REST_URI);
		GotFuncionalProxyService funcionalProxy = new GotFuncionalProxyService(REST_URI);	
		
		
		
		List<AutorizadoDTO> autorizados= new ArrayList<AutorizadoDTO>();
		
		AutorizadoDTO autorizado = new AutorizadoDTO();
		autorizado.setApellido("Apellido");
		autorizado.setCuitEmpresa("11111111111");
		autorizado.setNombre("Nombre");
		autorizado.setNroClienteEmpresa(0);
		autorizado.setNroDocumento("nroDocumento");
		autorizado.setTipoDocumento("tipoDocumento");
		autorizados.add(autorizado);
		
		AutorizadoDTO autorizado2 = new AutorizadoDTO();
		autorizado.setApellido("Apellido");
		autorizado.setCuitEmpresa("11111111111");
		autorizado.setNombre("Nombre");
		autorizado.setNroClienteEmpresa(0);
		autorizado.setNroDocumento("nroDocumento");
		autorizado.setTipoDocumento("tipoDocumento");
		autorizados.add(autorizado2);
		
		try {
			funcionalProxy.autorizadoAdd(autorizados);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			funcionalProxy.autorizadoList("11111111111", 0);
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			parametriaProxy.tipoTramiteList(true, "web", "FNC");
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		try {
			
			TramiteDTO tramiteDto= funcionalProxy.tramiteShow(1);
			
			
			AltaTramiteDTO tramite= new AltaTramiteDTO();
			tramite.setCuentaCobro(tramiteDto.getCuentaCobro());
			tramite.setCuitEmpresa(tramiteDto.getCuitEmpresa());
			tramite.setDetalle(tramiteDto.getDetalle());
			
			
			List<AutorizadoDTO> autorizadosList= funcionalProxy.autorizadoList(tramiteDto.getCuitEmpresa(), tramiteDto.getNroClienteEmpresa());
			List<Integer> autorizadosIds= new ArrayList<Integer>();
			for (Iterator<AutorizadoDTO> iterator = autorizadosList.iterator(); iterator.hasNext();) {
				AutorizadoDTO autorizadoDTO = (AutorizadoDTO) iterator.next();
				autorizadosIds.add(autorizadoDTO.getId());
				
			}
			tramite.setIdAutorizados(autorizadosIds);
			tramite.setIdTipoTramite(tramiteDto.getIdTipoTramite());
			tramite.setNroClienteEmpresa(tramiteDto.getNroClienteEmpresa());
			
			SectorDTO key = new SectorDTO();
			key.setCanal("web");
			key.setSector("FNC");
			
			tramite.setSectorAlta(key);
			tramite.setUsuarioAlta("PEPE");
			funcionalProxy.tramiteAdd(tramite);
			
			funcionalProxy.gestionarTramite(tramiteDto.getId(),"usuario");
			funcionalProxy.finalizarTramite(tramiteDto.getId(),"usuario");
			
		} catch (GotClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}