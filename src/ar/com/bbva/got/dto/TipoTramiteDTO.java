package ar.com.bbva.got.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import lombok.Data;

@Data
public class TipoTramiteDTO implements Serializable {

	private static final long serialVersionUID = -5445678639117753177L;
	
    private Integer id;

    private String descripcion;

    private boolean cobraComision;

    private ComisionDTO comision;

    private boolean requiereDocumentacion;

    private boolean activo;

    private boolean autorizado;

    private SectorDTO sectorInicial;

    private ArrayList<CampoDisponibleDTO> campos;

    private Long horasResolucion;

    private Long horasVencimiento;
    
}
