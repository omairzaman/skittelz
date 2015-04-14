package com.skittelz.contact.controller;

import com.skittelz.contact.domain.Contact;
import com.skittelz.contact.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping("/index.html")
public class IndexController {

	@Resource(name="contactService")
	private ContactService contactService;
	
	@RequestMapping( method = RequestMethod.GET)
	 public ModelAndView index() {
		 ModelAndView mv = new ModelAndView("index");
	     //   mv.addObject("contact", new Contact());

	        return mv;	  
	 }
}

