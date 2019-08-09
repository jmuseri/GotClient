package com.sa.bbva.got.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Comision implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String param1;

    private String param2;

    private String param3;

    private String param4;

    private String param5;

    private String usuAlta;

    private Date fechaAlta;

    private String usuModif;

    private Date fechaModif;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getParam4() {
		return param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
	}

	public String getParam5() {
		return param5;
	}

	public void setParam5(String param5) {
		this.param5 = param5;
	}

	public String getUsuAlta() {
		return usuAlta;
	}

	public void setUsuAlta(String usuAlta) {
		this.usuAlta = usuAlta;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getUsuModif() {
		return usuModif;
	}

	public void setUsuModif(String usuModif) {
		this.usuModif = usuModif;
	}

	public Date getFechaModif() {
		return fechaModif;
	}

	public void setFechaModif(Date fechaModif) {
		this.fechaModif = fechaModif;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comision [id=");
		builder.append(id);
		builder.append(", param1=");
		builder.append(param1);
		builder.append(", param2=");
		builder.append(param2);
		builder.append(", param3=");
		builder.append(param3);
		builder.append(", param4=");
		builder.append(param4);
		builder.append(", param5=");
		builder.append(param5);
		builder.append(", usuAlta=");
		builder.append(usuAlta);
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		builder.append(", usuModif=");
		builder.append(usuModif);
		builder.append(", fechaModif=");
		builder.append(fechaModif);
		builder.append("]");
		return builder.toString();
	}
}
