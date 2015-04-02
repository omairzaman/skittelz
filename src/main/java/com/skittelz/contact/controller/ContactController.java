package com.skittelz.contact.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skittelz.contact.domain.Contact;
import com.skittelz.contact.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@Resource(name="contactService")
	private ContactService contactService;
	
	@RequestMapping( method = RequestMethod.GET)
	 public ModelAndView index() {
		 ModelAndView mv = new ModelAndView("contact");       
	        mv.addObject("contact", new Contact());

	        return mv;	  
	 }
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView addContact(@Valid @ModelAttribute("contact") 
	Contact contact, BindingResult result) {
		
		 ModelAndView mv = null;
	        
	        if( result.hasErrors()){
	            mv = new ModelAndView("contact");
	            mv.addObject("contact", contact);
	        }else{
	           // mv = new ModelAndView("redirect:default.do");
	        	mv = new ModelAndView("contact");
	        	contactService.createContact(contact);
	        }
	        
	        

	        return mv;
	}	
	
}

