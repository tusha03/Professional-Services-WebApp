package com.tushar.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tushar.model.OrderTable;

public class OrderTableDao
{
	private HibernateTemplate hibernateTemplate;
	
	/*============================================================================*/
	
	@Transactional
	public void addOrder(OrderTable order)		//add order
	{
		int i = (Integer) hibernateTemplate.save(order);
		System.out.println(i+" order added successfully...");
		
	}
	
	public List<OrderTable> getAllOrder()
	{
		List<OrderTable> orderTable = (List<OrderTable>) hibernateTemplate.loadAll(OrderTable.class);
		return orderTable;
	}
	
	public OrderTable getOneOrder(int i)		//get one order
	{
		OrderTable order = hibernateTemplate.get(OrderTable.class, i);
		return order;
	}
	
	@Transactional
	public void cacelOrder(OrderTable order)		//cacel order
	{
		hibernateTemplate.delete(order);
		System.out.println("delete order successfully...");
	}
	
	
	@Transactional
	public void updateOrder(OrderTable order)
	{
		hibernateTemplate.update(order);
		System.out.println("order updated successfully...");
	}
	
	
	
	
	
	/*============================================================================*/

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public OrderTableDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderTableDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public String toString() {
		return "OrderTableDao [hibernateTemplate=" + hibernateTemplate + "]";
	}
	
	/*============================================================================*/
}
