package com.tushar.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.tushar.dao.OrderTableDao;
import com.tushar.dao.ServiceProviderDao;
import com.tushar.model.OrderTable;
import com.tushar.model.ServiceProvider;



@Controller
public class ServiceController 
{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	ServiceProvider serviceProvider = (ServiceProvider) context.getBean("serviceProvider");
	ServiceProviderDao serviceProviderDao = (ServiceProviderDao) context.getBean("serviceProviderDao");
	OrderTable orderTable = (OrderTable) context.getBean("orderTable");
	OrderTableDao orderTableDao = (OrderTableDao) context.getBean("orderTableDao");
	
	/*=======================================================================*/
	
	@RequestMapping("/service-provider-login")
	public String serviceProviderLoginPage()		//retrun the service-provider-login page
	{
		return "service-provider-login";
	}
	
	@RequestMapping("/service-provider-register")
	public String serviceProviderRegisterPage()		//return the service-provider-register page
	{
		return "service-provider-register";
	}
	
	@RequestMapping("/service-provider-panel")
	public String serviceProviderPanelPage(Model model)		//return the service-provider-panel page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());	
		return "service-provider-panel";
	}
	
	@RequestMapping("/service-provider-about")
	public String serviceProviderAboutPage(Model model)		//return the service-provider-about page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());		
		return "service-provider-about";
	}
	
	@RequestMapping("/service-provider-contact")
	public String serviceProviderContactPage(Model model)		//return the service-provider-contact page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());		
		return "service-provider-contact";
	}
	
	@RequestMapping("/service-provider-pending")
	public String serviceProviderPendingPage(Model model)		//return the service-provider-pending page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());	
		model.addAttribute("cont",serviceProvider.getSerCont());
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders", orders);
		return "service-provider-pending";
	}
	
	@RequestMapping("/service-provider-approved")
	public String serviceProviderApprovedPage(Model model)		//return the service-provider-approved page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());
		model.addAttribute("cont",serviceProvider.getSerCont());
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders", orders);
		return "service-provider-approved";
	}
	
	@RequestMapping("/service-provider-disapproved")
	public String serviceProviderDisapprovedPage(Model model)		//return the service-provider-disapproved page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());
		model.addAttribute("cont",serviceProvider.getSerCont());
		
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders", orders);
		return "service-provider-disapproved";
	}
	
	@RequestMapping("/service-provider-todays-orders")
	public String serviceProviderTodaysOrdersPage(Model model)		//return the service-provider-todays-orders page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());
		
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders", orders);
		
		return "service-provider-todays-orders";
	}
	
	@RequestMapping("/service-provider-next-orders")
	public String serviceProviderNextOrders(Model model)		//return the service-provider-next-orders page
	{
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());

		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders", orders);
		return "service-provider-next-orders";
	}
	
	
	/*================================== Action =====================================*/
	
	@RequestMapping(path="/serviceProviderRegister", method=RequestMethod.POST)
	public String registerServiceProvider(HttpServletRequest request)		//action for service provider register
	{
		String serCont = request.getParameter("serCont");
		String serConPass = request.getParameter("serConPass");
		String serPass = request.getParameter("serPass");
		serviceProvider.setSerCont(serCont);
		serviceProvider.setSerStatus("Pending");
		serviceProvider.setSerName(request.getParameter("serName"));
		serviceProvider.setSerAge(Integer.parseInt(request.getParameter("serAge")));				
		serviceProvider.setSerArea(request.getParameter("serArea"));
		serviceProvider.setSerOpen(request.getParameter("serOpen"));
		serviceProvider.setSerClose(request.getParameter("serClose"));
		serviceProvider.setSerAdd(request.getParameter("serAdd"));
		serviceProvider.setSerPin(Integer.parseInt(request.getParameter("serPin")));
		serviceProvider.setSerCity(request.getParameter("serCity"));
		serviceProvider.setSerLat(request.getParameter("serLat"));
		serviceProvider.setSerLong(request.getParameter("serLong"));
		serviceProvider.setSerEmail(request.getParameter("serEmail"));
		serviceProvider.setSerPass(serPass);		
		serviceProvider.setSerGen(request.getParameter("serGen"));
		serviceProvider.setSerSer(request.getParameter("serSer"));
		serviceProvider.setSerCat(request.getParameter("serCat"));
		String i = serviceProviderDao.addServiceProvider(serviceProvider);
		if(i.equals(serCont) && serConPass.equals(serPass))
		{
			System.out.println("Service Provider Register Successfully...");
			return "service-provider-login";
		}
		else
		{
			System.out.println("Service Provider Register Failed...");
			return "service-provider-register";
		}
	}
	
	@RequestMapping(path="serviceProviderLogin",method=RequestMethod.POST)		//service provider login time
	public String serviceProviderLogin(Model model, HttpServletRequest request)
	{
		String cont = request.getParameter("cont");
		String password = request.getParameter("password");
		serviceProvider = serviceProviderDao.getOneServiceProvider(cont);
		model.addAttribute("name", serviceProvider.getSerName());
		model.addAttribute("email", serviceProvider.getSerEmail());
		model.addAttribute("city",serviceProvider.getSerCity());
		if(serviceProvider.getSerCont().equals(cont) && serviceProvider.getSerPass().equals(password) && serviceProvider.getSerStatus().equals("Approved"))
		{			
			model.addAttribute("serName",serviceProvider.getSerName());
			return "service-provider-panel";
		}
		else
		{
			return "service-provider-register";
		}
	}
	

	
	/*=======================================================================*/
	
	//service-order/7/disapprove/pending
	@RequestMapping(path="/service-order/{id}/{status}/{page}",method=RequestMethod.GET)
	public RedirectView changeStatus(@PathVariable("id") int id,@PathVariable("status") String status, @PathVariable("page") String page, HttpServletRequest request)
	{
		orderTable = orderTableDao.getOneOrder(id);
		System.out.println(status);
		System.out.println(page);
		System.out.println(id);
		if(status.equals("approve"))
		{
			orderTable.setServiceStatus("Approved");
		}
		else if(status.equals("disapprove"))
		{
			orderTable.setServiceStatus("Disapproved");
		}
		else
		{
			orderTableDao.cacelOrder(orderTable);
		}
		
		orderTableDao.updateOrder(orderTable);
		
		RedirectView redirectView = new RedirectView();
		if(page.equals("pending"))
		{
			redirectView.setUrl(request.getContextPath()+"/service-provider-pending");
		}
		else if(page.equals("approved"))
		{
			redirectView.setUrl(request.getContextPath()+"/service-provider-approved");
		}
		else
		{
			redirectView.setUrl(request.getContextPath()+"/service-provider-disapproved");
		}
		
		return redirectView;
			
	}
	
	
	
}
