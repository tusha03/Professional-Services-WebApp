package com.tushar.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tushar.model.ServiceProvider;

public class ServiceProviderDao
{
	//@Autowired
	private HibernateTemplate hibernateTemplate;
	
	/*===========================================================*/
	
	@Transactional
	public String addServiceProvider(ServiceProvider serviceProvider)		//add the new service provider
	{
		String i = (String) hibernateTemplate.save(serviceProvider);
		return i;
	}
	
	@Transactional
	public void deleteServiceProvider(ServiceProvider service)		//delete service provider
	{
		hibernateTemplate.delete(service);
		System.out.println("delete service provider");
	}
	
	public ServiceProvider getOneServiceProvider(String cont)		//login time checking
	{
		ServiceProvider serviceProvider = hibernateTemplate.get(ServiceProvider.class, cont);
		return serviceProvider;
	}
	
	public List<ServiceProvider> getAllServiceProviders()	//get all service providers
	{
		List<ServiceProvider> serviceProviders = hibernateTemplate.loadAll(ServiceProvider.class);
		return serviceProviders;
	}

	@Transactional
	public void updateServiceProvider(ServiceProvider service)		//update
	{
		hibernateTemplate.update(service);
		System.out.println("update service provider");
	}
	/*===========================================================*/
	@Override
	public String toString() {
		return "ServiceProviderDao [hibernateTemplate=" + hibernateTemplate + "]";
	}

	public ServiceProviderDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceProviderDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
