package ar.com.bbva.got.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import ar.com.bbva.got.model.EstadoTramite;
import lombok.Data;

@Data
public class TramiteDTO implements Serializable{

	private static final long serialVersionUID = -956041686816430819L;
	
    private Integer id;
	
    private Integer idTipoTramite;

    private String tipoTramiteDesc;

    private Integer nroClienteEmpresa;

    private String cuitEmpresa;

    private List<AutorizadoDTO> autorizado;

    private SectorDTO sectorInicio;

    private SectorDTO sectorActual;

    private List<CampoDetalleDTO> detalle;

    private String cuentaCobro;

    private EstadoTramite estado;

    private Date fechaFinalizacion;

    private Date fechaInicio;

    private Date fechaVencimiento;

}
