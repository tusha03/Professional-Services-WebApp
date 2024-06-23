package com.tushar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController
{

	@RequestMapping("/")
	public String indexPage()		//index strating page
	{
		return "index";
	}
	
	/*===============================================================*/
	
	@RequestMapping("/index")
	public String logout()		//logout and return the index home page
	{
		return "index";
	}
	
	
	@RequestMapping("/contact")
	public String contactPage()		//return the contact page to home panel
	{
		return "contact";
	}
	
	@RequestMapping("/team")
	public String tempPage()		//retrun the team page to home panel
	{
		return "team";
	}
	
	@RequestMapping("/about")
	public String aboutPage()	//return the about page to the home panel
	{
		return "about";
	}
	
	@RequestMapping("/service")
	public String servicePage()		//return the service page to the home panel
	{
		return "service";
	}
	
	/*============================Action===================================*/
	
	
	
	
}
