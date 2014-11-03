package db;

import java.sql.Date;
import java.sql.Time;

class visitorsVO {
	
	private int id ;
	private int id_web ;
	private Date fecha ;
	private Time hora ;
	private String ip ;
	private String link ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_web() {
		return id_web;
	}
	public void setId_web(int id_web) {
		this.id_web = id_web;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date date) {
		this.fecha = date;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time date) {
		this.hora = date;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
	

}
