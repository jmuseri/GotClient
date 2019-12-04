package ar.com.bbva.got.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class TramiteDetalleDTO implements Serializable {

	private static final long serialVersionUID = -5445678639117753177L;

	
    private Integer idTipoTramite;
	
	
    private Integer tramiteId;
	
	
	private String campoDisponibleId;
	
	
    private String valor;
	
    private String usuAlta;

    private Date fechaAlta;

    private String usuModif;

    private Date fechaModif;
	
}