
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.sa.bbva.got.client.exception.GotClientException;
import com.sa.bbva.got.client.service.funcional.proxy.GotAutorizadoProxyService;
import com.sa.bbva.got.client.service.funcional.proxy.GotTramiteProxyService;
import com.sa.bbva.got.client.service.parametria.proxy.GotCampoDisponibleProxyService;
import com.sa.bbva.got.client.service.parametria.proxy.GotComisionProxyService;
import com.sa.bbva.got.client.service.parametria.proxy.GotEstadoTramiteProxyService;
import com.sa.bbva.got.client.service.parametria.proxy.GotSectorProxyService;
import com.sa.bbva.got.client.service.parametria.proxy.GotTipoTramiteProxyService;
import com.sa.bbva.got.model.Autorizado;
import com.sa.bbva.got.model.CampoDisponible;
import com.sa.bbva.got.model.Comision;
import com.sa.bbva.got.model.EstadoTramite;
import com.sa.bbva.got.model.Sector;
import com.sa.bbva.got.model.TipoTramite;
import com.sa.bbva.got.model.TipoTramiteCampo;
import com.sa.bbva.got.model.TipoTramiteCampoKey;
import com.sa.bbva.got.model.Tramite;
import com.sa.bbva.got.model.TramiteAutorizado;

/**
 * Prueba Manual de Servicios GOT.
 * 
 * @author jmuseri
 *
 */
public class GotRestClientFuncionalTest {

	private static final String REST_URI = "http://localhost:8180";

	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////
		/////// Parametria ////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		GotCampoDisponibleProxyService campoDisponibleProxy = new GotCampoDisponibleProxyService(REST_URI);
		GotComisionProxyService comisionProxy = new GotComisionProxyService(REST_URI);
		GotEstadoTramiteProxyService estadoTramiteProxy = new GotEstadoTramiteProxyService(REST_URI);
		GotSectorProxyService sectorProxy = new GotSectorProxyService(REST_URI);
		GotTipoTramiteProxyService tipoTramiteProxy = new GotTipoTramiteProxyService(REST_URI);

		////////////////////////////////////////////////////////////////////////
		/////// Funcional /////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		GotAutorizadoProxyService autorizadoProxy = new GotAutorizadoProxyService(REST_URI);
		GotTramiteProxyService tramiteProxy = new GotTramiteProxyService(REST_URI);

		////////////////////////////////////////////////////////////////////////
		/////// AUTORIZADO///////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		Autorizado autorizado = new Autorizado();
		autorizado.setApellido("Lopez");
		autorizado.setClienteId(0);
		// autorizado.setId(9);
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
		int lastId = autorizados.get(autorizados.size() - 1).getId();

		Autorizado autorizadoShow = null;

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
		/////// TRAMITES/////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		List<Tramite> tramites = null;

		try {
			tramites = tramiteProxy.tramiteList();
		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

		Tramite ultTramite = tramites.get(tramites.size() - 1);// Para agregar copio el ultimo.
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

		List<TramiteAutorizado> tramiteAutorizados = null;

		try {
			tramiteAutorizados = tramiteProxy.tramiteAutorizadoList(1);
		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

		TramiteAutorizado trAut = tramiteAutorizados.get(tramiteAutorizados.size() - 1);// Para agregar copio el ultimo.

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

		/////////////////////////////////////////////////////////////////
		/////// Campo Disponible ///////////////////////////////////////
		///////////////////////////////////////////////////////////////
		CampoDisponible campo = new CampoDisponible();
		campo.setActivo(true);
		campo.setDescripcion("Prueba");
		campo.setFechaAlta(new Date(System.currentTimeMillis()));
		campo.setFechaModif(new Date(System.currentTimeMillis()));
		campo.setId(1);
		campo.setNombre("Campo 1");
		campo.setTipoDato("DATO");
		campo.setUsuAlta("Usuario 1");
		campo.setUsuModif("Usuario 2");

		try {
			campoDisponibleProxy.campoDisponibleAdd(campo);
			campoDisponibleProxy.campoDisponibleShow(1);
			campoDisponibleProxy.campoDisponibleUpdate(campo);
			campoDisponibleProxy.campoDisponibleList();
			campoDisponibleProxy.campoDisponibleDelete(1);
		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

		/////////////////////////////////////////////////////////////////
		/////// Comision ///////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		Comision comision = new Comision();
		comision.setFechaAlta(new Date(System.currentTimeMillis()));
		comision.setFechaModif(new Date(System.currentTimeMillis()));
		comision.setId(1);
		comision.setParam1("A");
		comision.setParam2("B");
		comision.setParam3("C");
		comision.setParam4("D");
		comision.setParam5("E");
		comision.setUsuAlta("Usuario 1");
		comision.setUsuModif("Usuario 2");

		try {
			comisionProxy.comisionAdd(comision);
			comisionProxy.comisionShow(1);
			comisionProxy.comisionUpdate(comision);
			comisionProxy.comisionList();
			comisionProxy.comisionDelete(1);
		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

		/////////////////////////////////////////////////////////////////
		/////// Estado Tramite /////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		EstadoTramite estadoTramite = new EstadoTramite();
		estadoTramite.setFechaAlta(new Date(System.currentTimeMillis()));
		estadoTramite.setFechaModif(new Date(System.currentTimeMillis()));
		estadoTramite.setId(1);
		estadoTramite.setUsuAlta("Usuario 1");
		estadoTramite.setUsuModif("Usuario 2");

		try {
			estadoTramiteProxy.estadoTramiteAdd(estadoTramite);
			estadoTramiteProxy.estadoTramiteShow(1);
			estadoTramiteProxy.estadoTramiteUpdate(estadoTramite);
			estadoTramiteProxy.estadoTramiteList();
			estadoTramiteProxy.estadoTramiteDelete(1);
		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

		/////////////////////////////////////////////////////////////////
		/////// Sector /////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		Sector sector = new Sector();
		sector.setFechaAlta(new Date(System.currentTimeMillis()));
		sector.setFechaModif(new Date(System.currentTimeMillis()));
		sector.setId(1);
		sector.setUsuAlta("Usuario 1");
		sector.setUsuModif("Usuario 2");
		sector.setActivo(true);
		sector.setSector("Sector 1");
		sector.setCanal("Canal 1");

		try {
			sectorProxy.sectorAdd(sector);
			sectorProxy.sectorShow(1);
			sectorProxy.sectorUpdate(sector);
			sectorProxy.sectorList();
			sectorProxy.sectorDelete(1);
		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

		/////////////////////////////////////////////////////////////////
		/////// Tipo Tramite /////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		TipoTramite tipoTramite = new TipoTramite();
		tipoTramite.setFechaAlta(new Date(System.currentTimeMillis()));
		tipoTramite.setFechaModif(new Date(System.currentTimeMillis()));
		tipoTramite.setId(5);
		tipoTramite.setUsuAlta("Usuario 1");
		tipoTramite.setUsuModif("Usuario 2");
		tipoTramite.setActivo(true);
		tipoTramite.setAutorizado(true);
		tipoTramite.setCobraComision(true);
		tipoTramite.setComision(comision);
		tipoTramite.setDescripcion("Tipo Tramite");
		tipoTramite.setHorasResolucion(new Long("10000"));
		tipoTramite.setHorasVencimiento(new Long("10000"));
		tipoTramite.setRequiereDocumentacion(true);
		tipoTramite.setSectorInicial(new Sector());
		
		TipoTramiteCampo tipoTramiteCampo = new TipoTramiteCampo();
		tipoTramiteCampo.setActivo(true);
		tipoTramiteCampo.setId(new TipoTramiteCampoKey(1, 1));
		tipoTramiteCampo.setObligatorio(true);

		try {
			tipoTramiteProxy.tipoTramiteAdd(tipoTramite);
			tipoTramiteProxy.tipoTramiteShow(1);
			tipoTramiteProxy.tipoTramiteUpdate(tipoTramite);

			tipoTramiteProxy.tipoTramiteCampoAdd(tipoTramiteCampo);
			tipoTramiteProxy.tipoTramiteCampoList();
			tipoTramiteProxy.tipoTramiteCampoListById(1);
			tipoTramiteProxy.tipoTramiteCampoUpdate(1, 1);

			tipoTramiteProxy.tipoTramiteComisionAdd(comision);
			tipoTramiteProxy.tipoTramiteComisionShow(1);

			tipoTramiteProxy.tipoTramiteCampoDelete(1, 1);

		} catch (GotClientException e) {
			System.out.println(e.getMessage());
		}

	}
}