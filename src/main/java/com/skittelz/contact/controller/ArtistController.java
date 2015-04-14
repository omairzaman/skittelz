package com.skittelz.contact.controller;

import com.skittelz.contact.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/artist.html")
public class ArtistController {

	@Resource(name="contactService")
	private ContactService contactService;
	
	@RequestMapping( method = RequestMethod.GET)
	 public ModelAndView index() {
		 ModelAndView mv = new ModelAndView("artist");
	     //   mv.addObject("contact", new Contact());

	        return mv;	  
	 }
}

