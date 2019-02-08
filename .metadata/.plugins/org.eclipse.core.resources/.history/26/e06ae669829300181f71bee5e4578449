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

import com.jboss.pojos.BirthDetails;
import com.jboss.service.BirthDetailsService;



@Controller
@RequestMapping("/birthDetails")
public class BirthDetailsController {
	
	//need to inject the customer dao
		@Autowired
		private BirthDetailsService birthDetailsService;
		
		@GetMapping("/list")
		public String listBirthDetails(Model theModel)
		{
			//get birthDetailss from the dao using services
			List<BirthDetails> theBirthDetailss=birthDetailsService.getBirthDetailss();		
			//add the birthDetailss from the dao using services
			theModel.addAttribute("birthDetailss",theBirthDetailss);
			return "list-birthDetailss";
		}
		
		
	/*	@GetMapping("/list-birthDetailss-success")
		public String listBirthDetailsSuccess(Model theModel)
		{
			//get birthDetailss from the dao using services
			List<BirthDetails> theBirthDetailss=birthDetailsService.getBirthDetailss();		
			//add the birthDetailss from the dao using services
			theModel.addAttribute("birthDetailss",theBirthDetailss);
			return "list-birthDetailss-success";
		}*/
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			BirthDetails theBirthDetails=new BirthDetails(); 
			theModel.addAttribute("birthDetails",theBirthDetails);
			return "birthDetails-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					BirthDetails theBirthDetails=new BirthDetails(); 
					theModel.addAttribute("birthDetails",theBirthDetails);
					return "birthDetails-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveBirthDetailsRegistration")
				public String saveRegistration(@ModelAttribute("birthDetails") BirthDetails theBirthDetails,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the birthDetails using our service
				try{	
					birthDetailsService.saveBirthDetails(theBirthDetails);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/birthDetails/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/birthDetails/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveBirthDetails")
		public String saveBirthDetails(@ModelAttribute("birthDetails") BirthDetails theBirthDetails,final RedirectAttributes redirectAttrs )
		{
			//save the birthDetails using our service
			
			//save the birthDetails using our service
			try{	birthDetailsService.saveBirthDetails(theBirthDetails);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/birthDetails/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/birthDetails/register";
		//	birthDetailsService.saveBirthDetails(theBirthDetails);
			return "redirect:/birthDetails/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("birthDetailsId") int theId,Model theModel)
		{
			//get the birthDetails from the database
			BirthDetails theBirthDetails = birthDetailsService.getBirthDetails(theId);
			//set birthDetails as a model attribute to pre-populate the form
			theModel.addAttribute("birthDetails",theBirthDetails);
			//send over to our form
			return "birthDetails-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam("birthDetailsId") int theId)
		{
			//delete the birthDetails
			birthDetailsService.deleteBirthDetails(theId);
			
			return "redirect:/birthDetails/list";
			}
	

}
