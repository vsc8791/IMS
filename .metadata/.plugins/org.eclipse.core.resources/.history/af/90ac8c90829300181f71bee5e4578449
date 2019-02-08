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

import com.jboss.pojos.DeathDetails;
import com.jboss.service.DeathDetailsService;



@Controller
@RequestMapping("/deathDetails")
public class DeathDetailsController {
	
	//need to inject the customer dao
		@Autowired
		private DeathDetailsService deathDetailsService;
		
		@GetMapping("/list")
		public String listDeathDetails(Model theModel)
		{
			//get deathDetailss from the dao using services
			List<DeathDetails> theDeathDetailss=deathDetailsService.getDeathDetailss();		
			//add the deathDetailss from the dao using services
			theModel.addAttribute("deathDetailss",theDeathDetailss);
			return "list-deathDetailss";
		}
		
		
	/*	@GetMapping("/list-deathDetailss-success")
		public String listDeathDetailsSuccess(Model theModel)
		{
			//get deathDetailss from the dao using services
			List<DeathDetails> theDeathDetailss=deathDetailsService.getDeathDetailss();		
			//add the deathDetailss from the dao using services
			theModel.addAttribute("deathDetailss",theDeathDetailss);
			return "list-deathDetailss-success";
		}*/
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			DeathDetails theDeathDetails=new DeathDetails(); 
			theModel.addAttribute("deathDetails",theDeathDetails);
			return "deathDetails-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					DeathDetails theDeathDetails=new DeathDetails(); 
					theModel.addAttribute("deathDetails",theDeathDetails);
					return "deathDetails-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveDeathDetailsRegistration")
				public String saveRegistration(@ModelAttribute("deathDetails") DeathDetails theDeathDetails,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the deathDetails using our service
				try{	
					deathDetailsService.saveDeathDetails(theDeathDetails);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/deathDetails/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/deathDetails/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveDeathDetails")
		public String saveDeathDetails(@ModelAttribute("deathDetails") DeathDetails theDeathDetails,final RedirectAttributes redirectAttrs )
		{
			//save the deathDetails using our service
			
			//save the deathDetails using our service
			try{	deathDetailsService.saveDeathDetails(theDeathDetails);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/deathDetails/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/deathDetails/register";
		//	deathDetailsService.saveDeathDetails(theDeathDetails);
			return "redirect:/deathDetails/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("deathDetailsId") int theId,Model theModel)
		{
			//get the deathDetails from the database
			DeathDetails theDeathDetails = deathDetailsService.getDeathDetails(theId);
			//set deathDetails as a model attribute to pre-populate the form
			theModel.addAttribute("deathDetails",theDeathDetails);
			//send over to our form
			return "deathDetails-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam("deathDetailsId") int theId)
		{
			//delete the deathDetails
			deathDetailsService.deleteDeathDetails(theId);
			
			return "redirect:/deathDetails/list";
			}
	

}
