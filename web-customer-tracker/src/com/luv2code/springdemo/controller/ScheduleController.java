package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.luv2code.springdemo.dao.ScheduleDAO;
import com.luv2code.springdemo.entity.Schedule;
import com.luv2code.springdemo.service.ScheduleService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
	//need to inject the customer dao
	@Autowired
	private ScheduleService scheduleService;
	
	
	@GetMapping("/list")
	public String listSchedules(Model theModel)
	{
		//get customers from the dao using services
		List<Schedule> theSchedules=scheduleService.getSchedules();		
		//add the customers from the dao using services
		theModel.addAttribute("schedules",theSchedules);
		return "list-schedules";
	}
	// this function just to show the form 
@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel )
{
	//create model attribute to bind form data
	Schedule theSchedule=new Schedule(); 
	theModel.addAttribute("schedule",theSchedule);
	return "schedule-form"; 
	}

//this function 
@PostMapping("/saveSchedule")
public String saveSchedule(@ModelAttribute("schedule") Schedule theSchedule)
{
	//save the customer using our service
	scheduleService.saveSchedule(theSchedule);
	return "redirect:/schedule/list";
}

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("scheduleId") int theId,Model theModel)
{
	//get the customer from the database
	Schedule theSchedule = scheduleService.getSchedule(theId);
	//set customer as a model attribute to pre-populate the form
	theModel.addAttribute("schedule",theSchedule);
	//send over to our form
	return "schedule-form";
}

@GetMapping("/delete")
public String deleteSchedule(@RequestParam("scheduleId") int theId)
{
	//delete the customer
	scheduleService.deleteSchedule(theId);
	
	return "redirect:/schedule/list";
	}
}