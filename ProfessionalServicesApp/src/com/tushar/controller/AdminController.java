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

import com.tushar.dao.ServiceProviderDao;
import com.tushar.model.ServiceProvider;

@Controller
public class AdminController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	ServiceProviderDao serviceProviderDao = (ServiceProviderDao) context.getBean("serviceProviderDao");
	ServiceProvider serviceProvider = (ServiceProvider) context.getBean("serviceProvider");
	
	String email ;
	
	@RequestMapping("/admin-services")
	public String adminPanelServicesPage(Model model)		//return the admin-servies page to admin panel
	{
		model.addAttribute("email",email);
		return "admin-services";
	}
	
	@RequestMapping("/admin-panel")
	public String adminPanelPage(Model model)		//retrun the admin-panel page to admin panel
	{
		model.addAttribute("email",email);
		return "admin-panel";
	}
	
	@RequestMapping("/admin-panel-about")
	public String adminPanelAbout(Model model)		//return the admin-pane-page
	{
		model.addAttribute("email",email);
		return "admin-panel-about";
	}
	
	
	@RequestMapping("/admin-login")		//admin login login page return 
	public String adminLoginPage()
	{
		return "admin-login";
	}
	
	@RequestMapping("/admin-service-details")
	public String adminServiceDetailsPage(Model model)
	{
		model.addAttribute("email",email);
		model.addAttribute("serviceProvider",serviceProvider);
		return "admin-service-details";
	}
	/*=====================================================================================*/
	
	@RequestMapping("/pending-service-providers")
	public String pendingServiceProviders(Model model)		//return pending-service-providers page to admin-panel
	{
		List<ServiceProvider> serviceProviders = serviceProviderDao.getAllServiceProviders();
		model.addAttribute("serviceProviders", serviceProviders);
		model.addAttribute("email",email);
		return "pending-service-providers";
	}
	
	@RequestMapping("/approved-service-providers")
	public String approvedServiceProviders(Model model)		//return approved-service-providers page to admin panel
	{
		List<ServiceProvider> serviceProviders = serviceProviderDao.getAllServiceProviders();
		model.addAttribute("serviceProviders", serviceProviders);
		model.addAttribute("email",email);
		return "approved-service-providers";
	}
	
	@RequestMapping("/disapprove-service-providers")
	public String disapprovedServiceProviders(Model model)		//return disapprove-service-providers page to admin panel
	{
		List<ServiceProvider> serviceProviders = serviceProviderDao.getAllServiceProviders();
		model.addAttribute("serviceProviders", serviceProviders);
		model.addAttribute("email",email);
		return "disapprove-service-providers";
	}
	
	

	/*==================================  =====================================*/
	
	 @RequestMapping(path="/approve/{serCont}",method=RequestMethod.GET)		//approve the status of service provider
	 public RedirectView approveServiceProvider(@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 serviceProvider.setSerStatus("Approved");
		 serviceProviderDao.updateServiceProvider(serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/pending-service-providers");
		 return redirectView;
	 }
	 
	 @RequestMapping(path="/disapprove/{serCont}",method=RequestMethod.GET)		//disapprove the status of service provider
	 public RedirectView disapproveServiceProvider(@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 serviceProvider.setSerStatus("Disapproved");
		 serviceProviderDao.updateServiceProvider(serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/approved-service-providers");
		 return redirectView;
	 }
	 
	 @RequestMapping(path="/approvedis/{serCont}",method=RequestMethod.GET)		//disapprove the status of service provider
	 public RedirectView approvedisServiceProvider(@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 serviceProvider.setSerStatus("Approved");
		 serviceProviderDao.updateServiceProvider(serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/disapprove-service-providers");
		 return redirectView;
	 }
	 
	 @RequestMapping(path="/delete/{serCont}",method=RequestMethod.GET)		//delete the of service provider
	 public RedirectView deleteServiceProvider(@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 serviceProviderDao.deleteServiceProvider(serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/disapprove-service-providers");
		 return redirectView;
	 }
	 
	 @RequestMapping(path="/approve-detail/{serCont}",method=RequestMethod.GET)		//detail the of service provider 
	 public RedirectView approveDetailServiceProvider(Model model,@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 model.addAttribute("serviceProvider",serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/admin-service-details");
		 return redirectView;
	 }
	 
	 @RequestMapping(path="/disapprove-detail/{serCont}",method=RequestMethod.GET)		//detail the of service provider 
	 public RedirectView disapproveDetailServiceProvider(@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 //model.addAttribute("serviceProvider",serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/admin-service-details");
		 return redirectView;
	 }
	 
	 @RequestMapping(path="/pending-detail/{serCont}",method=RequestMethod.GET)		//detail the of service provider 
	 public RedirectView pendingDetailServiceProvider(Model model,@PathVariable("serCont") String serCont, HttpServletRequest request)
	 {
		 serviceProvider = serviceProviderDao.getOneServiceProvider(serCont);
		 model.addAttribute("serviceProvider",serviceProvider);
		 RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/admin-service-details");
		 return redirectView;
	 }
	 
	 /*============================Action===================================*/
		
		@RequestMapping(path="adminLogin",method=RequestMethod.POST)
		public String adminLogin(Model model, HttpServletRequest request)		//admin login page action return the admin-panel page
		{
				email = request.getParameter("email");
				String password = request.getParameter("password");
				model.addAttribute("email",email);
			
			if(email.equals("admin@gmail.com") && password.equals("admin"))
			{
				System.out.println("Admin Login Successfully...");
				return "admin-panel";
			}
			else
			{
				System.out.println("Admin Login Fail...");
				return "admin-login";
			}
		}
		
	 
			
	
}
