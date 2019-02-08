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

//import com.luv2code.springdemo.dao.BatchDAO;
import com.luv2code.springdemo.entity.Batch;
import com.luv2code.springdemo.service.BatchService;

@Controller
@RequestMapping("/batch")
public class BatchController {
	//need to inject the customer dao
	@Autowired
	private BatchService batchService;
	
	
	@GetMapping("/list")
	public String listBatchs(Model theModel)
	{
		//get customers from the dao using services
		List<Batch> theBatchs=batchService.getBatchs();		
		//add the customers from the dao using services
		theModel.addAttribute("batchs",theBatchs);
		return "list-batchs";
	}
	// this function just to show the form 
@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel )
{
	//create model attribute to bind form data
	Batch theBatch=new Batch(); 
	theModel.addAttribute("batch",theBatch);
	return "batch-form"; 
	}

//this function 
@PostMapping("/saveBatch")
public String saveBatch(@ModelAttribute("batch") Batch theBatch)
{
	//save the customer using our service
	batchService.saveBatch(theBatch);
	return "redirect:/batch/list";
}

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("batchId") int theId,Model theModel)
{
	//get the customer from the database
	Batch theBatch = batchService.getBatch(theId);
	//set customer as a model attribute to pre-populate the form
	theModel.addAttribute("batch",theBatch);
	//send over to our form
	return "batch-form";
}

@GetMapping("/delete")
public String deleteBatch(@RequestParam("batchId") int theId)
{
	//delete the customer
	batchService.deleteBatch(theId);
	
	return "redirect:/batch/list";
	}
}
