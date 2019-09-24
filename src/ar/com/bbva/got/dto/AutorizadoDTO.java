package ar.com.bbva.got.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AutorizadoDTO implements Serializable {
    
	private static final long serialVersionUID = -956041686816430819L;
	
    private Integer id;

    private Integer nroClienteEmpresa;
    
    private String cuitEmpresa;

    private String tipoDocumento;

    private String nroDocumento;

    private String nombre;

    private String apellido;

    private String sexo;
    
    private boolean activo;

    
}
