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

import com.bookstore.entity.Book;
import com.bookstore.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	//need to inject the book dao
		@Autowired
		private BookService bookService;
		
		@GetMapping("/list")
		public String listBook(Model theModel)
		{
			//get books from the dao using services
			List<Book> theBooks=bookService.getBooks();		
			//add the books from the dao using services
			theModel.addAttribute("books",theBooks);
			return "list-books";
		}
		
		
	/*	@GetMapping("/list-books-success")
		public String listBookSuccess(Model theModel)
		{
			//get books from the dao using services
			List<Book> theBooks=bookService.getBooks();		
			//add the books from the dao using services
			theModel.addAttribute("books",theBooks);
			return "list-books-success";
		}*/
		
		
		// this function just to show the form 
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel )
		{
			//create model attribute to bind form data
			Book theBook=new Book(); 
			theModel.addAttribute("book",theBook);
			return "book-form"; 
			}
		
		// this function just to show the register form 
				@GetMapping("/register")
				public String register(Model theModel )
				{
					//create model attribute to bind form data
					Book theBook=new Book(); 
					theModel.addAttribute("book",theBook);
					return "book-register-form"; 
					}
//this function is to store the registration details
				//this function for save and update the details
				@PostMapping("/saveBookRegistration")
				public String saveRegistration(@ModelAttribute("book") Book theBook,final RedirectAttributes redirectAttrs,Model map)
				{
					//save the book using our service
				try{	
					bookService.saveBook(theBook);
					
				}
				
				catch(ConstraintViolationException e)
				{
					redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
					return "redirect:/book/register";
					
				}
				
					redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
					return "redirect:/book/register";
				}
				
				
				
		//this function for save and update the details
		@PostMapping("/saveBook")
		public String saveBook(@ModelAttribute("book") Book theBook,final RedirectAttributes redirectAttrs )
		{
			//save the book using our service
			
			//save the book using our service
			try{	bookService.saveBook(theBook);
				
			}
			
			catch(ConstraintViolationException e)
			{
				redirectAttrs.addFlashAttribute("message", "ooppss !!! Already Exists ..");
				return "redirect:/book/list";
				
			}
			
				redirectAttrs.addFlashAttribute("message", "SUCCESSFULLY REGISTERED");
			//	return "redirect:/book/register";
		//	bookService.saveBook(theBook);
			return "redirect:/book/list";
		}

		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("bookId") int theId,Model theModel)
		{
			//get the book from the database
			Book theBook = bookService.getBook(theId);
			//set book as a model attribute to pre-populate the form
			theModel.addAttribute("book",theBook);
			//send over to our form
			return "book-form";
		}
		
		

		@GetMapping("/delete")
		public String deleteBook(@RequestParam("bookId") int theId)
		{
			//delete the book
			bookService.deleteBook(theId);
			
			return "redirect:/book/list";
			}
	

}
