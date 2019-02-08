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

//import com.luv2code.springdemo.dao.ResultDAO;
import com.luv2code.springdemo.entity.Result;
import com.luv2code.springdemo.service.ResultService;

@Controller
@RequestMapping("/result")
public class ResultController {
	//need to inject the customer dao
	@Autowired
	private ResultService resultService;
	
	
	@GetMapping("/list")
	public String listResults(Model theModel)
	{
		//get customers from the dao using services
		List<Result> theResults=resultService.getResults();		
		//add the customers from the dao using services
		theModel.addAttribute("results",theResults);
		return "list-results";
	}
	// this function just to show the form 
@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel )
{
	//create model attribute to bind form data
	Result theResult=new Result(); 
	theModel.addAttribute("result",theResult);
	return "result-form"; 
	}

//this function 
@PostMapping("/saveResult")
public String saveResult(@ModelAttribute("result") Result theResult)
{
	//save the customer using our service
	resultService.saveResult(theResult);
	return "redirect:/result/list";
}

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("resultId") int theId,Model theModel)
{
	//get the customer from the database
	Result theResult = resultService.getResult(theId);
	//set customer as a model attribute to pre-populate the form
	theModel.addAttribute("result",theResult);
	//send over to our form
	return "result-form";
}

@GetMapping("/delete")
public String deleteResult(@RequestParam("resultId") int theId)
{
	//delete the customer
	resultService.deleteResult(theId);
	
	return "redirect:/result/list";
	}
}
