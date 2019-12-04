package ar.com.bbva.got.dto;

import java.io.Serializable;

import lombok.Data;

@Data

public class MotivoRechazoDTO implements Serializable{

	private static final long serialVersionUID = -956041686816430819L;
	
    private Integer id;
	
    private Integer idTipoTramite;
	
    private String descripcion;


}
