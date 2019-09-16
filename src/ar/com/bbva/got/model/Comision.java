package ar.com.bbva.got.model;

import java.util.Date;

public class Comision {
    public Comision(Integer id, String param1, String param2, String param3, String param4, String param5,
			String usuAlta, Date fechaAlta, String usuModif, Date fechaModif) {
		super();
		this.id = id;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		this.usuAlta = usuAlta;
		this.fechaAlta = fechaAlta;
		this.usuModif = usuModif;
		this.fechaModif = fechaModif;
	}
	public Comision() {
		// TODO Auto-generated constructor stub
	}
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
}
