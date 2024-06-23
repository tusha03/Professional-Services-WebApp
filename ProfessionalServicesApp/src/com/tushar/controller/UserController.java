package com.tushar.controller;

import java.util.ArrayList;
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
import com.tushar.dao.UserCustomerDao;
import com.tushar.model.OrderTable;
import com.tushar.model.ServiceProvider;
import com.tushar.model.UserCustomer;

@Controller
public class UserController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	UserCustomer userCustomer = (UserCustomer) context.getBean("userCustomer"); 
	UserCustomerDao userCustomerDao = (UserCustomerDao) context.getBean("userCustomerDao");
	ServiceProvider serviceProvider = (ServiceProvider) context.getBean("serviceProvider");
	ServiceProviderDao serviceProviderDao = (ServiceProviderDao) context.getBean("serviceProviderDao");
	OrderTable orderTable = (OrderTable) context.getBean("orderTable");
	OrderTableDao orderTableDao = (OrderTableDao) context.getBean("orderTableDao");
	/*=========================================================================*/
	
	@RequestMapping("/user-panel")
	public String userPanelPage(Model model)	//return user-panel page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());
		System.out.println("open user panel");
		return "user-panel";
	}
	
	@RequestMapping("/user-about")
	public String userAboutPage(Model model)	//return user-about page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());		
		return "user-about";
	}
	
	@RequestMapping("/user-contact")
	public String userContactPage(Model model)	//return user-contact page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());		
		return "user-contact";
	}
	
	@RequestMapping("/user-service")
	public String userServicePage(Model model)	//return user-service page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());
		List<ServiceProvider> serviceProviders = serviceProviderDao.getAllServiceProviders();
		model.addAttribute("serviceProviders", serviceProviders);
		return "user-service";
	}
	
	@RequestMapping("/user-pending-service")
	public String userPendingPage(Model model)	//return user-pending-service page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());		
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders",orders);
		return "user-pending-service";
	}
	
	@RequestMapping("/user-approve-service")
	public String userApprovePage(Model model)	//return user-approve-service page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());		
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders",orders);
		return "user-approve-service";
	}
	
	@RequestMapping("/user-disapprove-service")
	public String userDisapprovePage(Model model)	//return user-disapprove-service page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());		
		List<OrderTable> orders = orderTableDao.getAllOrder();
		model.addAttribute("orders",orders);
		return "user-disapprove-service";
	}
	
	@RequestMapping("/user-login")
	public String userLoginPage()	//return user-login page
	{
		return "user-login";
	}
	
	@RequestMapping("/user-register")
	public String userRegisterPage()	//return user-register page
	{
		return "user-register";
	}
	
	@RequestMapping("/service-detail")
	public String serviceDetailPage(Model model)		//return the service-detail page
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());		
		model.addAttribute("serviceProvider",serviceProvider);
		return "service-detail";
	}
	
	@RequestMapping("/user-order")
	public String userOderPage(Model model)		//return the user-order page 
	{
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());
		
		model.addAttribute("category", serviceProvider.getSerSer());
		return "user-order";
	}
	
	@RequestMapping("/error")
	public String errorPage()		//return error page
	{
		return "error";
	}
	/*=========================================================================*/
	
	@RequestMapping(path="/service-detail/{cont}", method=RequestMethod.GET)
	public RedirectView serviceDetail(@PathVariable("cont") String cont, HttpServletRequest request) //provide the service provider details 
	{
		serviceProvider = serviceProviderDao.getOneServiceProvider(cont);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/service-detail");
		return redirectView;
	}
	
	@RequestMapping(path="/user-order/{cont}",method=RequestMethod.GET)
	public RedirectView userOrder(@PathVariable("cont") String cont,HttpServletRequest request)		//user can order the service provider
	{
		serviceProvider = serviceProviderDao.getOneServiceProvider(cont);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/user-order");
		return redirectView;
	}
	
	@RequestMapping(path="/cancel-order/{id}", method=RequestMethod.GET)
	public RedirectView cancelOrder(@PathVariable("id") int id, HttpServletRequest request) //cancel the order
	{
		orderTable = orderTableDao.getOneOrder(id);
		orderTableDao.cacelOrder(orderTable);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/user-pending-service");
		return redirectView;
	}
	
	@RequestMapping(path="/delete-order/{id}", method=RequestMethod.GET)
	public RedirectView deleteOrder(@PathVariable("id") int id, HttpServletRequest request) //delete the order
	{
		orderTable = orderTableDao.getOneOrder(id);
		orderTableDao.cacelOrder(orderTable);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/user-disapprove-service");
		return redirectView;
	}
	/*===================================  Action ======================================*/
	
	@RequestMapping(path="/addUserCustomer", method=RequestMethod.POST)
	public String addUserCustomer(HttpServletRequest request)		//action of user register form
	{
		String cont = request.getParameter("cont");
		userCustomer.setCont(cont);
		userCustomer.setPass(request.getParameter("pass"));
		userCustomer.setDob(request.getParameter("dob"));
		userCustomer.setName(request.getParameter("name"));
		userCustomer.setAddress(request.getParameter("address"));
		userCustomer.setPin(request.getParameter("pin"));
		userCustomer.setArea(request.getParameter("area"));
		userCustomer.setCity(request.getParameter("city"));
		userCustomer.setEmail(request.getParameter("email"));
		userCustomer.setGen(request.getParameter("gen"));
		userCustomer.setLat(request.getParameter("lat"));
		userCustomer.setLog(request.getParameter("log"));
		String i = userCustomerDao.addUserCustromer(userCustomer);
		if(i.equals(cont))
		{
			System.out.println("user register successfully...");
			return "user-login";
		}
		else
		{
			System.out.println("user registration failed...");
			return "user-register";
		}
	}
	
	@RequestMapping(path="/userLogin", method=RequestMethod.POST)
	public String userLogin(Model model, HttpServletRequest request)		//user login action
	{		

		String cont = request.getParameter("cont");
		String pass = request.getParameter("pass");
		try
		{
			userCustomer = userCustomerDao.getOneCustomer(cont);
			model.addAttribute("userName", userCustomer.getName());
			model.addAttribute("userCity", userCustomer.getCity());
			model.addAttribute("userEmail", userCustomer.getEmail());		

			if(pass.equals(userCustomer.getPass()))
			{
				System.out.println("user login successfully...");
				return "user-panel";
			}
			else
			{
				System.out.println("user login failed...");
				return "user-login";
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("User Not Found");
			return "error";
		}
		
	}
	
	@RequestMapping(path="/placeOrder", method=RequestMethod.POST)
	public String placeOrder(Model model, HttpServletRequest request)
	{
		orderTable.setServiceDate(request.getParameter("date"));
		orderTable.setServiceTime(request.getParameter("time"));
		orderTable.setUserName(userCustomer.getName());
		orderTable.setUserCont(userCustomer.getCont());
		orderTable.setUserEmail(userCustomer.getEmail());
		orderTable.setUserAddress(userCustomer.getAddress());
		orderTable.setUserGen(userCustomer.getGen());
		orderTable.setServiceProviderCont(serviceProvider.getSerCont());
		orderTable.setServiceProviderName(serviceProvider.getSerName());
		orderTable.setServiceType(serviceProvider.getSerSer());
		orderTable.setServiceStatus("Pending");
		orderTableDao.addOrder(orderTable);
		
		List<ServiceProvider> serviceProviders = serviceProviderDao.getAllServiceProviders();
		model.addAttribute("serviceProviders", serviceProviders);
		return "user-service";
	}
	
	@RequestMapping(path="/searchService",method=RequestMethod.POST)		//service provider search services
	public String searchService(Model model,HttpServletRequest request)
	{
		String service = request.getParameter("service");
		String city = request.getParameter("city");
		model.addAttribute("userName", userCustomer.getName());
		model.addAttribute("userCity", userCustomer.getCity());
		model.addAttribute("userEmail", userCustomer.getEmail());
		
		List<ServiceProvider> serviceProvider = serviceProviderDao.getAllServiceProviders();
		List<ServiceProvider> serviceProviders = new ArrayList<ServiceProvider>();
		
		for(ServiceProvider services : serviceProvider)
		{
			if(services.getSerCat().equals(service) && services.getSerCity().equals(city))
			{
				serviceProviders.add(services);
			}
		}
		
		model.addAttribute("serviceProviders", serviceProviders);
		
		return "user-service";
	}
	
	
}
