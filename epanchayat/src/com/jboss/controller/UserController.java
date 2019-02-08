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

import com.jboss.pojos.User;
import com.jboss.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	
	//need to inject the customer dao
		@Autowired
		private UserService userService;
		
		@GetMapping("/list")
		public String listUser(Model theModel)
		{
			//get users from the dao using services
			List<User> theUsers=userService.getUsers();		
			//add the users from the dao using services
			theModel.addAttribute("users",theUsers);
			return "list-users";
		}
		
		
	/*	@GetMapping("/list-users-success")
		public String listUserSuccess(Model theModel)
		{
			//get users from the dao using services
			List<User> theUsers=userService.getUsers();		
			//add the users from the dao using services
			theModel.addAttribute("users",theUsers);
			return "list-users-success";
		}*/
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			User theUser=new User(); 
			theModel.addAttribute("user",theUser);
			return "user-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					User theUser=new User(); 
					theModel.addAttribute("user",theUser);
					return "user-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveUserRegistration")
				public String saveRegistration(@ModelAttribute("user") User theUser,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the user using our service
				try{	
					userService.saveUser(theUser);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/user/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/user/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveUser")
		public String saveUser(@ModelAttribute("user") User theUser,final RedirectAttributes redirectAttrs )
		{
			//save the user using our service
			
			//save the user using our service
			try{	userService.saveUser(theUser);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/user/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/user/register";
		//	userService.saveUser(theUser);
			return "redirect:/user/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("userId") int theId,Model theModel)
		{
			//get the user from the database
			User theUser = userService.getUser(theId);
			//set user as a model attribute to pre-populate the form
			theModel.addAttribute("user",theUser);
			//send over to our form
			return "user-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteCustomer(@RequestParam("userId") int theId)
		{
			//delete the user
			userService.deleteUser(theId);
			
			return "redirect:/user/list";
			}
	

}
