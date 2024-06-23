package com.tushar.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class UserCustomer 
{
	@Id
	private String cont;
	private String name;
	private String dob;
	private String address;
	private String pin;
	private String area;
	private String city;
	private String email;
	private String pass;
	private String gen;
	private String lat;
	private String log;
	
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	
	public UserCustomer(String cont, String name, String dob, String address, String pin, String area, String city, String email,
			String pass, String gen, String lat, String log) {
		super();
		this.cont = cont;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.pin = pin;
		this.area = area;
		this.city = city;
		this.email = email;
		this.pass = pass;
		this.gen = gen;
		this.lat = lat;
		this.log = log;
		
	}
	public UserCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [cont=" + cont + ", name=" + name + ", dob=" + dob + ", address=" + address + ", pin=" + pin + ", area="
				+ area + ", city=" + city + ", email=" + email + ", pass=" + pass + ", gen=" + gen + ", lat=" + lat
				+ ", log=" + log + "]";
	}
	
		
}
