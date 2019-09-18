package ar.com.bbva.got.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CampoDisponibleDTO implements Serializable {

	private static final long serialVersionUID = -5445678639117753177L;

    private Integer id;
   
    private String nombre;
    
    private String valor;
    
    private String descripcion;
    
    private String tipoDato;
    
    private boolean activo;
    
    private boolean obligatorio;

    private boolean leyenda;

}
