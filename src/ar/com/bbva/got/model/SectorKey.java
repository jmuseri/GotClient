package ar.com.bbva.got.model;

import java.io.Serializable;

public class SectorKey implements Serializable {
    public SectorKey(String canal, String sector) {
		super();
		this.canal = canal;
		this.sector = sector;
	}

	private static final long serialVersionUID = 1L;

    String canal ;

    String sector;

    public SectorKey() {
    }

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
