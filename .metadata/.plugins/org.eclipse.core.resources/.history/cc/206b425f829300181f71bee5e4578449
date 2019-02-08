package com.jboss.controller;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jboss.pojos.Admin;
import com.jboss.service.AdminService;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	//need to inject the customer dao
		@Autowired
		private AdminService adminService;
		
		@GetMapping("/list")
		public String listAdmin(Model theModel)
		{
			//get admins from the dao using services
			List<Admin> theAdmins=adminService.getAdmins();		
			//add the admins from the dao using services
			theModel.addAttribute("admins",theAdmins);
			return "list-admins";
		}
		
		
	/*	@GetMapping("/list-admins-success")
		public String listAdminSuccess(Model theModel)
		{
			//get admins from the dao using services
			List<Admin> theAdmins=adminService.getAdmins();		
			//add the admins from the dao using services
			theModel.addAttribute("admins",theAdmins);
			return "list-admins-success";
		}*/
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			Admin theAdmin=new Admin(); 
			theModel.addAttribute("admin",theAdmin);
			return "admin-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					Admin theAdmin=new Admin(); 
					theModel.addAttribute("admin",theAdmin);
					return "admin-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveAdminRegistration")
				public String saveRegistration(@ModelAttribute("admin") Admin theAdmin,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the admin using our service
				try{	
					adminService.saveAdmin(theAdmin);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/admin/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/admin/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveAdmin")
		public String saveAdmin(@ModelAttribute("admin") Admin theAdmin,final RedirectAttributes redirectAttrs )
		{
			//save the admin using our service
			
			//save the admin using our service
			try{	adminService.saveAdmin(theAdmin);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/admin/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/admin/register";
		//	adminService.saveAdmin(theAdmin);
			return "redirect:/admin/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("adminId") int theId,Model theModel)
		{
			//get the admin from the database
			Admin theAdmin = adminService.getAdmin(theId);
			//set admin as a model attribute to pre-populate the form
			theModel.addAttribute("admin",theAdmin);
			//send over to our form
			return "admin-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam("adminId") int theId)
		{
			//delete the admin
			adminService.deleteAdmin(theId);
			
			return "redirect:/admin/list";
			}
	

}
