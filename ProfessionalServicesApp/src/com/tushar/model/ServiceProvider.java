package com.tushar.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class ServiceProvider 
{
	private String serName;
	private int serAge;
	@Id
	private String serCont;
	private String serAdd;
	private int serPin;
	private String serArea;
	private String serCity;
	private String serLat;
	private String serLong;
	private String serEmail;
	private String serPass;
	private String serCat;
	private String serSer;
	private String serOpen;
	private String serClose;
	private String serGen;
	private String serStatus;
	
	public String getSerStatus() {
		return serStatus;
	}
	public void setSerStatus(String serStatus) {
		this.serStatus = serStatus;
	}
	public String getSerName() {
		return serName;
	}
	public void setSerName(String serName) {
		this.serName = serName;
	}
	public int getSerAge() {
		return serAge;
	}
	public void setSerAge(int serAge) {
		this.serAge = serAge;
	}
	public String getSerCont() {
		return serCont;
	}
	public void setSerCont(String serCont) {
		this.serCont = serCont;
	}
	public String getSerAdd() {
		return serAdd;
	}
	public void setSerAdd(String serAdd) {
		this.serAdd = serAdd;
	}
	public int getSerPin() {
		return serPin;
	}
	public void setSerPin(int serPin) {
		this.serPin = serPin;
	}
	public String getSerArea() {
		return serArea;
	}
	public void setSerArea(String serArea) {
		this.serArea = serArea;
	}
	public String getSerCity() {
		return serCity;
	}
	public void setSerCity(String serCity) {
		this.serCity = serCity;
	}
	public String getSerLat() {
		return serLat;
	}
	public void setSerLat(String serLat) {
		this.serLat = serLat;
	}
	public String getSerLong() {
		return serLong;
	}
	public void setSerLong(String serLong) {
		this.serLong = serLong;
	}
	public String getSerEmail() {
		return serEmail;
	}
	public void setSerEmail(String serEmail) {
		this.serEmail = serEmail;
	}
	public String getSerPass() {
		return serPass;
	}
	public void setSerPass(String serPass) {
		this.serPass = serPass;
	}
	
	public String getSerCat() {
		return serCat;
	}
	public void setSerCat(String serCat) {
		this.serCat = serCat;
	}
	public String getSerSer() {
		return serSer;
	}
	public void setSerSer(String serSer) {
		this.serSer = serSer;
	}
	public String getSerOpen() {
		return serOpen;
	}
	public void setSerOpen(String serOpen) {
		this.serOpen = serOpen;
	}
	public String getSerClose() {
		return serClose;
	}
	public void setSerClose(String serClose) {
		this.serClose = serClose;
	}
	public String getSerGen() {
		return serGen;
	}
	public void setSerGen(String serGen) {
		this.serGen = serGen;
	}
	public ServiceProvider(String serName, int serAge, String serCont, String serAdd, int serPin, String serArea,
			String serCity, String serLat, String serLong, String serEmail, String serPass, String serCat,
			String serSer, String serOpen, String serClose, String serGen, String serStatus) {
		super();
		this.serName = serName;
		this.serAge = serAge;
		this.serCont = serCont;
		this.serAdd = serAdd;
		this.serPin = serPin;
		this.serArea = serArea;
		this.serCity = serCity;
		this.serLat = serLat;
		this.serLong = serLong;
		this.serEmail = serEmail;
		this.serPass = serPass;
		this.serCat = serCat;
		this.serSer = serSer;
		this.serOpen = serOpen;
		this.serClose = serClose;
		this.serGen = serGen;
		this.serStatus = serStatus;
	}
	public ServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ServiceProvider [serName=" + serName + ", serAge=" + serAge + ", serCont=" + serCont + ", serAdd="
				+ serAdd + ", serPin=" + serPin + ", serArea=" + serArea + ", serCity=" + serCity + ", serLat=" + serLat
				+ ", serLong=" + serLong + ", serEmail=" + serEmail + ", serPass=" + serPass + ", serCat=" + serCat
				+ ", serSer=" + serSer + ", serOpen=" + serOpen + ", serClose=" + serClose + ", serGen=" + serGen
				+ ", serStatus=" + serStatus + "]";
	}
	
}
