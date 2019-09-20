package ar.com.bbva.got.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class SectorDTO implements Serializable {

	private static final long serialVersionUID = -5445678639117753177L;

    private String canal;
	
    private String sector;
	
    private String descripcion;
	
    private boolean activo;
    
}
