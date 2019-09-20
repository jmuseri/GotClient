package ar.com.bbva.got.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CampoDetalleDTO implements Serializable {

	private static final long serialVersionUID = -5445678639117753177L;

    private String nombre;
	
    private String valor;
   
    private String descripcion;
	
}
