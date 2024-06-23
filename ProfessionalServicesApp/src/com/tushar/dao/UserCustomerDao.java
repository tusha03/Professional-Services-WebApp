package com.tushar.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.tushar.model.UserCustomer;


public class UserCustomerDao 
{
	private HibernateTemplate hibernateTemplate;
	
    /*===========================================================================*/
	
	@Transactional
	public String addUserCustromer(UserCustomer user)		//add new user
	{
		String i = (String) hibernateTemplate.save(user);
		return i;
	}
	
	public UserCustomer getOneCustomer(String cont)		//get one user
	{
		UserCustomer userCustomer = hibernateTemplate.get(UserCustomer.class,cont);
		return userCustomer;
	}
	
	
	
	
	
	
	
	
    /*===========================================================================*/
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public UserCustomerDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public UserCustomerDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
	
    /*===========================================================================*/
}
