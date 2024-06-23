package com.tushar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class OrderTable 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userName;
	private String userCont;
	private String userEmail;
	private String userAddress;
	private String userGen;
	private String serviceProviderName;
	private String serviceProviderCont;
	private String serviceType;
	private String serviceDate;
	private String serviceTime;
	private String serviceStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCont() {
		return userCont;
	}
	public void setUserCont(String userCont) {
		this.userCont = userCont;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserGen() {
		return userGen;
	}
	public void setUserGen(String userGen) {
		this.userGen = userGen;
	}
	public String getServiceProviderName() {
		return serviceProviderName;
	}
	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}
	public String getServiceProviderCont() {
		return serviceProviderCont;
	}
	public void setServiceProviderCont(String serviceProviderCont) {
		this.serviceProviderCont = serviceProviderCont;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public OrderTable(int id, String userName, String userCont, String userEmail, String userAddress, String userGen,
			String serviceProviderName, String serviceProviderCont, String serviceType, String serviceDate,
			String serviceTime, String serviceStatus) {
		super();
		this.id = id;
		this.userName = userName;
		this.userCont = userCont;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userGen = userGen;
		this.serviceProviderName = serviceProviderName;
		this.serviceProviderCont = serviceProviderCont;
		this.serviceType = serviceType;
		this.serviceDate = serviceDate;
		this.serviceTime = serviceTime;
		this.serviceStatus = serviceStatus;
	}
	public OrderTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderTable [id=" + id + ", userName=" + userName + ", userCont=" + userCont + ", userEmail=" + userEmail
				+ ", userAddress=" + userAddress + ", userGen=" + userGen + ", serviceProviderName="
				+ serviceProviderName + ", serviceProviderCont=" + serviceProviderCont + ", serviceType=" + serviceType
				+ ", serviceDate=" + serviceDate + ", serviceTime=" + serviceTime + ", serviceStatus=" + serviceStatus
				+ "]";
	}
	
	
	
}
