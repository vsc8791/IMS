package com.bookstore.controller;

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

import com.bookstore.entity.Customer;
import com.bookstore.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the customer dao
		@Autowired
		private CustomerService customerService;
		
		@GetMapping("/list")
		public String listCustomer(Model theModel)
		{
			//get customers from the dao using services
			List<Customer> theCustomers=customerService.getCustomers();		
			//add the customers from the dao using services
			theModel.addAttribute("customers",theCustomers);
			return "list-customers";
		}
		
		@GetMapping("/login")
		
	private String validate(@RequestParam String uname,@RequestParam String pass,final RedirectAttributes redirectAttrs)
		{
			//Customer cust=new Customer();
			
			if(uname.equals("admin")&&pass.equals("admin"))
			{
				
				
				return "list-books";
				
			}
			redirectAttrs.addFlashAttribute("message","INVALID LOGIN");
			return "redirect:/customer/login";
		}
	/*	@GetMapping("/list-customers-success")
		public String listCustomerSuccess(Model theModel)
		{
			//get customers from the dao using services
			List<Customer> theCustomers=customerService.getCustomers();		
			//add the customers from the dao using services
			theModel.addAttribute("customers",theCustomers);
			return "list-customers-success";
		}*/
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			Customer theCustomer=new Customer(); 
			theModel.addAttribute("customer",theCustomer);
			return "customer-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					Customer theCustomer=new Customer(); 
					theModel.addAttribute("customer",theCustomer);
					return "customer-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveCustomerRegistration")
				public String saveRegistration(@ModelAttribute("customer") Customer theCustomer,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the customer using our service
				try{	
					customerService.saveCustomer(theCustomer);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/customer/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/customer/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveCustomer")
		public String saveCustomer(@ModelAttribute("customer") Customer theCustomer,final RedirectAttributes redirectAttrs )
		{
			//save the customer using our service
			
			//save the customer using our service
			try{	customerService.saveCustomer(theCustomer);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/customer/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/customer/register";
		//	customerService.saveCustomer(theCustomer);
			return "redirect:/customer/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel)
		{
			//get the customer from the database
			Customer theCustomer = customerService.getCustomer(theId);
			//set customer as a model attribute to pre-populate the form
			theModel.addAttribute("customer",theCustomer);
			//send over to our form
			return "customer-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam("customerId") int theId)
		{
			//delete the customer
			customerService.deleteCustomer(theId);
			
			return "redirect:/customer/list";
			}
	

}
