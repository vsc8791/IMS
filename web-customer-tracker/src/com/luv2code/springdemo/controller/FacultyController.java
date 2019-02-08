package com.luv2code.springdemo.controller;

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

import com.luv2code.springdemo.entity.Faculty;
import com.luv2code.springdemo.service.FacultyService;

@Controller
@RequestMapping("/faculty")
public class FacultyController {
	
	//need to inject the customer dao
		@Autowired
		private FacultyService facultyService;
		
		@GetMapping("/list")
		public String listFaculty(Model theModel)
		{
			//get students from the dao using services
			List<Faculty> theFacultys=facultyService.getFacultys();		
			//add the students from the dao using services
			theModel.addAttribute("facultys",theFacultys);
			return "list-facultys";
		}
		
		
//	@GetMapping("/list-facultys-success")
//		public String listFacultySuccess(Model theModel)
//		{
//			//get students from the dao using services
//			List<Faculty> theFacultys=facultyService.getFacultys();		
//			//add the students from the dao using services
//			theModel.addAttribute("facultys",theFacultys);
//			return "list-facultys-success";
		
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			Faculty theFaculty=new Faculty(); 
			theModel.addAttribute("faculty",theFaculty);
			return "faculty-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					Faculty theFaculty=new Faculty(); 
					theModel.addAttribute("faculty",theFaculty);
					return "faculty-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveFacultyRegistration")
				public String saveRegistration(@ModelAttribute("faculty") Faculty theFaculty,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the student using our service
				try{	facultyService.saveFaculty(theFaculty);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/faculty/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/faculty/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveFaculty")
		public String saveFaculty(@ModelAttribute("faculty") Faculty theFaculty,final RedirectAttributes redirectAttrs )
		{
			//save the student using our service
			
			//save the student using our service
			try{	facultyService.saveFaculty(theFaculty);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/faculty/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/student/register";
		//	studentService.saveStudent(theStudent);
			return "redirect:/faculty/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("facultyId") int theId,Model theModel)
		{
			//get the student from the database
			Faculty theFaculty = facultyService.getFaculty(theId);
			//set student as a model attribute to pre-populate the form
			theModel.addAttribute("faculty",theFaculty);
			//send over to our form
			return "faculty-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteFaculty(@RequestParam("facultyId") int theId)
		{
			//delete the student
			facultyService.deleteFaculty(theId);
			
			return "redirect:/faculty/list";
			}
	

}
